package com.example.springdata.dto.response;

import com.example.springdata.model.Casa;

public class CasaResponseDTO {

	private Long id;
	private Long idCor;
	private Integer numeroQuartos;
	private Integer numeroBanheiros;
	private String possuiGaragem;

	public CasaResponseDTO() {
		super();
	}

	public CasaResponseDTO(final Long id, final Long idCor, final Integer numeroQuartos, final Integer numeroBanheiros, final String possuiGaragem) {
		super();
		this.id = id;
		this.idCor = idCor;
		this.numeroQuartos = numeroQuartos;
		this.numeroBanheiros = numeroBanheiros;
		this.possuiGaragem = possuiGaragem;
	}

	public CasaResponseDTO(final Casa casa) {
		super();
		if (casa != null) {
			this.id = casa.getId();
			this.idCor = casa.getCor() != null ? casa.getCor().getId() : null;
			this.numeroQuartos = casa.getNumeroQuartos();
			this.numeroBanheiros = casa.getNumeroBanheiros();
			this.possuiGaragem = casa.getPossuiGaragem();
		}
	}

	public Long getId() {
		return this.id;
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

	public void setId(final Long id) {
		this.id = id;
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
