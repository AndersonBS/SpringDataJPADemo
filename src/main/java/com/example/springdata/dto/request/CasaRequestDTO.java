package com.example.springdata.dto.request;

public class CasaRequestDTO {

	private Long idCor;
	private Integer numeroQuartos;
	private Integer numeroBanheiros;
	private String possuiGaragem;

	public CasaRequestDTO() {
		super();
	}

	public CasaRequestDTO(final Long idCor, final Integer numeroQuartos, final Integer numeroBanheiros, final String possuiGaragem) {
		super();
		this.idCor = idCor;
		this.numeroQuartos = numeroQuartos;
		this.numeroBanheiros = numeroBanheiros;
		this.possuiGaragem = possuiGaragem;
	}

	public Long getIdCor() {
		return this.idCor;
	}

	public Integer getNumeroQuartos() {
		return this.numeroQuartos;
	}

	public Integer getNumeroBanheiros() {
		return this.numeroBanheiros;
	}

	public String getPossuiGaragem() {
		return this.possuiGaragem;
	}

	public void setIdCor(final Long idCor) {
		this.idCor = idCor;
	}

	public void setNumeroQuartos(final Integer numeroQuartos) {
		this.numeroQuartos = numeroQuartos;
	}

	public void setNumeroBanheiros(final Integer numeroBanheiros) {
		this.numeroBanheiros = numeroBanheiros;
	}

	public void setPossuiGaragem(final String possuiGaragem) {
		this.possuiGaragem = possuiGaragem;
	}

}
