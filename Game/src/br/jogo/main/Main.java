package br.jogo.main;

import java.util.Scanner;
import br.jogo.personagem.*;

/**
 * Classe Main para demonstração do jogo "A Era das Chamas"
 * Este arquivo contém um exemplo de uso das classes implementadas,
 * permitindo ao jogador escolher sua raça e nome.
 */
public class Main {
    public static void main(String[] args) {
        // Criando linhas de separação compatíveis com versões antigas do Java
        String linha = "================================================================================";
        String espacos = "                              ";
        
        System.out.println(linha);
        System.out.println(espacos + "BEM-VINDO A RIVERTALE" + espacos);
        System.out.println(linha);
        System.out.println("\n");
        
        // Criando o seletor de raça
        SeletorRaca seletor = new SeletorRaca();
        
        // Permitindo que o jogador escolha sua raça e nome
        Personagem jogador = seletor.selecionarRaca();
        
        // Exibindo informações detalhadas do personagem
        System.out.println("\nInformações detalhadas do seu personagem:");
        jogador.exibirStatus();
        
        // Demonstrando a habilidade especial da raça (método abstrato implementado)
        System.out.println("\nDemonstrando habilidade racial:");
        System.out.println(jogador.habilidadeEspecial());
        
        String linhaDivisoria = "--------------------------------------------------------------------------------";
        System.out.println("\n" + linhaDivisoria + "\n");
        
        // Simulando um combate simples
        System.out.println("Simulando um combate simples...");
        
        // Criando um inimigo para demonstração
        Orc inimigo = new Orc("Grunt");
        System.out.println("Um inimigo apareceu: " + inimigo.getNome() + " (" + inimigo.descricaoRaca() + ")");
        System.out.println("Vida do inimigo: " + inimigo.getVidaAtual() + "/" + inimigo.getVidaMaxima());
        
        // Simulando um ataque
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPressione ENTER para atacar o inimigo...");
        scanner.nextLine();
        
        int dano = jogador.getForca() * 2;
        int danoCausado = inimigo.receberDano(dano);
        System.out.println(jogador.getNome() + " ataca " + inimigo.getNome() + " causando " + danoCausado + " de dano!");
        System.out.println("Vida do inimigo após o ataque: " + inimigo.getVidaAtual() + "/" + inimigo.getVidaMaxima());
        
        // Simulando o uso da habilidade especial
        System.out.println("\nPressione ENTER para usar sua habilidade especial...");
        scanner.nextLine();
        
        System.out.println(jogador.habilidadeEspecial());
        
        // Simulando a corrupção
        System.out.println("\nAo derrotar o inimigo, você encontra um fragmento da Chama Perdida.");
        System.out.println("Pressione ENTER para absorver seu poder (aumentará sua corrupção)...");
        scanner.nextLine();
        
        jogador.aumentarCorrupcao(10);
        System.out.println("Você sente o poder do abismo fluindo através de você...");
        System.out.println("Seu nível de corrupção aumentou para: " + jogador.getCorrupcao());
        
        // Exibindo status atualizado
        System.out.println("\nStatus atualizado do seu personagem:");
        jogador.exibirStatus();
        
        System.out.println("\n" + linha + "\n");
        System.out.println(espacos + "FIM DA DEMONSTRAÇÃO" + espacos);
        System.out.println(linha);
        
        scanner.close();
    }
}
