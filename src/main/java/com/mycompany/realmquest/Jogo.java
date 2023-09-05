package com.mycompany.realmquest;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Jogo {
    private Personagem player1;
    private Personagem player2;
    private Infos info = new Infos();
    private ArrayList <Personagem> listaPersonagem = new ArrayList<>();
    private ArrayList <Pergunta> listaPergunta = new ArrayList<>();

    public Personagem getPlayer1() {
        return player1;
    }

    public void setPlayer1(Personagem player1) {
        this.player1 = player1;
    }

    public Personagem getPlayer2() {
        return player2;
    }

    public void setPlayer2(Personagem player2) {
        this.player2 = player2;
    }

    public ArrayList<Personagem> getListaPersonagem() {
        return listaPersonagem;
    }

    public void setListaPersonagem(ArrayList<Personagem> listaPersonagem) {
        this.listaPersonagem = listaPersonagem;
    }

    public ArrayList<Pergunta> getListaPergunta() {
        return listaPergunta;
    }

    public void setListaPergunta(ArrayList<Pergunta> listaPergunta) {
        this.listaPergunta = listaPergunta;
    }

    public void pausa(){
        //cria pequenas pausas entre os acontecimentos:
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Jogo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void linha(){
        //faz as linhas para separar as coisas e ficar menos feio
        System.out.print("\n");
        for(int i = 0; i<=70; i++){
            System.out.print("-=");
        }
        System.out.println("\n");
    }
    
    public void addPersonagem(){
        //adiciona os personagens na lista
        listaPersonagem.add(new Personagem("Guerreiro"));
        listaPersonagem.add(new Personagem("Mago"));
        listaPersonagem.add(new Personagem("Arqueiro"));
        listaPersonagem.add(new Personagem("Sacerdote"));
    }
    
    public void addPergunta() {
        //adiciona as perguntas / respostas na lista:
        listaPergunta.add(new Pergunta("O que é programação orientada a objetos?", 
                
                          new String[]{"a) Um paradigma de programação baseado em objetos", 
                                       "b) Um tipo de linguagem de programação", 
                                       "c) Um método de depuração de código", 
                                       "d) Um tipo de estrutura de dados"}, "a"));
        
        listaPergunta.add(new Pergunta("O que é uma classe em Java?", 
                
                          new String[]{"a) Uma estrutura de dados para armazenar valores", 
                                       "b) Um tipo de variável", 
                                       "c) Um modelo para criar objetos", 
                                       "d) Uma função para executar código"}, "c"));
        
        listaPergunta.add(new Pergunta("O que é herança em programação orientada a objetos?", 
                
                          new String[]{"a) A capacidade de criar novas classes a partir de classes existentes", 
                                       "b) A capacidade de compartilhar código entre classes", 
                                       "c) A capacidade de armazenar dados em classes", 
                                       "d) A capacidade de executar código em classes"}, "a"));
        
        listaPergunta.add(new Pergunta("O que é polimorfismo em programação orientada a objetos?", 
                
                          new String[]{"a) A capacidade de um objeto ter muitos atributos", 
                                       "b) A capacidade de um objeto executar muitas funções", 
                                       "c) A capacidade de um objeto armazenar muitos valores", 
                                       "d) A capacidade de um objeto assumir muitas formas"}, "d"));
        
        listaPergunta.add(new Pergunta("O que é encapsulamento em programação orientada a objetos?", 
                
                         new String[]{"a) A prática de compartilhar código entre objetos", 
                                      "b) A prática de esconder a implementação interna dos objetos", 
                                      "c) A prática de armazenar dados em objetos", 
                                      "d) A prática de executar código em objetos"}, "b"));
        
        listaPergunta.add(new Pergunta("O que é uma interface em Java?", 
                
                          new String[]{"a) Um tipo especial de classe", 
                                       "b) Uma classe abstrata com apenas métodos abstratos", 
                                       "c) Um contrato entre classes", 
                                       "d) Um tipo especial de variável"}, "b"));
        
        listaPergunta.add(new Pergunta("O que é uma exceção em Java?", 
                
                          new String[]{"a) Um tipo especial de variável", 
                                       "b) Um tipo especial de classe", 
                                       "c) Um método para depurar código", 
                                       "d) Um evento que ocorre durante a execução do programa e interrompe o fluxo normal do programa"}, "d"));
        
        listaPergunta.add(new Pergunta("O que é um construtor em Java?", 
                
                          new String[]{"a) Um método especial usado para criar e inicializar objetos", 
                                       "b) Um tipo especial de variável", 
                                       "c) Um tipo especial de classe", 
                                       "d) Um método para depurar código"}, "a"));
        
        listaPergunta.add(new Pergunta("O que é sobrecarga de métodos em Java?", 
                
                         new String[]{"a) A prática de definir vários métodos com o mesmo nome e os mesmos parâmetros", 
                                      "b) A prática de definir vários métodos com nomes diferentes, mas com os mesmos parâmetros", 
                                      "c) A prática de definir vários métodos com o mesmo nome, mas com parâmetros diferentes", 
                                      "d) A prática de definir vários métodos com nomes e parâmetros diferentes"}, "c"));
        
        listaPergunta.add(new Pergunta("O que é uma classe abstrata em Java?", 
                
                          new String[]{"a) Uma classe que pode ser instanciada e usada diretamente", 
                                       "b) Uma classe que não pode ser instanciada e é usada como base para outras classes", 
                                       "c) Um tipo especial de interface", 
                                       "d) Um tipo especial de variável"}, "b"));
        
        listaPergunta.add(new Pergunta("O que é um método abstrato em Java?", 
                
                          new String[]{"a) Um método sem implementação que deve ser implementado por subclasses", 
                                       "b) Um método com implementação que pode ser usado diretamente", 
                                       "c) Um tipo especial de construtor", 
                                       "d) Um tipo especial de variável"}, "a"));
        
        listaPergunta.add(new Pergunta("O que é um pacote em Java?", 
                
                          new String[]{"a) Um namespace para organizar classes e interfaces relacionadas", 
                                       "b) Um tipo especial de classe", 
                                       "c) Um tipo especial de interface", 
                                       "d) Um método especial usado para criar e inicializar objetos"}, "a"));
        
        listaPergunta.add(new Pergunta("O que é uma variável de instância em Java?", 
                
                          new String[]{"a) Um tipo especial de método", 
                                       "b) Uma variável associada a uma classe, não a uma instância", 
                                       "c) Uma variável associada a uma instância de uma classe", 
                                       "d) Um tipo especial de construtor"}, "c"));
        
        listaPergunta.add(new Pergunta("O que é uma variável de classe em Java?", 
                
                          new String[]{"a) Uma variável associada a uma instância de uma classe", 
                                       "b) Uma variável associada a uma classe, não a uma instância", 
                                       "c) Um método associado a uma instância de uma classe", 
                                       "d) Um método com implementação que pode ser usado diretamente"}, "b"));
        
        listaPergunta.add(new Pergunta("O que é um método estático em Java?", 
                
                          new String[]{"a) Um método com implementação que pode ser usado diretamente", 
                                       "b) Uma variável associada a uma classe, não a uma instância", 
                                       "c) Uma variável associada a uma classe, não a uma instância", 
                                       "d) Um método associado a uma classe, não a uma instância"}, "d"));
        
    }
    
    public Personagem escolhePersonagem(int player){
        
        Scanner in = new Scanner(System.in);
        
        //mostra os personagens da lista:
        System.out.println("Seleção de personagem: \n");
        for(int i = 0; i < listaPersonagem.size(); i++){
            System.out.println((i+1) + " - " + listaPersonagem.get(i).getNome());
        }

        //escolhe personagem:
        int escolha;
        while (true) {
            System.out.print("\nJogador " + player + " escolha seu personagem: ");
            String seleciona = in.nextLine();

            try {
                // pega o que foi digitado e tenta passar para um valor inteiro:
                escolha = Integer.parseInt(seleciona);
                if (escolha >= 1 && escolha <= listaPersonagem.size()) {
                    System.out.print("O jogador " + player + " é um " + listaPersonagem.get(escolha - 1).getNome() + "\n");
                    break;
                } else {
                    //se o valor convertido for menor ou meior do que o que tem na lista:
                    System.out.println("Escolha inválida!!");
                }
            } catch (NumberFormatException e) {
                //caso não seja possivel fazer a conversão:
                System.out.println("Escolha inválida!!");
            }
        }
        //guarda o personagem escolhido em uma variavel do tipo personagem:
        Personagem personagemEscolhido = listaPersonagem.get(escolha - 1);
        //remove o personagem escolhido da lista para não aparecer pro outro player:
        listaPersonagem.remove(escolha - 1);
        //retorna o personagem escolhido que foi guardado na variavel acima:
        return personagemEscolhido;
    }
    
    public String responder(Personagem personagem) {
        //o personagem escolhe entre as alternativas e retorna a alternativa escolhida
        Scanner in = new Scanner(System.in);
        //variaveis para guardar a resposta e confirmar a resposta:
        String resposta, confirma;
        while(true){
            System.out.print("\n" + personagem.getNome() + ", qual será a sua escolha a), b), c) ou d)? ");
            resposta = in.next().toLowerCase();
            //se a resposta digitada for uma das opções disponiveis:
            if(resposta.equals("a") || resposta.equals("b") || resposta.equals("c") || resposta.equals("d") || resposta.equals("sair")){
                do{
                    System.out.print("\n" + personagem.getNome() + ", tem certeza da sua resposta? ");
                    confirma = in.next().toLowerCase().replaceFirst("�", "a");
                    //confirma a resposta:
                    if(confirma.equals("s") || confirma.equals("sim") || confirma.equals("n") || confirma.equals("nao")){
                        break;
                    } else{
                        System.out.println("Resposta inválida. Por favor, responda com 'Sim' ou 'Não'.");
                    }
                }while(true);
                if(confirma.equals("s") || confirma.equals("sim")){
                    //se digitar que sim, quebra o loop e retorna a resposta:
                    break;
                }
                
            }else {
                //se o que foi digitado não for uma das opções disponiveis:
                System.out.println("Não teste minha paciência, essa alternativa não existe!!");
            }
        }
        return resposta;
    }
    
    public void iniciarJogo(){
        Random sorteia = new Random();
        //chama os métodos para adicionar as perguntas e personagens
        addPersonagem();
        addPergunta();
        
        //mostra a quest do jogo:
        info.mostraQuest();
        pausa();
        
        //chama o método para escolher personagem
        player1 = escolhePersonagem(1);
        linha();
        player2 = escolhePersonagem(2);
        linha();
        
        //joga os dados pra ver quem joga primeiro
        System.out.println("Os dados serão jogados para ver quem joga primeiro: \n");
        Personagem joga1;
        Personagem joga2;
        //variaveis para guardar o valor que cair no dado:
        int dado1;
        int dado2;
        do{
            //loop para que não caia números iguais:
            dado1 = sorteia.nextInt(6)+1;
            dado2 = sorteia.nextInt(6)+1;
        }while(dado1 == dado2);
        pausa();
        
        //mostra quanto cada um tirou nos dados e decide quem joga primeiro
        System.out.println("O " + player1.getNome() + " tirou " + dado1 + " no dado.");
        pausa();
        System.out.println("O " + player2.getNome() + " tirou " + dado2 + " no dado.");
        pausa();        
        if(dado1 > dado2){
            joga1 = player1;
            joga2 = player2;
            System.out.println("O " + joga1.getNome() + " Vai jogar primeiro.");
        }else {
            joga1 = player2;
            joga2 = player1;
            System.out.println("O " + joga1.getNome() + " Vai jogar primeiro.");
        }
        pausa();
        
        //variavel pra fazer contagem da rodada
        int contaRodada = 1;
        
        //loop para rodar enquanto ainda tiver perguntas ou um jogador chegar a 0 de vida
        while(!listaPergunta.isEmpty() && joga1.getVida() > 0 && joga2.getVida() > 0){
            linha();
            //mostra em qual rodada está e a vida dos jogadores:
            System.out.println("Rodada " + contaRodada + ": \n");
            System.out.println(joga1.status() + " Vs " + joga2.status() + "\n");
            
            //sorteia uma pergunta aleatoria da lista de perguntas e mostra:
            int n = sorteia.nextInt(listaPergunta.size());
            System.out.println(listaPergunta.get(n).getEnunciado());
            
            // um for para mostrar cada alternativa da pergunta
            for (String alternativa : listaPergunta.get(n).getAlternativas()) {
                System.out.println(alternativa);
            }
             
             //chama o método para cada jogador responder a pergunta
             String resposta1 = responder(joga1);
             //caso a pessoa digite sair, o jogo vai parar
             if (resposta1.equals("sair")){
                 listaPersonagem.clear();
                 listaPergunta.clear();
                 linha();
                 return;
             }
             
             String resposta2 = responder(joga2);
             //caso a pessoa digite sair, o jogo vai parar
             if (resposta2.equals("sair")){
                 listaPersonagem.clear();
                 listaPergunta.clear();
                 linha();
                 return;
             }
             
             pausa();
             
             //verifica se a respostas estão certas ou erradas, e chama o metodo que da dano em quem erra
             if(resposta1.equals(listaPergunta.get(n).getRespCorreta()) && resposta2.equals(listaPergunta.get(n).getRespCorreta())){
                 //se os 2 acertarem
                 System.out.println("\nOs dois acertaram, ninguém será punido, a resposta correta é: " + listaPergunta.get(n).getRespCorreta() + ")");
                 
             } else if(resposta1.equals(listaPergunta.get(n).getRespCorreta())){
                 //se apenas o player 1 acertar
                 System.out.println("\nApenas o " + joga1.getNome() + " acertou, a resposta correta é: " + listaPergunta.get(n).getRespCorreta() + ")");
                 System.out.println("Por errar o " + joga2.getNome() + " será punido!!");
                 pausa();
                 joga2.erra();
                 System.out.println("CRAAAASH!!! " + joga2.getNome() + " leva um golpe e perde 10 HP. " + joga2.status());
                 
             } else if(resposta2.equals(listaPergunta.get(n).getRespCorreta())){
                 //se apçenas o player 2 acertar
                 System.out.println("\nApenas o " + joga2.getNome() + " acertou, a resposta correta é: " + listaPergunta.get(n).getRespCorreta() + ")");
                 System.out.println("Por errar o " + joga1.getNome() + " será punido!!");
                 pausa();
                 joga1.erra();
                 System.out.println("CRAAAASH!!! " + joga1.getNome() + " leva um golpe e perde 10 HP. " + joga1.status());
                 
             } else{
                 //se os 2 errarem
                 System.out.println("\nOs dois erraram, então os dois serão punidos, a resposta correta é: " + listaPergunta.get(n).getRespCorreta() + ")");
                 pausa();
                 joga1.erra();
                 System.out.println("SLAAASH!!! " + joga1.getNome() + " leva um golpe e perde 10 HP. " + joga1.status());
                 joga2.erra();
                 System.out.println("SLAAASH!!! " + joga2.getNome() + " leva um golpe e perde 10 HP. " + joga2.status());
 
             }
             contaRodada++;
             //remove a pergunta da lista de perguntas para não repetir
             listaPergunta.remove(n);
             pausa();
        }
        
        linha();
        //verifica quem é o vencedor ou se houve empate
        if(joga1.getVida() > joga2.getVida()){
            System.out.println("O " + joga1.getNome() + " foi o vencedor, e dominou completamente o reino da Programação!!");
            System.out.println("Totalmente derrotado, o " + joga2.getNome() + " foi exilado para outro reino para praticar o if/else.");
        } else if(joga2.getVida() > joga1.getVida()){
            System.out.println("O " + joga2.getNome() + " foi o vencedor, e dominou completamente o reino da Programação!!");
            System.out.println("Totalmente derrotado, o " + joga1.getNome() + " foi exilado para outro reino para praticar o if/else.");
        } else{
            System.out.println("Após uma grande batalha, houve um empate, então, o " + joga1.getNome() + " e o " + joga2.getNome() + " voltam para seus reinos para praticar o if/else.");
        }
        linha();
        //limpa as listas para que não apareça coisas duplicadas
        listaPersonagem.clear();
        listaPergunta.clear();
    }
    
    public void menu(){
        Scanner in = new Scanner(System.in);
        linha();
        info.mostraInfo();
        linha();
        //variavel de controle para o loop
        boolean executar = true;
        //o menu continua funcionando enquanto a variavel for verdadeira
        while (executar) {
            //mostra as opções do menu
            System.out.println("Menu: \n");
            System.out.println("1 - Iniciar Jogo "
                           + "\n2 - Tutorial "
                           + "\n3 - Informações "
                           + "\n4 - Sair");
            
            System.out.print("\nO que deseja fazer? ");
            String escolha = in.nextLine().toLowerCase();
            //um switch case para cada opção selecionada
            switch(escolha){
                case "1":
                case "iniciar jogo":
                    linha();
                    iniciarJogo();
                    break;
                case "2":
                case "tutorial":
                    linha();
                    info.mostraTutorial();
                    linha();
                    break;
                case "3":
                case "informações":
                    linha();
                    info.mostraInfo();
                    linha();
                    break;
                case "4":
                case "sair":
                    //se a pessoa selecionar para sair a variavel fica false e quebra o loop finalizando o programa
                    executar = false;
                    break;
                default:
                    System.out.println("\nEscolha inválida!!");
                    linha();
                    break;
            }
            
        }
        linha();
        System.out.println("Obrigado por jogar!! Até a próxima.");
        in.close();
        linha();
    } 
}
