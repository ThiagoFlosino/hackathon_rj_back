package com.everis.mvppj.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.mvppj.model.ClientMember;
import com.everis.mvppj.model.Developer;
import com.everis.mvppj.service.ClientMemberService;

@RestController
@RequestMapping("membro_itau")
public class ClientMemberController {
	
	@Autowired
	ClientMemberService clientMemberService;
	
	
	
	@GetMapping
	public List<ClientMember> listaTodosDevelopers(){
		return clientMemberService.getAll();
	}
	
	@GetMapping(path = "/{id}")
	public ClientMember getDeveloper(@PathParam(value = "id") Long id) {
		return clientMemberService.getOne(id);
	}
	
	@PostMapping
	public ClientMember criaDeveloper(@RequestBody ClientMember dev) {
		return clientMemberService.save(dev);
	}
	
	@PutMapping
	public ClientMember atualizaDeveloper(@RequestBody ClientMember dev) {
		return clientMemberService.save(dev);
	}
	

}
