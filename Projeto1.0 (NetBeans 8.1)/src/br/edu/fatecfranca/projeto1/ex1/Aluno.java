/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fatecfranca.projeto1.ex1;

import java.text.DecimalFormat;

/**
 *
 * @author 1090482013036
 */
public class Aluno {
    DecimalFormat formatar = new DecimalFormat("0.0");
    public int nAluno;
    public int idade;
    public String nome;
    public double n1, n2;
    
    
    
    public Aluno (){}
    
    //métodos construtores
    public Aluno (int nAluno,int idade, String nome, double n1, double n2){
        this.nAluno = nAluno;
        this.idade = idade;
        this.nome = nome;
        this.n1 = n1;
        this.n2 = n2;
        
        
    }
    public double nFinal(){
        return (this.n1 + this.n2)/2;
    }
    
    public String dadosAluno(){
        return "\nNumero do Aluno: " + this.nAluno + "\nNome: " + this.nome + 
                "\nIdade: " + this.idade + "\nNota Final: " + formatar.format(this.nFinal());
    }
    
    public void passou(){
        if(this.nFinal() >= 6.0){
            System.out.println("Aluno foi aprovado");
        }
        else{
            System.out.println("Aluno não foi aprovado");
        }
    }
    
    public void mostrar(){
        System.out.println(this.dadosAluno());
        this.passou();
        this.separar();
    }
    
    public void separar(){
        System.out.println("----------------------------------------");
    }
    
}
