/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.fatecfranca.projeto1;

import br.edu.fatecfranca.projeto1.ex4.Rio;

/**
 *
 * @author 1090482013036
 */
public class TesteRio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rio obj1 = new Rio();
        obj1.nome = "Amazonas";
        obj1.nivel = 1.45;
        obj1.poluido = false;
        obj1.mostrar();
        obj1.ensolarar(1);
        obj1.mostrar();
        obj1.limpar();
        
        
        Rio obj2 = new Rio("Parana", 1.21, false);
        obj2.chover(0.48);
        obj2.sujar();
        obj2.mostrar();
        obj2.sujar();
        
        Rio obj3 = new Rio("Tietê", 0.78, true);
        obj3.mostrar();
        obj3.limpar();
        obj3.mostrar();
    }
    
}
