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

import com.everis.mvppj.model.Gerente;
import com.everis.mvppj.service.GerenteService;

@RestController
@RequestMapping("gerente")
public class GerenteController {

	@Autowired
	GerenteService gerenteService;
	
	
	@GetMapping
	public List<Gerente> listaAll(){
		return gerenteService.findAll();
	}
	
	@GetMapping(path = "/{id}")
	public Gerente getGerente(@PathParam(value = "id") Long id) {
		return gerenteService.getOne(id);
	}
	
	@PostMapping
	public Gerente criaGerente(@RequestBody Gerente lider) {
		return gerenteService.save(lider);
	}
	
	@PutMapping
	public Gerente atualizaGerente(@RequestBody Gerente lider) {
		return gerenteService.save(lider);
	}
	
}
