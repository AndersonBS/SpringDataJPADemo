package com.example.springdata.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.springdata.exception.CasaNaoEncontradaException;
import com.example.springdata.model.Casa;
import com.example.springdata.repository.CasaRepository;

@Service
public class CasaService {

	@Autowired
	private CasaRepository casaRepository;

	public List<Casa> getCasas() {
		return this.casaRepository.findAll();
	}

	public Casa getCasa(final Long id) {
		final Optional<Casa> casaOptional = this.casaRepository.findById(id);
		if (!casaOptional.isPresent()) {
			throw new CasaNaoEncontradaException();
		}
		return casaOptional.get();
	}

	public void deleteCasa(final Long id) {
		final Optional<Casa> casaOptional = this.casaRepository.findById(id);
		if (casaOptional.isPresent()) {
			this.casaRepository.deleteById(id);
		} else {
			throw new CasaNaoEncontradaException();
		}
	}

	public Casa createCasa(final Casa casa) {
		this.casaRepository.save(casa);
		return casa;
	}

	public Casa updateCasa(final Long id, final Casa casa) {
		final Optional<Casa> casaOptional = this.casaRepository.findById(id);
		if (!casaOptional.isPresent()) {
			throw new CasaNaoEncontradaException();
		}
		casa.setId(id);
		this.casaRepository.save(casa);
		return casa;
	}


}
