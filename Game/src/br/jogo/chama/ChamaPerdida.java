package br.jogo.chama;

public class ChamaPerdida extends Chama {
    
    public ChamaPerdida() {
        super("Chama Perdida", 70, 5); // Inicialmente pouco corrompida
    }
    
    @Override
    public String poderEspecial() {
        int poder = (int)(this.calcularPoderAtual() * 1.3);
        return "A Chama Perdida libera seu poder de Visão do Abismo, revelando segredos ocultos e causando " + poder + " de dano psíquico!";
    }
    
    @Override
    public String descricao() {
        return "A Chama Perdida: A quinta chama, desaparecida por séculos, contém o poder mais puro e perigoso de todas.";
    }
}
