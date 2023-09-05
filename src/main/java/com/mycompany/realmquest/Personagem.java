package com.mycompany.realmquest;

public class Personagem {
    private String nome;
    private int vida;

  public Personagem(String nome){
    this.nome = nome;
    this.vida = 100;
  }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void erra(){
        //tira vida do personagem ao errar
        this.vida -= 10;
    }

    public String status(){
        //mostra o nome e a vida do personagem
        String status = "[" + this.nome + " - " + this.vida + " HP]";
        return status;
    } 
}
