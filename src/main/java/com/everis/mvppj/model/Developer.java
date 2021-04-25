package com.everis.mvppj.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
@Entity
public class Developer extends Person implements Serializable{
	
	private static final long serialVersionUID = 801458250063673579L;
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.EAGER)
	private Developer shadow;
	

	@ManyToOne
    @JoinColumn(name="squad_id")
	private Squad squad;
	
	private String PRE;
	private String projetoJira;
	private String macAddress;

	private Number funcional;
	private Number numeroCorporativo;
	private String racf;

	private String email;
	
//	private String serviço;
//	private String tarifa;
//	private String acao;
//	private String observacao;
	

}
