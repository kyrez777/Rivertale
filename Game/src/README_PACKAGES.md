# Diagrama UML Atualizado - Jogo das Chamas

Este arquivo contém o diagrama UML atualizado para o jogo "A Era das Chamas", agora organizado em packages conforme a convenção Java.

## Estrutura de Packages

O projeto está organizado nos seguintes packages:

1. **br.jogo.personagem**: Classes relacionadas aos personagens do jogo
   - Personagem (classe abstrata)
   - Humano, Elfo, Anao, Orc, MeioElfo (classes concretas)
   - SeletorRaca (classe utilitária)

2. **br.jogo.chama**: Classes relacionadas às chamas místicas
   - Chama (classe abstrata)
   - PrimeiraChama, ChamaMontanha, ChamaVida, ChamaFuria, ChamaPerdida (classes concretas)

3. **br.jogo.habilidade**: Classes relacionadas às habilidades dos personagens
   - Habilidade (classe abstrata)
   - Ataque, Defesa, Magia, Corrupcao (classes concretas)

4. **br.jogo.main**: Classe principal do jogo
   - Main (classe com método main)

## Diagrama UML

O diagrama UML detalhado mostra todas as classes com seus atributos e métodos, além das relações de herança e associação entre elas.

## Como Executar o Jogo

Para compilar e executar o jogo, use os seguintes comandos a partir da pasta src:

```
cd src
javac br/jogo/main/Main.java
java br.jogo.main.Main
```

## Funcionalidades Principais

- Escolha dinâmica de raça e nome pelo jogador
- Sistema de atributos específicos por raça
- Habilidades especiais únicas para cada raça
- Sistema de corrupção que evolui com o uso de poderes
- Simulação de combate básico
