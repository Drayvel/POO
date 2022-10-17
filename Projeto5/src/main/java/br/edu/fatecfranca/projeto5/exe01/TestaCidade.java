/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.fatecfranca.projeto5.exe01;

/**
 *
 * @author 1090482013036
 * j) Faça uma classe chamada TestaPessoaCidade. Crie um objeto do tipo Pessoa e um objeto do tipo Cidade. 
 *    Faça chamadas aos métodos como o código a seguir. Analise e anote os resultados.

	a) Pessoa fulano = new Pessoa();
	b) Cidade rp = new Cidade();
	c) rp.contrata(fulano);
	d) rp.contrata((Empregado) fulano);
	e) rp.cobraDe(fulano);
	f) rp.registra(fulano);
	g) rp.alimenta(fulano);

 */
public class TestaCidade{
    public static void main(String[] args){
        Pessoa fulanoDeTal = new Pessoa();
        Cidade Franca = new Cidade();
        Franca.contrata(fulanoDeTal);
        Franca.contrata((IEmpregado)fulanoDeTal);
        Franca.registra(fulanoDeTal);
        Franca.cobraDe(fulanoDeTal);
        Franca.alimenta(fulanoDeTal);        
    }
}
