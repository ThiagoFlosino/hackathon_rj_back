package com.everis.mvppj.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.validator.Email;
import org.hibernate.validator.NotNull;
import org.hibernate.validator.Size;

import lombok.Data;

@Data
@Entity
public class ClientMember implements Serializable{

	private static final long serialVersionUID = 342932322782621986L;
	
	@GeneratedValue
    @Id
	private Long id;

    @NotNull
    @Size(max = 60, min = 1)
    private String name;

    @NotNull
    private String RACF;

    @Email
    private String email;

}
