package com.cccpharma.models;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "registro")
public class Registro {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name = "venda")
	private ArrayList<String> venda;
	
	@Column(name = "quantidade_itens")
	private Integer quantidadeItens;
	
	@Column(name = "total")
	private double total;

	
	public Registro() {
		
	}
	
	public Registro(Integer quantidadeItens, double total, ArrayList<String> venda) {
		this.venda = venda;
		this.quantidadeItens = quantidadeItens;
		this.total = total;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public ArrayList<String> getVenda() {
		return venda;
	}

	public void setVenda(ArrayList<String> venda) {
		this.venda = venda;
	}

	public Integer getQuantidadeItens() {
		return quantidadeItens;
	}

	public double getTotal() {
		return total;
	}
}