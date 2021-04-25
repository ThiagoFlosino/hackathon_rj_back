package com.everis.mvppj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.mvppj.model.Gerente;
import com.everis.mvppj.repository.GerenteRepository;

@Service
public class GerenteService {
	
	@Autowired
	private GerenteRepository gerenteRepository;
	
	public List<Gerente> findAll(){
		return gerenteRepository.findAll();
	}
	
	public Gerente getOne(Long id) {
		return gerenteRepository.getOne(id);
	}
	
	public Gerente save(Gerente Gerente) {
		return gerenteRepository.save(Gerente);
	}

}
