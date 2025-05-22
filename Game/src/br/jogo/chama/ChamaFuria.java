package br.jogo.chama;

public class ChamaFuria extends Chama {
    
    public ChamaFuria() {
        super("Chama da Fúria", 65, 80); // Muito corrompida
    }
    
    @Override
    public String poderEspecial() {
        int poder = (int)(this.calcularPoderAtual() * 1.5);
        return "A Chama da Fúria libera seu poder de Força Primordial, aumentando a força física em " + poder + " pontos!";
    }
    
    @Override
    public String descricao() {
        return "A Chama da Fúria: Amplifica a força bruta e resistência, transformando seu portador em um guerreiro implacável.";
    }
}
