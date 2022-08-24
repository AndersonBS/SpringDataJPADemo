package com.example.springdata.dto.request;

public class CorRequestDTO {

	private String nome;
	private Integer r;
	private Integer g;
	private Integer b;

	public CorRequestDTO() {
		super();
	}

	public CorRequestDTO(final String nome, final Integer r, final Integer g, final Integer b) {
		super();
		this.nome = nome;
		this.r = r;
		this.g = g;
		this.b = b;
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

}
