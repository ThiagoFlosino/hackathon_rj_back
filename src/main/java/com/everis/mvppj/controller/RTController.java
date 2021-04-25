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

import com.everis.mvppj.model.RT;
import com.everis.mvppj.service.RTService;

@RestController
@RequestMapping("rt")
public class RTController {

	@Autowired
	RTService RTService;
	
	
	@GetMapping
	public List<RT> listaAll(){
		return RTService.findAll();
	}
	
	@GetMapping(path = "/{id}")
	public RT getRT(@PathParam(value = "id") Long id) {
		return RTService.getOne(id);
	}
	
	@PostMapping
	public RT criaRT(@RequestBody RT RT) {
		return RTService.save(RT);
	}
	
	@PutMapping
	public RT atualizaRT(@RequestBody RT RT) {
		return RTService.save(RT);
	}
	
}
