package com.mycompany.primeiroprojetoemjava;

import java.util.ArrayList; //Permite criar uma lista dinâmica//
import java.util.Scanner; //Permite ler oque o usuário digita//

public class PrimeiroProjetoEmJava { //Classe principal//
    public static void main(String[] args) { //Ponto de partida //

        Scanner sc = new Scanner(System.in);//Scanner=tipo da variável; sc=Nome da variável; System=entrada pelo teclado//
        ArrayList<Pessoas> lista = new ArrayList<>();
        
        System.out.print("Insira o nome do aluno:");
        String nome = sc.nextLine(); //sc.nextInt=le o texto completo//
        
        System.out.print("Insira sua idade:");
        int idade = sc.nextInt();  //sc.nextInt=le o texto completo//
        sc.nextLine(); //é obrigatório colocar depois de um nextInt pra "ativar" o Enter
        
        System.out.print("Insira seu curso:");
        String curso = sc.nextLine();
        
        lista.add(new Aluno(nome, idade, curso));
        
        for (Pessoas p: lista){
            p.apresentar();
        }
        sc.close(); //fecha o scanner//
    }
}
