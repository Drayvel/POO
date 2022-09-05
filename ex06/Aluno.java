/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.fatecfranca.projeto1.ex06;

/**
 *
 * @author 1090482013036
 */
public final class Aluno {
    private int nAluno, idade;
    private String nome;
    private int p1, p2;
    
    public Aluno(){
    
}
    public Aluno(String nome, int nAluno, int idade, int p1, int p2){
        this.setNome(nome);
        this.setNaluno(nAluno);
        this.setIdade (idade);
        this.setP1(p1);
        this.setP2(p2);
    }

    public void setNome(String nome){
     if(nome.length() <= 30)
         this.nome = nome;
     else System.out.println("Tamanho inválido");
 }
    
    public void setNaluno(int nAluno){
        if(Integer.toString(nAluno).length() == 6);
        this.nAluno = nAluno;
    }
    
    public int setIdade(int idade){
        if(idade < 0 ){
            System.out.println("Idade inválida");
        }
        else this.idade = idade;
        return 0;
    }
    
    public double setP1(int p1){
        if(p1 >= 0){
            this.p1 = p1;
        }
        else System.out.println("Nota Inválida");
        return 0;
    }
    
    public double setP2(int p2){
        if(p2 >= 0){
            this.p2 = p2;
        }
        else System.out.println("Nota Inválida");
        return 0;
    }
    public String getNome(){
        return this.nome;
    }
    
    public int getIdade(){
        return this.idade;
    }
    
    public double getP1(){
        return this.p1;
    }
    
    public double getP2(){
        return this.p2;
    }
    
    
}
