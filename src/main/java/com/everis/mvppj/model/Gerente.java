package com.everis.mvppj.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class Gerente extends Person implements Serializable{

	private static final long serialVersionUID = 4189003935312570505L;

	@OneToMany(orphanRemoval = false, mappedBy = "id", fetch = FetchType.EAGER)
	private List<Lider> lideres;

}
