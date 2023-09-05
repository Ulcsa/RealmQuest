package com.mycompany.realmquest;

public class Infos {
    private String nomeJogo = "RealmQuest: Desafio dos Códigos";
    private String dev = "Lucas Eduardo de Andrade - RA: 12316018";
    private String tutorial = "Seleção de personagem: Cada jogador deverá escolher um dos 4 personagens jogáveis. " +
                             "\nSorte no dado: Após a seleção dos personagens, cada jogador irá jogar um dado, o jogador com o maior valor iniciará a rodada,"
            + "               \nse os dados derem valores iguais, será necessário rolar os dados novamente até que os números sejam diferentes. " +
              "               \nRodada: Após determinar a sorte no dado, a partida inicia, a partida possui 15 rodadas que será intercalada entre os dois jogadores,"
            + "               \na cada ação, a vez passa para o outro jogador, se um personagem errar a resposta da pergunta, ele perderá 10 pontos de vida. " +
              "               \nVida: A vida representa a saúde do personagem, ao iniciar a partida, cada personagem possui 100 pontos de vida, se a vida chegar a zero,"
            + "               \no jogador perde, caso as rodadas acabem vence o jogador com maior vida, se os pontos de vida forem iguais temos um empate.";
    
    private String quest = "Uma criatura misteriosa convoca heróis de diferentes reinos para uma competição, na qual o domínio do reino da programação está em jogo."
            + "            \nCada herói terá que enfrentar uma série de perguntas e fornecer respostas corretas para avançar no embate e ser vitorioso.";
    
    
    public String getNomeJogo() {
        return nomeJogo;
    }

    public void setNomeJogo(String nomeJogo) {
        this.nomeJogo = nomeJogo;
    }

    public String getDev() {
        return dev;
    }

    public void setDev(String dev) {
        this.dev = dev;
    }

    public String getTutorial() {
        return tutorial;
    }

    public void setTutorial(String tutorial) {
        this.tutorial = tutorial;
    }

    public String getQuest() {
        return quest;
    }

    public void setQuest(String quest) {
        this.quest = quest;
    }
    
    public void mostraInfo(){
        System.out.println("Bem vindo ao [" + this.nomeJogo + "] !!!!");
        System.out.println("\nDesenvolvedor: \n");
        System.out.println(this.dev);
    }
    
    public void mostraQuest(){
        System.out.println("A missão: \n");
        System.out.println(quest + "\n");       
    }
    
    public void mostraTutorial(){
        System.out.println("Tutorial: \n");
        tutorial = tutorial.replaceAll("\\. ", ".\n");
        System.out.println(tutorial);
    }
}
