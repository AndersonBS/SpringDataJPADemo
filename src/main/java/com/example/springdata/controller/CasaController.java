package com.example.springdata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.springdata.dto.request.CasaRequestDTO;
import com.example.springdata.dto.response.CasaResponseDTO;
import com.example.springdata.dto.response.CasaResponseListDTO;
import com.example.springdata.model.Casa;
import com.example.springdata.model.Cor;
import com.example.springdata.service.CasaService;
import com.example.springdata.service.CorService;

@RestController
@RequestMapping("api/casa")
public class CasaController {

	@Autowired
	private CasaService casaService;

	@Autowired
	private CorService corService;

	@GetMapping(value = "/get")
	public ResponseEntity<CasaResponseListDTO> getCasas() {
		return ResponseEntity.ok(new CasaResponseListDTO(this.casaService.getCasas()));
	}

	@GetMapping(value = "/get/{id}")
	public ResponseEntity<CasaResponseDTO> getCasa(@PathVariable final Long id) {
		return ResponseEntity.ok(new CasaResponseDTO(this.casaService.getCasa(id)));
	}

	@DeleteMapping(value = "/delete/{id}")
	public ResponseEntity<Void> deleteCasa(@PathVariable final Long id) {
		this.casaService.deleteCasa(id);
		return ResponseEntity.noContent().build();
	}

	@PostMapping(value = "/create")
	public ResponseEntity<CasaResponseDTO> createCasa(@RequestBody final CasaRequestDTO casaRequestDTO) {
		final Cor cor = this.corService.getCor(casaRequestDTO.getIdCor());
		final Casa casa = new Casa(cor, casaRequestDTO.getNumeroQuartos(), casaRequestDTO.getNumeroBanheiros(), casaRequestDTO.getPossuiGaragem());
		return new ResponseEntity<>(new CasaResponseDTO(this.casaService.createCasa(casa)), HttpStatus.CREATED);
	}

	@PutMapping(value = "/update/{id}")
	public ResponseEntity<CasaResponseDTO> updateCasa(@PathVariable final Long id, @RequestBody final CasaRequestDTO casaRequestDTO) {
		final Cor cor = this.corService.getCor(casaRequestDTO.getIdCor());
		final Casa casa = new Casa(cor, casaRequestDTO.getNumeroQuartos(), casaRequestDTO.getNumeroBanheiros(), casaRequestDTO.getPossuiGaragem());
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(new CasaResponseDTO(this.casaService.updateCasa(id, casa)));
	}

}
