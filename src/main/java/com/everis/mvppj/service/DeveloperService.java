package com.everis.mvppj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.mvppj.model.Developer;
import com.everis.mvppj.model.Squad;
import com.everis.mvppj.repository.DeveloperRepository;

@Service
public class DeveloperService {

	@Autowired
	private DeveloperRepository developerRepository;
	@Autowired
	private SquadService squadService;
	
	public List<Developer> getAll(){
		return developerRepository.findAll();
	}

	public Developer getOne(Long id) {
		return developerRepository.getOne(id);
	}
	
	public Developer save(Developer dev) {
		return developerRepository.save(dev);
	}
	
	public List<Developer> listaDevSemSquad(){
		return developerRepository.findBySquadIsNull();
	}

	public List<Developer> listaDevPorSquad(Long idSquad) {
		
		Squad squad = squadService.getOne(idSquad);
		
		if(squad != null) {			
			return developerRepository.findBySquad(squad);
		}
		return null;
	}
}
