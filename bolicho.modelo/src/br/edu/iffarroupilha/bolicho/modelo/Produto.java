package br.edu.iffarroupilha.bolicho.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Produto {


	@Id // chave primaria
	@Column(nullable=false) // campo obrigatorio no banco
	private int idProduto;
	
	@Column(length=40, nullable=false)
	private String descricao;
	
	@Column(nullable=false)
	private double preco;

	public int getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

}
