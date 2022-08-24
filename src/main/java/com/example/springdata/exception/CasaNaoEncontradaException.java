package com.example.springdata.exception;

public class CasaNaoEncontradaException extends RuntimeException {

	private static final long serialVersionUID = -596711459028111297L;

	public CasaNaoEncontradaException() {
		super("Casa não encontrada");
	}

	public CasaNaoEncontradaException(final String mensagem) {
		super(mensagem);
	}

}
