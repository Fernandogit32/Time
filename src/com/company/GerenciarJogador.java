package com.company;
import java.util.Scanner;
import java.io.IOException;


public class GerenciarJogador {
    Time times[]= new Time[3];



    int cont=0;

    public static void main(String[] args)throws IOException{
	// write your code here
        Jogador jogador = new Jogador();
        Scanner leitor = new Scanner(System.in);
        GerenciarJogador gt = new GerenciarJogador();
        int option=0;
        do {
            System.out.println("Digite uma opção");
            System.out.println("1 Para cadastrar um Time");
            System.out.println("2 Para cadastrar um Jogador");
            System.out.println("3 Para Listar Dados do Time");
            System.out.println("4 Para Listar Jogadores do Time");
            System.out.println("5 Para remover jogador do time");
            System.out.println("6 Para sair");
            option = leitor.nextInt();

            switch (option){
                case 1:
                    Time time = new Time();
                    gt.execCadTime(time);
                    System.out.println("Time Cadastrado com Sucesso");
                    System.out.println("Digite enter para voltar ao menu");
                    System.in.read();

                    break;
                case 2:
                    gt.execCadJogador(jogador);
                    gt.execCadJogadorTime(jogador);
                    System.out.println("Jogador adicionado ao time com Sucesso");
                    System.out.println("Digite enter para voltar ao menu");
                    System.in.read();
                    break;
                case 3:
                    gt.listarDadosTime();
                    System.out.println("Digite enter para voltar ao menu");
                    System.in.read();
                    break;
                case 4:
                    gt.listarJogadorTime();
                    System.out.println("Digite enter para voltar ao menu");
                    System.in.read();
                    break;
                case 5:
                    gt.execRemoveJogador();
                    System.out.println("Digite enter para voltar ao menu");
                    System.in.read();
                    break;

                default:


            }


        }while (option!=7);

    }



    public void execCadTime(Time time){
        Scanner leitorID = new Scanner(System.in);
        System.out.println("Entre com o ID do time");
        time.setIdTime(leitorID.nextInt());
        Scanner leitorName = new Scanner(System.in);
        System.out.println("Entre com o nome do time");
        time.setNome(leitorName.nextLine());

        for (int i = 0;i<=2;i++){
            if(cont<=2){
                for (int j = 0;j<=2;j++){
                    if(times[j]==null){
                        times[j]=time;
                        cont++;
                        break;
                    }
                }
                break;
            }else {
                System.out.println("Limite de Time atingido");
                break;
            }
        }

    }





    public void execCadJogador(Jogador jogador){
        Scanner leitorID = new Scanner(System.in);
        System.out.println("Digite o ID do Jogador");
        jogador.setIdjogador(leitorID.nextInt());
        System.out.println("Digite o nome do jogador");
        Scanner leitorNome = new Scanner(System.in);
        jogador.setNome(leitorNome.nextLine());
        System.out.println("Digite a posição do jogador");
        Scanner leitorPosicao = new Scanner(System.in);
        jogador.setPosicaoJogador(leitorPosicao.nextLine());
    }




    public void execCadJogadorTime(Jogador jogador){
        int option = 0;
        int option2 = 0;
        System.out.println("Escolha um time Para aicionar Um jogador");
        if(times[0]!=null){
            System.out.println("Digite 1 para o  time " + times[0].getNome());
        } if(times[1]!=null){
            System.out.println("Digite 2 para o  time " + times[1].getNome());
        }
        if (times[2]!=null){
            System.out.println("Digite 3 para o  time " + times[2].getNome());
        }

        Scanner leitor = new Scanner(System.in);
        int i = leitor.nextInt();
        if(i==1){
            times[0].adicionarJogador(jogador);
        }else if (i==2){
            times[1].adicionarJogador(jogador);
        }else  if (i==3){
            times[2].adicionarJogador(jogador);
        }


    }
    public void listarDadosTime(){
        System.out.println("LISTA DE TIMES");

        for (int i = 0; i < times.length ; i++){
            if (times[i]!=null){
                times[i].listar();
            }

        }


    }
    public void listarJogadorTime() {

        System.out.println("Escolha o time para listar os jogadores");
        if (times[0] != null) {
            System.out.println("Digite 1 para o  time " + times[0].getNome());
        }
        if (times[1] != null) {
            System.out.println("Digite 2 para o  time " + times[1].getNome());
        }
        if (times[2] != null) {
            System.out.println("Digite 3 para o  time " + times[2].getNome());
        }
        Scanner leitor = new Scanner(System.in);
        int option = leitor.nextInt();
        if(option==1){
            times[0].listarJogadores();
        }else if(option==2){
            times[1].listarJogadores();
        }else if(option==3){
            times[2].listarJogadores();
        }


     }

        public void execRemoveJogador(){

            System.out.println("Escolha o time que deseja remover o jogadores");
            if (times[0] != null) {
                System.out.println("Digite 1 para1 o  time " + times[0].getNome());
            }
            if (times[1] != null) {
                System.out.println("Digite 2 para o  time " + times[1].getNome());
            }
            if (times[2] != null) {
                System.out.println("Digite 3 para o  time " + times[2].getNome());
            }

            Scanner leitor = new Scanner(System.in);
            int option = leitor.nextInt();
            if(option==1){
                times[0].removerJogador();
            }else if(option==2){
                times[1].removerJogador();
            }else if(option==3){
                times[2].removerJogador();
            }


        }




}
