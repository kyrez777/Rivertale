package br.jogo.personagem;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// Classe abstrata Personagem
public abstract class Personagem {
    protected String nome;
    protected int nivel;
    protected int vitalidade;
    protected int vidaMaxima;
    protected int vidaAtual;
    protected int mana;
    protected int manaMaxima;
    protected int manaAtual;
    protected int vigor;
    protected int forca;
    protected int destreza;
    protected int inteligencia;
    protected int sorte;
    protected int corrupcao;
    protected int experiencia;
    
    public Personagem(String nome, int nivel, int vitalidade, int mana, int vigor,
                     int forca, int destreza, int inteligencia, int sorte) {
        this.nome = nome;
        this.nivel = nivel;
        this.vitalidade = vitalidade;
        this.vidaMaxima = vitalidade * 10;
        this.vidaAtual = vidaMaxima;
        this.mana = mana;
        this.manaMaxima = mana * 10;
        this.manaAtual = manaMaxima;
        this.vigor = vigor;
        this.forca = forca;
        this.destreza = destreza;
        this.inteligencia = inteligencia;
        this.sorte = sorte;
        this.corrupcao = 0;
        this.experiencia = 0;
    }
    
    public int receberDano(int quantidade) {
        int danoReal = Math.max(1, quantidade - (this.vigor / 2));
        this.vidaAtual = Math.max(0, this.vidaAtual - danoReal);
        return danoReal;
    }
    
    public int curar(int quantidade) {
        int vidaAnterior = this.vidaAtual;
        this.vidaAtual = Math.min(this.vidaMaxima, this.vidaAtual + quantidade);
        return this.vidaAtual - vidaAnterior;
    }
    
    public boolean estaVivo() {
        return this.vidaAtual > 0;
    }
    
    public boolean ganharExperiencia(int quantidade) {
        this.experiencia += quantidade;
        if (this.experiencia >= this.nivel * 100) {
            this.subirNivel();
            return true;
        }
        return false;
    }
    
    public void subirNivel() {
        this.nivel += 1;
        this.experiencia = 0;
        this.vitalidade += 2;
        this.vidaMaxima = this.vitalidade * 10;
        this.vidaAtual = this.vidaMaxima;
        this.mana += 1;
        this.manaMaxima = this.mana * 10;
        this.manaAtual = this.manaMaxima;
        this.vigor += 1;
        this.forca += 1;
        this.destreza += 1;
        this.inteligencia += 1;
        this.sorte += 1;
    }
    
    public void aumentarCorrupcao(int quantidade) {
        this.corrupcao += quantidade;
        // Efeitos da corrupção podem ser implementados aqui
    }
    
    public void exibirStatus() {
        System.out.println("\nStatus de " + nome);
        System.out.println("Raça: " + this.getClass().getSimpleName());
        System.out.println("Nível: " + nivel);
        System.out.println("Vida: " + vidaAtual + "/" + vidaMaxima);
        System.out.println("Mana: " + manaAtual + "/" + manaMaxima);
        System.out.println("Vitalidade: " + vitalidade);
        System.out.println("Vigor: " + vigor);
        System.out.println("Força: " + forca);
        System.out.println("Destreza: " + destreza);
        System.out.println("Inteligência: " + inteligencia);
        System.out.println("Sorte: " + sorte);
        System.out.println("Corrupção: " + corrupcao);
        System.out.println("Experiência: " + experiencia + "/" + (nivel * 100));
    }
    
    // Métodos abstratos que devem ser implementados pelas classes filhas
    public abstract String habilidadeEspecial();
    public abstract String descricaoRaca();
    
    // Getters e Setters
    public String getNome() {
        return nome;
    }
    
    public int getNivel() {
        return nivel;
    }
    
    public int getVidaMaxima() {
        return vidaMaxima;
    }
    
    public int getVidaAtual() {
        return vidaAtual;
    }
    
    public int getForca() {
        return forca;
    }
    
    public int getDestreza() {
        return destreza;
    }
    
    public int getInteligencia() {
        return inteligencia;
    }
    
    public int getCorrupcao() {
        return corrupcao;
    }
}
