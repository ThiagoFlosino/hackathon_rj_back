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

import com.everis.mvppj.model.Developer;
import com.everis.mvppj.service.DeveloperService;

@RestController
@RequestMapping("developer")
public class DeveloperController {
	
	@Autowired
	DeveloperService developerService;
	
	
	@GetMapping
	public List<Developer> listaTodosDevelopers(){
		return developerService.getAll();
	}
	
	@GetMapping(path = "/{id}")
	public Developer getDeveloper(@PathParam(value = "id") Long id) {
		return developerService.getOne(id);
	}
	
	@PostMapping
	public Developer criaDeveloper(@RequestBody Developer dev) {
		return developerService.save(dev);
	}
	
	@PutMapping
	public Developer atualizaDeveloper(@RequestBody Developer dev) {
		return developerService.save(dev);
	}
	
	@GetMapping(path = "/squad")
	public List<Developer> listaDevSemSquad(){
		return developerService.listaDevSemSquad();
	}
	
	@GetMapping(path = "/squad/{idSquad}")
	public List<Developer> listaDevPorSquad(@PathParam(value = "idSquad") Long idSquad){
		return developerService.listaDevPorSquad(idSquad);
	}

}
