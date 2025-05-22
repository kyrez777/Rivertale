package br.jogo.chama;

public class ChamaMontanha extends Chama {
    
    public ChamaMontanha() {
        super("Chama da Montanha", 55, 60);
    }
    
    @Override
    public String poderEspecial() {
        int poder = (int)(this.calcularPoderAtual() * 1.1);
        return "A Chama da Montanha libera seu poder de Forja do Abismo, fortalecendo armas e armaduras com " + poder + " de poder!";
    }
    
    @Override
    public String descricao() {
        return "A Chama da Montanha: Concede o poder de forjar armas e armaduras imbuídas com a essência do abismo.";
    }
}
