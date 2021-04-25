package com.everis.mvppj.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.everis.mvppj.model.Developer;
import com.everis.mvppj.model.Squad;

public interface DeveloperRepository extends JpaRepository<Developer, Long> {
	
	List<Developer> findBySquadIsNull();

	List<Developer> findBySquad(Squad squad);
	

}
