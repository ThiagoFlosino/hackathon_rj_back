package com.everis.mvppj.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.everis.mvppj.model.Squad;

public interface SquadRepository extends JpaRepository<Squad, Long> {
	

}
