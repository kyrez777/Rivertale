package br.jogo.personagem;

public class MeioElfo extends Personagem {
    private int adaptabilidade;
    private int afinidadeNatural;
    
    public MeioElfo(String nome) {
        // Meio-Elfo: mistura de humano e elfo
        super(nome, 4, 11, 12, 11, 12, 12, 13, 10);
        this.adaptabilidade = 8;
        this.afinidadeNatural = 8;
    }
    
    @Override
    public String habilidadeEspecial() {
        int bonusAgilidade = (int)(this.destreza * 0.4);
        int cura = (int)(this.afinidadeNatural * 0.5);
        this.curar(cura);
        return this.nome + " usa Herança Dual, recuperando " + cura + " pontos de vida e ganhando +" + bonusAgilidade + " de agilidade temporária!";
    }
    
    @Override
    public String descricaoRaca() {
        return "Meio-Elfo: Nascido da união entre humanos e elfos, combina a adaptabilidade humana com a afinidade natural élfica.";
    }
}
