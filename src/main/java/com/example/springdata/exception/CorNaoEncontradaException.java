package com.example.springdata.exception;

public class CorNaoEncontradaException extends RuntimeException {

	private static final long serialVersionUID = -2940478893071855495L;

	public CorNaoEncontradaException() {
		super("Cor não encontrada");
	}

	public CorNaoEncontradaException(final String mensagem) {
		super(mensagem);
	}

}
