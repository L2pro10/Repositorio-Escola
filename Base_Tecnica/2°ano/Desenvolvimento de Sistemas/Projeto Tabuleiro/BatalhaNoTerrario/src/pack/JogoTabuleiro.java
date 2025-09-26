package pack;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class JogoTabuleiro extends JFrame {
    private Jogador jogador;
    private JPanel tabuleiroPanel;
    private JLabel statusLabel;
    private JLabel pontuacaoLabel;
    private JButton rolarDadoButton;
    private JButton voltarButton;
    private boolean jogoAtivo;
    private Tabuleiro tabuleiro;
    private Random random;
    
    public JogoTabuleiro() {
        this.jogador = new Jogador("LOUVA-DEUS");
        this.tabuleiro = new Tabuleiro();
        this.jogoAtivo = true;
        this.random = new Random();
        
        setTitle("Batalha no Terrário - Jogo da Cadeia Alimentar");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setUndecorated(true);
        
        // Configura o layout principal
        setLayout(new BorderLayout());
        
        // Painel de controle
        JPanel controlePanel = criarPainelControle();
        add(controlePanel, BorderLayout.NORTH);
        
        // Inicializa o tabuleiro
        inicializarTabuleiro();
        
        setVisible(true);
    }
    
    private JPanel criarPainelControle() {
        JPanel controlePanel = new JPanel(new FlowLayout());
        controlePanel.setBackground(new Color(230, 240, 230));
        controlePanel.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        
        // Botão para rolar o dado
        rolarDadoButton = new JButton("Rolar Dado");
        rolarDadoButton.setFont(new Font("Arial", Font.BOLD, 16));
        rolarDadoButton.addActionListener(e -> rolarDado());
        controlePanel.add(rolarDadoButton);
        
        // Botão para voltar ao menu
        voltarButton = new JButton("Voltar ao Menu");
        voltarButton.setFont(new Font("Arial", Font.BOLD, 16));
        voltarButton.addActionListener(e -> {
            dispose();
            new TelaInicio();
        });
        controlePanel.add(voltarButton);
        
        // Label de pontuação
        pontuacaoLabel = new JLabel("Pontuação: 0");
        pontuacaoLabel.setFont(new Font("Arial", Font.BOLD, 16));
        controlePanel.add(pontuacaoLabel);
        
        // Label de status
        statusLabel = new JLabel("Bem-vindo! Clique em 'Rolar Dado' para começar.");
        statusLabel.setFont(new Font("Arial", Font.BOLD, 16));
        controlePanel.add(statusLabel);
        
        return controlePanel;
    }
    
    private void inicializarTabuleiro() {
        tabuleiroPanel = tabuleiro.criarPainelTabuleiro();
        add(tabuleiroPanel, BorderLayout.CENTER);
        atualizarTabuleiro();
    }
    
    private void rolarDado() {
        if (!jogoAtivo) return;
        
        // Desabilita o botão temporariamente para evitar múltiplos cliques
        rolarDadoButton.setEnabled(false);
        
        // Animação simples de rolagem de dado (apenas texto)
        Timer animationTimer = new Timer(100, new ActionListener() {
            int count = 0;
            @Override
            public void actionPerformed(ActionEvent e) {
                if (count < 5) {
                    // Mostra valores aleatórios rapidamente para simular rolagem
                    int tempValor = random.nextInt(6) + 1;
                    statusLabel.setText("Rolando dado: " + tempValor);
                    count++;
                } else {
                    // Para a animação e mostra o valor final
                    ((Timer)e.getSource()).stop();
                    int resultado = random.nextInt(6) + 1;
                    statusLabel.setText("Dado rolado: " + resultado);
                    moverJogador(resultado);
                    rolarDadoButton.setEnabled(true);
                }
            }
        });
        animationTimer.start();
    }
    
    private void moverJogador(int passos) {
        // Remove o jogador da posição atual
        int posicaoAnterior = jogador.getPosicao();
        jogador.setPosicao(jogador.getPosicao() + passos);
        
        // Verifica se o jogador chegou ao final
        if (jogador.getPosicao() >= 30) {
            jogador.setPosicao(30);
            JOptionPane.showMessageDialog(this, 
                "Parabéns! Você completou o jogo!\nPontuação final: " + jogador.getPontuacao(),
                "Fim de Jogo", JOptionPane.INFORMATION_MESSAGE);
            rolarDadoButton.setEnabled(false);
            jogoAtivo = false;
        }
        
        // Verifica eventos na nova posição
        verificarEvento();
        
        // Atualiza a exibição do tabuleiro
        atualizarTabuleiro();
    }
    
    private void verificarEvento() {
        int posicao = jogador.getPosicao();
        
        if (tabuleiro.isPresa(posicao)) {
            String nomePresa = tabuleiro.getNomePresa(posicao);
            jogador.adicionarPontos(10);
            pontuacaoLabel.setText("Pontuação: " + jogador.getPontuacao());
            statusLabel.setText("Você devorou um(a) " + nomePresa + "! +10 pontos");
            tabuleiro.removerPresa(posicao);
        } else if (tabuleiro.isPredador(posicao)) {
            String nomePredador = tabuleiro.getNomePredador(posicao);
            
            // Jogador foi devorado por um predador - GAME OVER
            jogoAtivo = false;
            rolarDadoButton.setEnabled(false);
            
            // Mostra mensagem de Game Over
            int opcao = JOptionPane.showOptionDialog(this,
                "Você foi devorado por um(a) " + nomePredador + "!\n\nPontuação final: " + jogador.getPontuacao() + 
                "\n\nDeseja jogar novamente?",
                "Game Over - Você foi devorado!",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.ERROR_MESSAGE,
                null,
                new Object[]{"Jogar Novamente", "Voltar ao Menu"},
                "Jogar Novamente");
            
            if (opcao == JOptionPane.YES_OPTION) {
                // Reinicia o jogo
                dispose();
                new JogoTabuleiro();
            } else {
                // Volta para o menu principal
                dispose();
                new TelaInicio();
            }
        }
    }
    
    private void atualizarTabuleiro() {
        tabuleiroPanel.removeAll();
        
        for (int i = 1; i <= 30; i++) {
            Casa casa = tabuleiro.getCasa(i);
            JPanel casaPanel = casa.criarPanel();
            
            // Destaca a casa do jogador
            if (i == jogador.getPosicao()) {
                casaPanel.setBackground(Casa.COR_JOGADOR);
                JLabel jogadorLabel = new JLabel(jogador.getNome(), SwingConstants.CENTER);
                jogadorLabel.setFont(new Font("Arial", Font.BOLD, 12));
                jogadorLabel.setForeground(Color.WHITE);
                casaPanel.add(jogadorLabel, BorderLayout.CENTER);
            }
            
            tabuleiroPanel.add(casaPanel);
        }
        
        tabuleiroPanel.revalidate();
        tabuleiroPanel.repaint();
    }
}