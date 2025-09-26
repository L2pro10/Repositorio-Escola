package pack;

import javax.swing.*;
import java.awt.*;

public class Casa {
    private int numero;
    private String tipo; // "normal", "presa", "predador"
    private String nomeEntidade;
    private Color cor;
    
    // Cores padrão
    public static final Color COR_NORMAL = new Color(200, 230, 200);
    public static final Color COR_PRESA = new Color(100, 200, 100);
    public static final Color COR_PREDADOR = new Color(220, 100, 100);
    public static final Color COR_JOGADOR = new Color(70, 130, 180);
    
    public Casa(int numero) {
        this.numero = numero;
        this.tipo = "normal";
        this.nomeEntidade = "";
        this.cor = COR_NORMAL;
    }
    
    public Casa(int numero, String tipo, String nomeEntidade) {
        this.numero = numero;
        this.tipo = tipo;
        this.nomeEntidade = nomeEntidade;
        this.cor = tipo.equals("presa") ? COR_PRESA : COR_PREDADOR;
    }
    
    public JPanel criarPanel() {
        JPanel casaPanel = new JPanel(new BorderLayout());
        casaPanel.setPreferredSize(new Dimension(120, 120));
        casaPanel.setBackground(cor);
        casaPanel.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 2));
        
        JLabel numeroLabel = new JLabel(String.valueOf(numero), SwingConstants.CENTER);
        numeroLabel.setFont(new Font("Arial", Font.BOLD, 16));
        casaPanel.add(numeroLabel, BorderLayout.NORTH);
        
        if (!nomeEntidade.isEmpty()) {
            JLabel entidadeLabel = new JLabel(nomeEntidade, SwingConstants.CENTER);
            entidadeLabel.setFont(new Font("Arial", Font.BOLD, 12));
            if (tipo.equals("predador")) {
                entidadeLabel.setForeground(Color.WHITE);
            }
            casaPanel.add(entidadeLabel, BorderLayout.CENTER);
        }
        
        return casaPanel;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public String getNomeEntidade() {
        return nomeEntidade;
    }
    
    public int getNumero() {
        return numero;
    }
}