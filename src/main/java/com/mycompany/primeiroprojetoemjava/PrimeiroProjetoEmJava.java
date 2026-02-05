package com.mycompany.primeiroprojetoemjava;

import java.util.ArrayList;



public class PrimeiroProjetoEmJava {
    public static void main(String[] args) {

        ArrayList<Pessoas> lista = new ArrayList<>();

        lista.add(new Pessoas("Matheus", 18));
        lista.add(new Aluno("Carlos", 25, "Arquitetura"));
        lista.add(new Aluno("Joao", 24, "Engenharia"));

        for (Pessoas p : lista) {
            p.apresentar();
        }
    }
}
