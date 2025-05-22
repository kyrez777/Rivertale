package br.jogo.habilidade;

// Classe abstrata Habilidade
public abstract class Habilidade {
    protected String nome;
    protected String descricao;
    protected int custoEnergia;
    protected int nivel;
    
    public Habilidade(String nome, String descricao, int custoEnergia, int nivel) {
        this.nome = nome;
        this.descricao = descricao;
        this.custoEnergia = custoEnergia;
        this.nivel = nivel;
    }
    
    public void evoluir() {
        this.nivel += 1;
    }
    
    // Método abstrato que deve ser implementado pelas classes filhas
    public abstract String usar(br.jogo.personagem.Personagem usuario, br.jogo.personagem.Personagem alvo);
    
    // Getters e Setters
    public String getNome() {
        return nome;
    }
    
    public String getDescricao() {
        return descricao;
    }
    
    public int getCustoEnergia() {
        return custoEnergia;
    }
    
    public int getNivel() {
        return nivel;
    }
}
