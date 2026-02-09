/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primeiroprojetoemjava;

/**
 *
 * @author mathe
 */
public class Professor extends Pessoas {
    private final String disciplina;
    
    public Professor (String nome, int idade, String disciplina){
        super(nome, idade);
        this.disciplina=disciplina;
    }
    @Override
    public void apresentar()
    {
        System.out.println(
                 "meu nome e " + getNome()+
            "minha idade e"+ getIdade()+
            "minha disciplina e" + disciplina
        );
       
            }
}
