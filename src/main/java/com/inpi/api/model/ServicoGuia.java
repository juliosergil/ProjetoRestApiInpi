package com.inpi.api.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter  @Setter
@Entity(name = "tb_servicoguia")
public class ServicoGuia implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7158559269276237648L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "codservico", length = 30, nullable = false)
	private Long codServico;
	
	@Column(name = "numnossonumero", length = 30, nullable = false)
	private String numNossoNumero;
	
	@Column(name = "codnatureza", length = 30, nullable = false)
	private Long codNatureza;

	@Override
	public String toString() {
		return "ServicoGuia [id=" + id + ", codServico=" + codServico + ", numNossoNumero=" + numNossoNumero
				+ ", codNatureza=" + codNatureza + "]";
	}
	
	

}
