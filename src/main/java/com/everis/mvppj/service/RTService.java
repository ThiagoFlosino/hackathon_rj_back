package com.everis.mvppj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.mvppj.model.RT;
import com.everis.mvppj.repository.RTRepository;

@Service
public class RTService {

	@Autowired
	private RTRepository RTRepository;
	
	public List<RT> findAll(){
		return RTRepository.findAll();
	}
	
	public RT getOne(Long id) {
		return RTRepository.getOne(id);
	}
	
	public RT save(RT rt) {
		return RTRepository.save(rt);
	}

}
