package com.mycompany.primeiroprojetoemjava;

public abstract class Pessoas {

    private final String nome;
    private int idade;

    public Pessoas(String nome, int idade) {
        this.nome = nome;
        setIdade(idade);
    }

    public final void setIdade(int idade) {
        if (idade >= 0) {
            this.idade = idade;
        } else {
            System.out.println("Idade inválida");
        }
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public abstract void apresentar();
}
