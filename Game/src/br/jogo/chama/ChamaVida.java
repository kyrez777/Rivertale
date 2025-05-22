package br.jogo.chama;

public class ChamaVida extends Chama {
    
    public ChamaVida() {
        super("Chama da Vida", 50, 10); // Menos corrompida
    }
    
    @Override
    public String poderEspecial() {
        int poder = (int)(this.calcularPoderAtual() * 0.8);
        return "A Chama da Vida libera seu poder de Bênção da Árvore, curando " + poder + " pontos de vida e criando uma barreira protetora!";
    }
    
    @Override
    public String descricao() {
        return "A Chama da Vida: Concede o poder de curar e proteger, criando barreiras mágicas contra ameaças.";
    }
}
