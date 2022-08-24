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
import com.example.springdata.dto.request.CorRequestDTO;
import com.example.springdata.dto.response.CorResponseDTO;
import com.example.springdata.dto.response.CorResponseListDTO;
import com.example.springdata.model.Cor;
import com.example.springdata.service.CorService;

@RestController
@RequestMapping("api/cor")
public class CorController {

	@Autowired
	private CorService corService;

	@GetMapping(value = "/get")
	public ResponseEntity<CorResponseListDTO> getCores() {
		return ResponseEntity.ok(new CorResponseListDTO(this.corService.getCores()));
	}

	@GetMapping(value = "/get/{id}")
	public ResponseEntity<CorResponseDTO> getCor(@PathVariable final Long id) {
		return ResponseEntity.ok(new CorResponseDTO(this.corService.getCor(id)));
	}

	@DeleteMapping(value = "/delete/{id}")
	public ResponseEntity<Void> deleteCor(@PathVariable final Long id) {
		this.corService.deleteCor(id);
		return ResponseEntity.noContent().build();
	}

	@PostMapping(value = "/create")
	public ResponseEntity<CorResponseDTO> createCor(@RequestBody final CorRequestDTO corRequestDTO) {
		final Cor cor = new Cor(corRequestDTO.getNome(), corRequestDTO.getR(), corRequestDTO.getG(), corRequestDTO.getB());
		return new ResponseEntity<>(new CorResponseDTO(this.corService.createCor(cor)), HttpStatus.CREATED);
	}

	@PutMapping(value = "/update/{id}")
	public ResponseEntity<CorResponseDTO> updateCor(@PathVariable final Long id,
			@RequestBody final CorRequestDTO corRequestDTO) {
		final Cor cor = new Cor(corRequestDTO.getNome(), corRequestDTO.getR(), corRequestDTO.getG(), corRequestDTO.getB());
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(new CorResponseDTO(this.corService.updateCor(id, cor)));
	}

}
