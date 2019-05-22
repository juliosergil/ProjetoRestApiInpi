package com.inpi.api.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
@Getter  @Setter
@Entity(name = "tb_recuperacao")
public class Recuperacao implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4885256012292980114L;
	
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "nu_gru", length = 30, nullable = false)
	private String nu_Gru;
	
	@Column(name = "codservico", length = 30, nullable = false)
	private Long codServico;
	
	@Column(name = "codcliente", length = 30, nullable = false)
	private Long codCliente;
	
	@Column(name = "datcadastro", nullable = false)
	private Date datCadastro;
	
	@Column(name = "nm_login", length = 30, nullable = false)
	private String nm_Login;
	
	@PrePersist
	public void Prepersist() {
		
		final Date dataRec = new Date();
		datCadastro = dataRec;
	}

	@Override
	public String toString() {
		return "Recuperacao [id=" + id + ", nu_Gru=" + nu_Gru + ", codServico=" + codServico + ", codCliente="
				+ codCliente + ", datCadastro=" + datCadastro + ", nm_Login=" + nm_Login + "]";
	}
	
	

}
