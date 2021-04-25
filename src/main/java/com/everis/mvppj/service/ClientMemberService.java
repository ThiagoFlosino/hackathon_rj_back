package com.everis.mvppj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.mvppj.model.ClientMember;
import com.everis.mvppj.model.Squad;
import com.everis.mvppj.repository.ClientMemberRepository;


@Service
public class ClientMemberService {

	
	@Autowired
	ClientMemberRepository clientMemberRepository;
	
	@Autowired
	private SquadService squadService;
	
	public List<ClientMember> getAll() {
		return clientMemberRepository.findAll();
	}

	public ClientMember getOne(Long id) {
		return clientMemberRepository.getOne(id);
	}

	public ClientMember save(ClientMember dev) {
		return clientMemberRepository.save(dev);
	}

	
}
