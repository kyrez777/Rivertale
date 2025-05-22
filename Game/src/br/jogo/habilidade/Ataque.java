package br.jogo.habilidade;

import br.jogo.personagem.Personagem;

public class Ataque extends Habilidade {
    private int danoBase;
    
    public Ataque(String nome, String descricao, int custoEnergia, int danoBase, int nivel) {
        super(nome, descricao, custoEnergia, nivel);
        this.danoBase = danoBase;
    }
    
    @Override
    public String usar(Personagem usuario, Personagem alvo) {
        int dano = calcularDano(usuario);
        int danoReal = alvo.receberDano(dano);
        
        return usuario.getNome() + " usa " + this.nome + " contra " + alvo.getNome() + 
               " causando " + danoReal + " de dano!";
    }
    
    private int calcularDano(Personagem usuario) {
        return this.danoBase + (int)(usuario.getForca() * 0.8) + (this.nivel * 5);
    }
}
