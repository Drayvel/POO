/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fatecfranca.projeto1.ex2;
import java.text.DecimalFormat;


/**
 *
 * @author 1090482013036
 */
public class Cliente {
    DecimalFormat formatar = new DecimalFormat("0.0");
    public int nConta, nAgencia;
    public String nome;
    public double saldo;
    
    public Cliente(){}
    
    public Cliente(int nConta, int nAgencia, String nome, double saldo){
        this.nAgencia = nAgencia;
        this.nConta = nConta;
        this.nome = nome;
        this.saldo = saldo;  
        
    }
    //Depósito
    public void depositar(int x){
        this.saldo += x;
    }
    
}
