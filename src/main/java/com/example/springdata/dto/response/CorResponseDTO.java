package com.example.springdata.dto.response;

import com.example.springdata.model.Cor;

public class CorResponseDTO {

	private Long id;
	private String nome;
	private Integer r;
	private Integer g;
	private Integer b;

	public CorResponseDTO() {
		super();
	}

	public CorResponseDTO(final Long id, final String nome, final Integer r, final Integer g, final Integer b) {
		super();
		this.id = id;
		this.nome = nome;
		this.r = r;
		this.g = g;
		this.b = b;
	}

	public CorResponseDTO(final Cor cor) {
		super();
		if (cor != null) {
			this.id = cor.getId();
			this.nome = cor.getNome();
			this.r = cor.getR();
			this.g = cor.getG();
			this.b = cor.getB();
		}
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

}
