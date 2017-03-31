package br.edu.iffarroupilha.bolicho.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cliente {

	@Id // chave primaria
	@Column(nullable=false) // campo obrigatorio no banco
	private int cpf;
	
	@Column(length=40,nullable=false) // campo orbigatorio de tamanho 40
	private String nome;

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
