package pack;

public class Jogador {
    private int posicao;
    private int pontuacao;
    private String nome;
    
    public Jogador(String nome) {
        this.nome = nome;
        this.posicao = 1;
        this.pontuacao = 0;
    }
    
    public int getPosicao() {
        return posicao;
    }
    
    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }
    
    public int getPontuacao() {
        return pontuacao;
    }
    
    public void adicionarPontos(int pontos) {
        this.pontuacao += pontos;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void reset() {
        this.posicao = 1;
        this.pontuacao = 0;
    }
}