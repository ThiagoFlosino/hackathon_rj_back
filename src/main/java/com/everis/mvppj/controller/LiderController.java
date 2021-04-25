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

import com.everis.mvppj.model.Lider;
import com.everis.mvppj.service.LiderService;

@RestController
@RequestMapping("lider")
public class LiderController {

	@Autowired
	LiderService liderService;
	
	
	@GetMapping
	public List<Lider> listaAll(){
		return liderService.findAll();
	}
	
	@GetMapping(path = "/{id}")
	public Lider getLider(@PathParam(value = "id") Long id) {
		return liderService.getOne(id);
	}
	
	@PostMapping
	public Lider criaLider(@RequestBody Lider lider) {
		return liderService.save(lider);
	}
	
	@PutMapping
	public Lider atualizaLider(@RequestBody Lider lider) {
		return liderService.save(lider);
	}
	
}
