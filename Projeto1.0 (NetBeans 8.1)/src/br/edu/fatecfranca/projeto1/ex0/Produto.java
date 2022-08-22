package br.edu.fatecfranca.projeto1.ex0;

import java.text.DecimalFormat;

/**
 *
 * @author 1090482013036
 */

//Uma classe é algo abstrato, serve de modelo
//para a criação de objetos, que são instanciados

public class Produto {
    DecimalFormat formatar = new DecimalFormat("0.00");
    public int qtde;
    public String nome;
    public double preco;
    public String validade;
    
    //método construtor vazio --- DEVE TER O MESMO NOME DA CLASSE
    public Produto(){
    }
    
    
    //método construtor para inicializar as variáveis --- DEVE TER O MESMO NOME DA CLASSE
    public Produto(String nome, int qtde, double preco){
        //this representa o objeto que chamou o método
        this.nome = nome;
        this.qtde = qtde;
        this.preco = preco;
    }
    //comprar um produto em x unidades
    public void comprar(int x){
        this.qtde += x;
    }
    //vender um produto em x unidades
    public void vender(int x){
        if (x <= this.qtde){
        this.qtde -= x;
        }
        
    }
    
    //subir o preço de um produto em x unidades
    public void aumento(double x){
        this.preco += x;
    }
    //descer o preço de um produto em x unidades
    public void decrescimo(double x){
        if (x <= this.preco){
        this.preco -= x;
        }
    }
    public void mostrar (){
        System.out.println("Dados \nNome: " + this.nome + " Quantidade: "
                + this.qtde + " Preço: R$" + formatar.format(this.preco));
    } 
    
    
    
}


