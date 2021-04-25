package com.everis.mvppj.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.hibernate.validator.NotNull;
import org.hibernate.validator.Size;

import br.com.caelum.stella.hibernate.validator.CPF;
import lombok.Data;

@Data
@MappedSuperclass
public abstract class Person implements Serializable{

	private static final long serialVersionUID = 9120439491280022437L;

	@GeneratedValue
    @Id
	private Long id;
  
    @CPF
    private String cpf;

    @NotNull
    @Size(max = 60, min = 1)
    private String nome;
    private String avatar;

    @NotNull
    private Number matriculaGECO;

    @NotNull
    private Number rateGECO;

    @NotNull
    private LocalDate birthDate;

    @NotNull
    private String telephone;

}
