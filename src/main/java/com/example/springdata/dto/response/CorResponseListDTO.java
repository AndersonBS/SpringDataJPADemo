package com.example.springdata.dto.response;

import java.util.ArrayList;
import java.util.List;
import com.example.springdata.model.Cor;

public class CorResponseListDTO {

	private List<CorResponseDTO> corList = new ArrayList<>();

	public CorResponseListDTO() {
		super();
	}

	public CorResponseListDTO(final List<Cor> corList) {
		super();
		if (corList != null) {
			for (final Cor cor : corList) {
				this.corList.add(new CorResponseDTO(cor));
			}
		}
	}

	public List<CorResponseDTO> getCorList() {
		return this.corList;
	}

	public void setCorList(final List<CorResponseDTO> corList) {
		this.corList = corList;
	}

}
