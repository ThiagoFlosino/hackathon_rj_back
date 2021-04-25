package com.everis.mvppj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.mvppj.model.Developer;
import com.everis.mvppj.model.Squad;
import com.everis.mvppj.repository.SquadRepository;

@Service
public class SquadService {

	@Autowired
	private SquadRepository squadRepository;
	@Autowired
	private DeveloperService developerService;
	
	public List<Squad> findAll(){
		return squadRepository.findAll();
	}
	
	public Squad getOne(Long id) {
		return squadRepository.getOne(id);
	}
	
	public Squad save(Squad squad) {
		Squad retorno = new Squad();
		for(Developer dev : squad.getDevelopers()){
			dev.setSquad(squad);
		};
		retorno = squadRepository.save(squad);
		
		for(Developer dev : squad.getDevelopers()){
			dev.setSquad(retorno);
			developerService.save(dev);
		};
	
		return retorno;
	}
}
