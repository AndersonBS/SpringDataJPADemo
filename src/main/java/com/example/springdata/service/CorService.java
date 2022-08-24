package com.example.springdata.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;
import com.example.springdata.exception.CorEmUsoException;
import com.example.springdata.exception.CorNaoEncontradaException;
import com.example.springdata.model.Cor;
import com.example.springdata.repository.CorRepository;

@Service
public class CorService {

	@Autowired
	private CorRepository corRepository;

	public List<Cor> getCores() {
		return this.corRepository.findAll();
	}

	public Cor getCor(final Long id) {
		final Optional<Cor> corOptional = this.corRepository.findById(id);
		if (!corOptional.isPresent()) {
			throw new CorNaoEncontradaException();
		}
		return corOptional.get();
	}

	public void deleteCor(final Long id) {
		final Optional<Cor> corOptional = this.corRepository.findById(id);
		if (corOptional.isPresent()) {
			try {
				this.corRepository.deleteById(id);
			} catch (final DataIntegrityViolationException dataIntegrityViolationException) {
				throw new CorEmUsoException();
			}
		} else {
			throw new CorNaoEncontradaException();
		}
	}

	public Cor createCor(final Cor cor) {
		this.corRepository.save(cor);
		return cor;
	}

	public Cor updateCor(final Long id, final Cor cor) {
		final Optional<Cor> corOptional = this.corRepository.findById(id);
		if (!corOptional.isPresent()) {
			throw new CorNaoEncontradaException();
		}
		cor.setId(id);
		this.corRepository.save(cor);
		return cor;
	}

}
