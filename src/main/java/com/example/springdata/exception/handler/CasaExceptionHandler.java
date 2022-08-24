package com.example.springdata.exception.handler;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import com.example.springdata.dto.response.MensagemResponseDTO;
import com.example.springdata.exception.CasaNaoEncontradaException;

@ControllerAdvice
public class CasaExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(value = CasaNaoEncontradaException.class)
	protected ResponseEntity<Object> handleCasaNaoEncontrada(final RuntimeException runtimeException, final WebRequest request) {
		return this.handleExceptionInternal(runtimeException, new MensagemResponseDTO(runtimeException.getMessage()),
				new HttpHeaders(), HttpStatus.NOT_FOUND, request);
	}

}
