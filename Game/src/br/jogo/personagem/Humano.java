package br.jogo.personagem;

public class Humano extends Personagem {
    private int adaptabilidade;
    
    public Humano(String nome) {
        // Humano: bem balanceado
        super(nome, 4, 11, 9, 12, 13, 13, 11, 9);
        this.adaptabilidade = 10;
    }
    
    @Override
    public String habilidadeEspecial() {
        int bonusForca = (int)(this.forca * 0.5);
        return this.nome + " usa Determinação, ganhando +" + bonusForca + " de força temporária!";
    }
    
    @Override
    public String descricaoRaca() {
        return "Humano: Raça versátil e adaptável, com grande determinação e vontade de sobreviver.";
    }
}
