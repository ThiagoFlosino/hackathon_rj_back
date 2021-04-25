package com.everis.mvppj.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.mvppj.model.Gerente;
import com.everis.mvppj.model.Lider;
import com.everis.mvppj.repository.GerenteRepository;
import com.everis.mvppj.repository.LiderRepository;
import com.everis.mvppj.util.Util;

@RestController
@RequestMapping("books-rest")
public class TesteController {
	
	@Autowired
	GerenteRepository gerenteRepository;
	@Autowired LiderRepository liderRepository;

	@GetMapping()
	public List<Gerente> getGerente() {
		liderRepository.deleteAll();
		gerenteRepository.deleteAll();
		
		init();
		
		return gerenteRepository.findAll();
	}
	
	
	private void init() {
		Gerente gerente = new Gerente();		
		gerente = (Gerente) Util.preenchePessoa(gerente);
		
		gerente.setNome("Daniela Paranhas");
		
		Lider lider1 = new Lider();
		Lider lider2 = new Lider();
		
		lider1 = (Lider) Util.preenchePessoa(lider1);
		lider2 = (Lider) Util.preenchePessoa(lider2);
		
		lider1.setNome("Aline");
		lider2.setNome("Juliana");
		
		ArrayList<Lider> lideres = new ArrayList<>();
		lideres.add(lider1);
		lideres.add(lider2);
		gerenteRepository.save(gerente);
		
		gerente.setLideres(lideres);
		
		liderRepository.saveAll(lideres);

		for(Lider l : lideres){
			l.setAvatar("https://avatars.dicebear.com/api/bottts/"+l.getNome()+".svg");
			l.setGerente(gerente);
		};
		gerenteRepository.save(gerente);
	}

}
