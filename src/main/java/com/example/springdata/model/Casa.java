package com.example.springdata.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CASA")
public class Casa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "IDCOR")
	private Cor cor;

	@Column(name = "NUMEROQUARTOS")
	private Integer numeroQuartos;

	@Column(name = "NUMEROBANHEIROS")
	private Integer numeroBanheiros;

	@Column(name = "POSSUIGARAGEM")
	private String possuiGaragem;

	public Casa() {
		super();
	}

	public Casa(final Cor cor, final Integer numeroQuartos, final Integer numeroBanheiros, final String possuiGaragem) {
		super();
		this.cor = cor;
		this.numeroQuartos = numeroQuartos;
		this.numeroBanheiros = numeroBanheiros;
		this.possuiGaragem = possuiGaragem;
	}

	public Long getId() {
		return this.id;
	}

	public Cor getCor() {
		return this.cor;
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

	public void setCor(final Cor cor) {
		this.cor = cor;
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

	@Override
	public String toString() {
		return "Casa [id=" + this.id + ", cor=" + this.cor + ", numeroQuartos=" + this.numeroQuartos + ", numeroBanheiros=" + this.numeroBanheiros + ", possuiGaragem="
				+ this.possuiGaragem + "]";
	}

}
