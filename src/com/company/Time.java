package com.company;

import java.util.ArrayList;

public class Time {
    private int idTime;
    private String nome;

    private Jogador jogadores[] = new Jogador[3];

    public void adicionarJogador(Jogador jogador) {
        for (int i = 0; i<2;i++){
            if(this.jogadores[i]==null){
                jogadores[i]=jogador;
                break;
            }
            System.out.println("Limite de jogadores do time atingido");
        }
    }

    public void removerJogador() {
        int j = 0;
        for (int i = 2; i >= 0; i--) {
            if(this.jogadores[i]!=null){
                this.jogadores[i] = null;
                System.out.println("Jogador removido com sucesso");
                break;
            }
            j++;
            if(j>=3){
                System.out.println("Nenhum jogador para escluir");
            }
        }
    }

    public void listarJogadores() {
        for (int i = 0; i < jogadores.length; i++) {
            if(this.jogadores[i]!=null){
                System.out.println("--------------");
                System.out.println("ID jogador " + jogadores[i].getIdjogador());
                System.out.println("Nome jogador " + jogadores[i].getNome());
                System.out.println("Posição jogador " + jogadores[i].getPosicaoJogador());
                System.out.println("--------------");
            }else{
                System.out.println("Fim dos jogadores");
                break;
            }
        }
    }

    public void listar() {
        System.out.println("--------------");
        System.out.println("ID: " + getIdTime());
        System.out.println("Nome:: " + getNome());
        System.out.println("---------------------");
    }

    public int getIdTime() {
        return idTime;
    }




    public void setIdTime(int idTime) {
        this.idTime = idTime;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}