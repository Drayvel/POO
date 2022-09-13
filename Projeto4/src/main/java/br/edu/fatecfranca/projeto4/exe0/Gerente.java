/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.fatecfranca.projeto4.exe0;

/**
 *
 * @author 1090482013036
 */
public final class Gerente extends Funcionario{
    private float bonificacao;
    
    public Gerente(){
        super();
    }

    public Gerente(int codigoFuncionario, String nome, String cpf, float salario, float cargaHoraria, float bonificacao) {
        super(codigoFuncionario, nome, cpf, salario, cargaHoraria);
        this.bonificacao = bonificacao;
    }

    public float getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(float bonificacao) {
        this.bonificacao = bonificacao;
    }

    /**
     *
     * @return
     */
    @Override
    public int getCodigoFuncionario() {
        return codigoFuncionario;
    }

    /**
     *
     * @param codigoFuncionario
     */
    @Override
    public void setCodigoFuncionario(int codigoFuncionario) {
        this.codigoFuncionario = codigoFuncionario;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getCpf() {
        return cpf;
    }

    /**
     *
     * @param cpf
     */
    @Override
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public float getSalario() {
        return salario;
    }

    @Override
    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public float getCargaHoraria() {
        return cargaHoraria;
    }

    /**
     *
     * @param cargaHoraria
     */
    @Override
    public void setCargaHoraria(float cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    
    
}
