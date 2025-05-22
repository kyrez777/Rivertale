package br.jogo.habilidade;

import br.jogo.personagem.Personagem;

public class Defesa extends Habilidade {
    private int bonusDefesa;
    private int duracao;
    
    public Defesa(String nome, String descricao, int custoEnergia, int bonusDefesa, int duracao, int nivel) {
        super(nome, descricao, custoEnergia, nivel);
        this.bonusDefesa = bonusDefesa;
        this.duracao = duracao;
    }
    
    @Override
    public String usar(Personagem usuario, Personagem alvo) {
        int bonus = calcularBonus(usuario);
        
        return usuario.getNome() + " usa " + this.nome + " ganhando +" + bonus + 
               " de defesa por " + this.duracao + " turnos!";
    }
    
    private int calcularBonus(Personagem usuario) {
        return this.bonusDefesa + (int)(usuario.getVidaMaxima() * 0.05) + (this.nivel * 3);
    }
}
