/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fatecfranca.projeto1;
import br.edu.fatecfranca.projeto1.ex1.Aluno;



/**
 *
 * @author 1090482013036
 */
public class TesteAluno {
    public static void main(String[] args){
        Aluno obj1 = new Aluno( 36, 20, "Dayvd", 8.9, 10);
        obj1.mostrar();
        
        Aluno obj2 = new Aluno (35, 19, "Estéfani", 8.3, 10);
        obj2.mostrar();
        
        Aluno obj3 = new Aluno (41, 19, "Igor", 7.3, 10);
        System.out.println(obj3.dadosAluno());
        obj3.passou();
        
        Aluno obj4 = new Aluno (42, 17, "Hugo", 6, 3.2);
        obj4.mostrar();
    }
}
