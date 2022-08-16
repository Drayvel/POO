/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package br.edu.fatecfranca.projeto1;
/**
 *
 * @author 1090482013036
 */
public class Teste {
    
    public static void main(String[] args) {
        //Criando um objeto da classe produto
        //Instanciando a classe produto ou criando uma
        //instancia da classe produto
        //chama o método construtor
        Produto obj1 = new Produto();
        obj1.nome = "Bola de Basquete";
        obj1.qtde = 5;
        obj1.preco = 39.99;
        obj1.comprar(3);
        obj1.mostrar();
        
        Produto obj2 = new Produto(
        "Máscara Hospitalar",50,1.99);
        obj2.vender(10);
        obj2.mostrar();
        
        Produto obj3 = new Produto("Almoço", 3, 14.9);
        obj3.comprar(4);
        obj3.mostrar();
        obj3.vender(6);
        obj3.aumento(2.9);
        obj3.mostrar();
        obj3.decrescimo(12.6);
        obj3.mostrar();
        obj3.decrescimo(10.20);
        obj3.mostrar();
        
        
        
    }
}
