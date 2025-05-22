package br.jogo.personagem;

public class Orc extends Personagem {
    private int furia;
    
    public Orc(String nome) {
        // Orc: mais força e vitalidade
        super(nome, 4, 15, 7, 12, 16, 10, 8, 8);
        this.furia = 12;
    }
    
    @Override
    public String habilidadeEspecial() {
        int bonusDano = this.furia + (int)(this.forca * 0.3);
        return this.nome + " usa Fúria Selvagem, causando +" + bonusDano + " de dano no próximo ataque!";
    }
    
    @Override
    public String descricaoRaca() {
        return "Orc: Raça forte e resistente, com grande capacidade de combate, vivem nas florestas densas.";
    }
}
