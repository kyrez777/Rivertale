package br.jogo.habilidade;

import br.jogo.personagem.Personagem;

public class Corrupcao extends Habilidade {
    private int poderBase;
    private int aumentoCorrupcao;
    
    public Corrupcao(String nome, String descricao, int custoEnergia, int poderBase, int aumentoCorrupcao, int nivel) {
        super(nome, descricao, custoEnergia, nivel);
        this.poderBase = poderBase;
        this.aumentoCorrupcao = aumentoCorrupcao;
    }
    
    @Override
    public String usar(Personagem usuario, Personagem alvo) {
        int poder = (int)(this.poderBase * (1 + (usuario.getCorrupcao() * 0.1)) + (this.nivel * 10));
        int danoReal = alvo.receberDano(poder);
        
        // Aumenta a corrupção do usuário
        usuario.aumentarCorrupcao(this.aumentoCorrupcao);
        
        return usuario.getNome() + " canaliza o poder do abismo em " + this.nome + 
               " contra " + alvo.getNome() + " causando " + danoReal + 
               " de dano e aumentando sua própria corrupção em " + this.aumentoCorrupcao + "!";
    }
}
