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

import com.everis.mvppj.model.Squad;
import com.everis.mvppj.service.SquadService;

@RestController
@RequestMapping("squad")
public class SquadController {
	
	@Autowired
	SquadService squadService;
	
	
	@GetMapping
	public List<Squad> listaAll(){
		return squadService.findAll();
	}
	
	@GetMapping(path = "/{id}")
	public Squad getSquad(@PathParam(value = "id") Long id) {
		return squadService.getOne(id);
	}
	
	@PostMapping
	public Squad criaSquad(@RequestBody Squad dev) {
		return squadService.save(dev);
	}
	
	@PutMapping
	public Squad atualizaSquad(@RequestBody Squad dev) {
		return squadService.save(dev);
	}
	
	

}
