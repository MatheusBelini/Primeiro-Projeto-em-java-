package com.mycompany.primeiroprojetoemjava;

public class Aluno extends Pessoas {

    private final String curso;

    public Aluno(String nome, int idade, String curso) {
        super(nome, idade);
        this.curso = curso; // OBRIGATÓRIO
    }

    @Override
    public void apresentar() {
        System.out.println(
            "Meu nome é " + getNome() +
            ", minha idade é " + getIdade() +
            " e meu curso é " + curso
        );
    }
}
