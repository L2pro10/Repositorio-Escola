package pack;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaInicio extends JFrame {
    public TelaInicio() {
        setTitle("Batalha no Terrário - Jogo da Cadeia Alimentar");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);
        
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBackground(new Color(230, 240, 230));
        
        // Título
        JLabel tituloLabel = new JLabel("Batalha no Terrário", SwingConstants.CENTER);
        tituloLabel.setFont(new Font("Arial", Font.BOLD, 36));
        tituloLabel.setForeground(new Color(70, 130, 180));
        mainPanel.add(tituloLabel, BorderLayout.NORTH);
        
        // Painel central com imagem e botão
        JPanel centerPanel = new JPanel(new BorderLayout());
        centerPanel.setBackground(new Color(230, 240, 230));
        
        // Imagem (placeholder)
        JLabel imageLabel = new JLabel(new ImageIcon("inseto.png")); // Substitua pelo caminho real
        imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
        centerPanel.add(imageLabel, BorderLayout.CENTER);
        
        // Botão iniciar
        JButton iniciarButton = new JButton("Iniciar Jogo");
        iniciarButton.setFont(new Font("Arial", Font.BOLD, 24));
        iniciarButton.setBackground(new Color(70, 130, 180));
        iniciarButton.setForeground(Color.WHITE);
        iniciarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new JogoTabuleiro();
            }
        });
        
        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(new Color(230, 240, 230));
        buttonPanel.add(iniciarButton);
        centerPanel.add(buttonPanel, BorderLayout.SOUTH);
        
        mainPanel.add(centerPanel, BorderLayout.CENTER);
        
        add(mainPanel);
        setVisible(true);
    }
}