package br.edu.fatecfranca.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //informa que é entidade de BD
@Table(name="candidato") //informa que é uma tabela
public class CandidatoEntity {
	
	@Id//Chave Primária
	//Campo auto-incremento iniciando em 1
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@Column(name="nome")
	private String nome;
	@Column(name="partido")
	private String partido;
	@Column(name="idade")
	private int idade;
	@Column(name="nota")
	private float nota;
	
}
