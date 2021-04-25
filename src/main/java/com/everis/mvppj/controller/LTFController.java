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

import com.everis.mvppj.model.LTF;
import com.everis.mvppj.service.LTFService;

@RestController
@RequestMapping("ltf")
public class LTFController {

	@Autowired
	LTFService LTFService;
	
	
	@GetMapping
	public List<LTF> listaAll(){
		return LTFService.findAll();
	}
	
	@GetMapping(path = "/{id}")
	public LTF getLTF(@PathParam(value = "id") Long id) {
		return LTFService.getOne(id);
	}
	
	@PostMapping
	public LTF criaLTF(@RequestBody LTF LTF) {
		return LTFService.save(LTF);
	}
	
	@PutMapping
	public LTF atualizaLTF(@RequestBody LTF LTF) {
		return LTFService.save(LTF);
	}
	
}
