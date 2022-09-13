/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.fatecfranca.projeto4.exe0;

/**
 *
 * @author 1090482013036
 */
public class Funcionario {
    
    protected int codigoFuncionario;
    protected String nome, cpf;
    protected float salario, cargaHoraria;

    public Funcionario() {
    }

    public Funcionario(int codigoFuncionario, String nome, String cpf, float salario, float cargaHoraria) {
        this.codigoFuncionario = codigoFuncionario;
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.cargaHoraria = cargaHoraria;
    }

    public int getCodigoFuncionario() {
        return codigoFuncionario;
    }

    public void setCodigoFuncionario(int codigoFuncionario) {
        this.codigoFuncionario = codigoFuncionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(float cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
}


        

    