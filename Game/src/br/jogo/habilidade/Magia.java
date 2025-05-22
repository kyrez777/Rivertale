package br.jogo.habilidade;

import br.jogo.personagem.Personagem;

public class Magia extends Habilidade {
    private int poderBase;
    private String tipo;
    
    public Magia(String nome, String descricao, int custoEnergia, int poderBase, String tipo, int nivel) {
        super(nome, descricao, custoEnergia, nivel);
        this.poderBase = poderBase;
        this.tipo = tipo;
    }
    
    @Override
    public String usar(Personagem usuario, Personagem alvo) {
        int poder = calcularPoder(usuario);
        
        if (tipo.equals("ataque")) {
            int danoReal = alvo.receberDano(poder);
            return usuario.getNome() + " conjura " + this.nome + " contra " + alvo.getNome() + 
                   " causando " + danoReal + " de dano mágico!";
        } else if (tipo.equals("cura")) {
            int curaReal = alvo.curar(poder);
            return usuario.getNome() + " conjura " + this.nome + " em " + alvo.getNome() + 
                   " restaurando " + curaReal + " pontos de vida!";
        } else {
            return usuario.getNome() + " conjura " + this.nome + " com poder " + poder + "!";
        }
    }
    
    private int calcularPoder(Personagem usuario) {
        return this.poderBase + (int)(usuario.getInteligencia() * 1.2) + (this.nivel * 7);
    }
}
