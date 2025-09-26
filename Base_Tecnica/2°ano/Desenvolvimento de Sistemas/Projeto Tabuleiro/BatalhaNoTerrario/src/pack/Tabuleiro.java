package pack;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class Tabuleiro {
    private ArrayList<Casa> casas;
    private HashMap<Integer, String> posicoesPredadores;
    private ArrayList<Integer> posicoesPresas;
    private Random random;
    
    // Listas de nomes de presas e predadores
    private final String[] PRESAS = {"Mosca", "Gafanhoto", "Lagarta", "Aranha", "Grilo", 
                                   "Cigarra", "Formiga", "Pulgão", "Besouro", "Abelha"};
    private final String[] PREDADORES = {"Cobra", "Macaco", "Morcego", "Pardal", "Planta Carnívora", 
                                       "Rã", "Sapo", "Tarântula", "Vespa", "Pássaro"};
    
    public Tabuleiro() {
        this.casas = new ArrayList<>();
        this.posicoesPresas = new ArrayList<>();
        this.posicoesPredadores = new HashMap<>();
        this.random = new Random();
        inicializarTabuleiro();
    }
    
    private void inicializarTabuleiro() {
        // Cria casas normais
        for (int i = 1; i <= 30; i++) {
            casas.add(new Casa(i));
        }
        
        // Adiciona presas
        List<String> presasDisponiveis = new ArrayList<>();
        Collections.addAll(presasDisponiveis, PRESAS);
        Collections.shuffle(presasDisponiveis);
        
        while (posicoesPresas.size() < 10) {
            int posicao = random.nextInt(29) + 2; // Posições de 2 a 30
            if (!posicoesPresas.contains(posicao) && !posicoesPredadores.containsKey(posicao)) {
                posicoesPresas.add(posicao);
                String nomePresa = presasDisponiveis.get(posicoesPresas.size() - 1);
                casas.set(posicao - 1, new Casa(posicao, "presa", nomePresa));
            }
        }
        
        // Adiciona predadores (número fixo de 5)
        List<String> predadoresDisponiveis = new ArrayList<>();
        Collections.addAll(predadoresDisponiveis, PREDADORES);
        Collections.shuffle(predadoresDisponiveis);
        
        for (int i = 0; i < 5 && i < predadoresDisponiveis.size(); i++) {
            int tentativas = 0;
            boolean posicaoValida = false;
            
            while (!posicaoValida && tentativas < 50) {
                int posicao = random.nextInt(29) + 2; // Posições de 2 a 30
                if (!posicoesPresas.contains(posicao) && !posicoesPredadores.containsKey(posicao)) {
                    posicoesPredadores.put(posicao, predadoresDisponiveis.get(i));
                    casas.set(posicao - 1, new Casa(posicao, "predador", predadoresDisponiveis.get(i)));
                    posicaoValida = true;
                }
                tentativas++;
            }
        }
    }
    
    public Casa getCasa(int numero) {
        if (numero >= 1 && numero <= casas.size()) {
            return casas.get(numero - 1);
        }
        return null;
    }
    
    public boolean isPresa(int posicao) {
        return posicoesPresas.contains(posicao);
    }
    
    public boolean isPredador(int posicao) {
        return posicoesPredadores.containsKey(posicao);
    }
    
    public String getNomePresa(int posicao) {
        if (isPresa(posicao)) {
            int index = posicoesPresas.indexOf(posicao);
            return PRESAS[index % PRESAS.length];
        }
        return "";
    }
    
    public String getNomePredador(int posicao) {
        return posicoesPredadores.get(posicao);
    }
    
    public void removerPresa(int posicao) {
        posicoesPresas.remove(Integer.valueOf(posicao));
        casas.set(posicao - 1, new Casa(posicao));
    }
    
    public JPanel criarPainelTabuleiro() {
        JPanel tabuleiroPanel = new JPanel(new GridLayout(5, 6, 10, 10));
        tabuleiroPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        tabuleiroPanel.setBackground(new Color(240, 250, 240));
        
        for (Casa casa : casas) {
            tabuleiroPanel.add(casa.criarPanel());
        }
        
        return tabuleiroPanel;
    }
}