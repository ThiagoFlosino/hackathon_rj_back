package com.everis.mvppj.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class LTF extends Person implements Serializable {
	

	private static final long serialVersionUID = -8567934282850521025L;
	
	@GeneratedValue
    @Id
	private Long id;

}
