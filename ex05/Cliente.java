/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.fatecfranca.projeto1.ex05;
import java.text.DecimalFormat;


/**
 *
 * @author 1090482013036
 */
public final class Cliente {
 DecimalFormat formatar = new DecimalFormat("0.00");
 private String nConta, nAgencia, nome;
 private double saldo;
 
 public Cliente(){
     
 }
 
 public Cliente(String nome, String nConta, String nAgencia, double saldo){
     this.setNome(nome);
     this.setNconta(nConta);
     this.setNagencia(nAgencia);
     this.setSaldo(saldo);
 }
 
 public void setNome(String nome){
     if(nome.length() <= 30)
         this.nome = nome;
     else System.out.println("Tamanho inválido");
 }
 
 
 
 public void setNconta(String nConta){
     if(nConta.length() == 8){
         if(nConta.charAt(6) == '-'){
             this.nConta = nConta;
         }
         else System.out.println("Dígito verificado ausente ou em posição errada");
     }
     else{
         System.out.println("Tamanho invalido");
     }
 }
 
 public void setNagencia(String nAgencia){
     if(nAgencia.length() == 6){
         if(nAgencia.charAt(4) == '-'){
             this.nAgencia = nAgencia;
         }
         else System.out.println("Dígito verificado ausente ou em posição errada");
     }
     else System.out.println("Tamanho invalido");
 }
 
 public void setSaldo(double saldo){
     if(saldo >= 0){
         this.saldo = saldo;
     }
     else System.out.println("O Saldo não pode ser negativo");
 }
 
 public String getNome(){
     return this.nome;
 }
 
 public String getNconta(){
     return this.nConta;
 }
 
 public String getNagencia(){
     return this.nAgencia;
 }
 
 public double getSaldo(){
     return this.saldo;
 }
 public void depositar(double x){
     this.saldo += x;
 }
 
 public void sacar(double x){
     this.setSaldo(this.saldo - x);
 }
 
 public void mostrar(){
     System.out.println("Conta " + this.nConta + "\nAgencia: " + this.nAgencia + "\nSaldo: " + this.saldo + "\nNome: " + this.nome);
 }
 
}
