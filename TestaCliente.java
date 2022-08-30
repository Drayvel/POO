/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.fatecfranca.projeto1;

import br.edu.fatecfranca.projeto1.ex05.Cliente;

/**
 *
 * @author 1090482013036
 */
public class TestaCliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cliente cli1 = new Cliente("123456-7", "1234-5", "Beltrano", 0);
        cli1.depositar(250.34);
        cli1.sacar(42.5);
        cli1.mostrar();
    }
    
}
