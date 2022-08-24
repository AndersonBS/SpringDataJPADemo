package com.example.springdata.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "COR")
public class Cor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "NOME", length = 32)
	private String nome;

	@Column(name = "R")
	private Integer r;

	@Column(name = "G")
	private Integer g;

	@Column(name = "B")
	private Integer b;

	public Cor() {
		super();
	}

	public Cor(final String nome, final Integer r, final Integer g, final Integer b) {
		super();
		this.nome = nome;
		this.r = r;
		this.g = g;
		this.b = b;
	}

	public Long getId() {
		return this.id;
	}

	public String getNome() {
		return this.nome;
	}

	public Integer getR() {
		return this.r;
	}

	public Integer getG() {
		return this.g;
	}

	public Integer getB() {
		return this.b;
	}

	public void setId(final Long id) {
		this.id = id;
	}

	public void setNome(final String nome) {
		this.nome = nome;
	}

	public void setR(final Integer r) {
		this.r = r;
	}

	public void setG(final Integer g) {
		this.g = g;
	}

	public void setB(final Integer b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "Cor [id=" + this.id + ", nome=" + this.nome + ", r=" + this.r + ", g=" + this.g + ", b=" + this.b + "]";
	}

}
