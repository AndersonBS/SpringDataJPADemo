package com.example.springdata.dto.response;

import java.util.ArrayList;
import java.util.List;
import com.example.springdata.model.Casa;

public class CasaResponseListDTO {

	private List<CasaResponseDTO> casaList = new ArrayList<>();

	public CasaResponseListDTO() {
		super();
	}

	public CasaResponseListDTO(final List<Casa> casaList) {
		super();
		if (casaList != null) {
			for (final Casa casa: casaList) {
				this.casaList.add(new CasaResponseDTO(casa));
			}
		}
	}

	public List<CasaResponseDTO> getCasaList() {
		return this.casaList;
	}

	public void setCasaList(final List<CasaResponseDTO> casaList) {
		this.casaList = casaList;
	}

}
