package com.everis.mvppj.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
@Entity
public class Lider extends Person implements Serializable {
	
	private static final long serialVersionUID = 573383123732610688L;
	
	@OneToMany(mappedBy = "id", fetch=FetchType.LAZY)
	private List<RT> listaRts;
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "gerente_id")
	private Gerente gerente;
	
}
