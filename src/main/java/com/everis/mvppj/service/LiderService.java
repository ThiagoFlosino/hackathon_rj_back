package com.everis.mvppj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.mvppj.model.Lider;
import com.everis.mvppj.model.RT;
import com.everis.mvppj.repository.LiderRepository;

@Service
public class LiderService {
	
	@Autowired
	private LiderRepository liderRepository;
	
	public List<Lider> findAll(){
		return liderRepository.findAll();
	}
	
	public Lider getOne(Long id) {
		return liderRepository.getOne(id);
	}
	
	public Lider save(Lider lider) {
		return liderRepository.save(lider);
	}

}
