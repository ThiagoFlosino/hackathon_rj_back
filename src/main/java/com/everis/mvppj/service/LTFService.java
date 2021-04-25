package com.everis.mvppj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.mvppj.model.LTF;
import com.everis.mvppj.repository.LTFRepository;

@Service
public class LTFService {
	
	@Autowired
	private LTFRepository ltfRepository;
	
	public List<LTF> findAll(){
		return ltfRepository.findAll();
	}
	
	public LTF getOne(Long id) {
		return ltfRepository.getOne(id);
	}
	
	public LTF save(LTF dev) {
		return ltfRepository.save(dev);
	}

}
