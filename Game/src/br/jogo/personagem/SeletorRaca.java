package br.jogo.personagem;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// Classe para seleção de raça
public class SeletorRaca {
    private final List<String> racasDisponiveis = Arrays.asList(
        "Humano", "Elfo", "Anão", "Orc", "Meio-Elfo"
    );
    
    public Personagem selecionarRaca() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\n=== CRIAÇÃO DE PERSONAGEM ===");
        System.out.print("Digite o nome do seu personagem: ");
        String nomePersonagem = scanner.nextLine();
        
        System.out.println("\nEscolha sua raça:");
        for (int i = 0; i < racasDisponiveis.size(); i++) {
            System.out.println((i+1) + ". " + racasDisponiveis.get(i));
        }
        
        int escolha = 0;
        boolean escolhaValida = false;
        
        while (!escolhaValida) {
            System.out.print("\nDigite o número da raça escolhida: ");
            try {
                escolha = Integer.parseInt(scanner.nextLine());
                if (escolha >= 1 && escolha <= racasDisponiveis.size()) {
                    escolhaValida = true;
                } else {
                    System.out.println("Escolha inválida! Por favor, digite um número entre 1 e " + racasDisponiveis.size());
                }
            } catch (NumberFormatException e) {
                System.out.println("Por favor, digite um número válido!");
            }
        }
        
        String racaEscolhida = racasDisponiveis.get(escolha - 1);
        Personagem personagem = null;
        
        switch (racaEscolhida) {
            case "Humano":
                personagem = new Humano(nomePersonagem);
                break;
            case "Elfo":
                personagem = new Elfo(nomePersonagem);
                break;
            case "Anão":
                personagem = new Anao(nomePersonagem);
                break;
            case "Orc":
                personagem = new Orc(nomePersonagem);
                break;
            case "Meio-Elfo":
                personagem = new MeioElfo(nomePersonagem);
                break;
        }
        
        System.out.println("\nPersonagem criado com sucesso!");
        System.out.println("Nome: " + personagem.getNome());
        System.out.println("Raça: " + racaEscolhida);
        System.out.println(personagem.descricaoRaca());
        
        return personagem;
    }
}
