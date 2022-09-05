/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.fatecfranca.projeto3;

import java.util.Date;

/**
 *
 * @author 1090482013036
 */
public final class Cursa {
    private int codigo;
    private Date data;
    private Aluno aluno; //agregação - Criamos um objeto-parte dentro do objeto-todo

    public Cursa() {
    }

    public Cursa(int codigo, Date data, Aluno aluno) {
        this.setCodigo(codigo);
        this.setData(data);
        this.setAluno(aluno);
    }
    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
    
    
}
