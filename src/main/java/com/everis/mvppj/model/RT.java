package com.everis.mvppj.model;

import java.io.Serializable;
import java.util.ArrayList;
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
public class RT implements Serializable{
	
	private static final long serialVersionUID = 1808533846840679410L;

	@GeneratedValue
    @Id
	private Long id;

	@OneToMany
	@JoinColumn(name = "squad_id")
	private List<Squad> squads = new ArrayList<>();
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="lider_id", nullable=false)
	private Lider lider;
	
	
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="ltf_id", nullable=false)
	private LTF ltf;

}
