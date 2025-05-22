package br.jogo.chama;

// Classe abstrata Chama
public abstract class Chama {
    protected String nome;
    protected double poderBase;
    protected int nivelCorrupcao;
    protected int nivel;
    
    public Chama(String nome, double poderBase, int nivelCorrupcao) {
        this.nome = nome;
        this.poderBase = poderBase;
        this.nivelCorrupcao = nivelCorrupcao;
        this.nivel = 1;
    }
    
    public int aumentarCorrupcao(int quantidade) {
        this.nivelCorrupcao += quantidade;
        return this.nivelCorrupcao;
    }
    
    public double calcularPoderAtual() {
        return this.poderBase * (1 + (this.nivel * 0.2)) * (1 + (this.nivelCorrupcao * 0.05));
    }
    
    public void evoluir() {
        this.nivel += 1;
        this.poderBase += 10;
    }
    
    // Métodos abstratos que devem ser implementados pelas classes filhas
    public abstract String poderEspecial();
    public abstract String descricao();
    
    // Getters e Setters
    public String getNome() {
        return nome;
    }
    
    public double getPoderBase() {
        return poderBase;
    }
    
    public int getNivelCorrupcao() {
        return nivelCorrupcao;
    }
    
    public void setNivelCorrupcao(int nivelCorrupcao) {
        this.nivelCorrupcao = nivelCorrupcao;
    }
    
    public int getNivel() {
        return nivel;
    }
}
