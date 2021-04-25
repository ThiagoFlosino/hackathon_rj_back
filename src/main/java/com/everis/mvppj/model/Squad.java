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

import org.hibernate.validator.NotNull;
import org.hibernate.validator.Size;

import lombok.Data;

@Data
@Entity
public class Squad implements Serializable{

	private static final long serialVersionUID = 7189149307190433207L;

	@GeneratedValue
    @Id
    private Long id;
    
    @NotNull
    @Size(max = 60, min = 1)
    private String name;

    private String urlAgenda;	

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="product_owner_id", nullable=false)
    private ClientMember productOwner;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="team_lead_id", nullable=false)
    private ClientMember teamLead;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="tech_lead_id", nullable=false)
    private ClientMember techLead;
    
    
    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name= "id")
    private List<Developer> developers;

    
}
