package com.company;

public class Jogador {
    private int idjogador;
    private String nome;
    private String posicaoJogador;


    public void listarJogador(){
        System.out.println("ID do Jogador" + getIdjogador());
        System.out.println("Nome do Jogador" + getNome());
        System.out.println("Posição do Jogador" + getPosicaoJogador());

    }


    public int getIdjogador() {
        return idjogador;
    }

    public void setIdjogador(int idjogador) {
        this.idjogador = idjogador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPosicaoJogador() {
        return posicaoJogador;
    }

    public void setPosicaoJogador(String posicaoJogador) {
        this.posicaoJogador = posicaoJogador;
    }
}
