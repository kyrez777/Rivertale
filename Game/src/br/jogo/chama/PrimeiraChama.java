package br.jogo.chama;

public class PrimeiraChama extends Chama {
    
    public PrimeiraChama() {
        super("Primeira Chama", 60, 70);
    }
    
    @Override
    public String poderEspecial() {
        int poder = (int)(this.calcularPoderAtual() * 1.2);
        return "A Primeira Chama libera seu poder de Dominação, causando " + poder + " de dano!";
    }
    
    @Override
    public String descricao() {
        return "A Primeira Chama: A primeira chama a surgir do abismo, concede força sobre-humana e a capacidade de dominar outros seres.";
    }
}
