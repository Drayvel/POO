/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.fatecfranca.projeto1.ex4;
import java.text.DecimalFormat;


/**
 *
 * @author 1090482013036
 */
public class Rio {
   public String nome;
   public double nivel;
   public boolean poluido;
   DecimalFormat formatar = new DecimalFormat("0.00");
   
   
   //construtor sem parâmetro
   public Rio(){
   }
   public Rio (String nome, double nivel, boolean poluido){
       //
       this.nome = nome;
       this.nivel = nivel;
       this.poluido = poluido;
   }
   //método
   public void chover(double x){
       this.nivel += x;
       System.out.println("Fez Chuva no Rio " + this.nome);
   }
   //método
   public void ensolarar(double x){
       if(x <= this.nivel){
           this.nivel -= x;
           System.out.println("Fez Sol no Rio " + this.nome);
       }
       else{
           System.out.println("O Nível do Rio não pode ser negativo.");
       }
   }
   //método
   public void mostrar(){
       System.out.println("\nRio: " + this.nome + "\nNivel: " + formatar.format(this.nivel) + "\nO Rio está poluido? " + (this.poluido ? "Sim" : "Não"));
   }
   //método
   public void limpar(){
       if(this.poluido){
           this.poluido = false;
           System.out.println("O Rio " + this.nome + " foi Limpo");
        }
       else {
           System.out.println("O Rio " + this.nome + " já está limpo!");
        }
   }
   //método
   public void sujar(){
       if(!this.poluido){
           this.poluido = true;
           System.out.println("O Rio " + this.nome + " está sujo agora");
       }
       else{
           System.out.println("O Rio " + this.nome + " já está sujo!");
       }
   }   
   
}
