package br.jogo.personagem;

public class Anao extends Personagem {
    private int resistencia;
    
    public Anao(String nome) {
        // Anão: mais força e vigor
        super(nome, 3, 12, 8, 14, 15, 10, 9, 8);
        this.resistencia = 15;
    }
    
    @Override
    public String habilidadeEspecial() {
        int bonusDefesa = (int)(this.resistencia * 0.7);
        return this.nome + " usa Resistência de Pedra, ganhando +" + bonusDefesa + " de defesa temporária!";
    }
    
    @Override
    public String descricaoRaca() {
        return "Anão: Raça robusta e resistente, especializada em forja e mineração, vivem nas profundezas das montanhas.";
    }
}
