package br.jogo.personagem;

public class Elfo extends Personagem {
    private int afinidadeNatural;
    
    public Elfo(String nome) {
        // Elfo: mais inteligência, mana e sorte
        super(nome, 5, 10, 14, 10, 11, 11, 14, 12);
        this.afinidadeNatural = 15;
    }
    
    @Override
    public String habilidadeEspecial() {
        int cura = (int)(this.afinidadeNatural * 0.8);
        this.curar(cura);
        return this.nome + " usa Comunhão com a Natureza, recuperando " + cura + " pontos de vida!";
    }
    
    @Override
    public String descricaoRaca() {
        return "Elfo: Raça antiga com forte conexão com a natureza e a magia, vivem nas raízes da Árvore do Mundo.";
    }
}
