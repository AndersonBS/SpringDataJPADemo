package com.example.springdata.dto.response;

public class MensagemResponseDTO {

	private String mensagem;

	public MensagemResponseDTO() {
		super();
	}

	public MensagemResponseDTO(final String mensagem) {
		super();
		this.mensagem = mensagem;
	}

	public String getMensagem() {
		return this.mensagem;
	}

	public void setMensagem(final String mensagem) {
		this.mensagem = mensagem;
	}

}
