package com.example.springdata.exception;

public class CorEmUsoException extends RuntimeException {

	private static final long serialVersionUID = -2940478893071855495L;

	public CorEmUsoException() {
		super("Cor está em uso");
	}

	public CorEmUsoException(final String mensagem) {
		super(mensagem);
	}

}
