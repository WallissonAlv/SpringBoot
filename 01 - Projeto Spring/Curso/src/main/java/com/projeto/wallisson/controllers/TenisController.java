package com.projeto.wallisson.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.wallisson.tenis.DadosCadastroTenis;
import com.projeto.wallisson.tenis.Tenis;
import com.projeto.wallisson.tenis.TenisRepository;

@RestController				//Esta Classe vai ser um Controller
@RequestMapping("/tenis")	// Este controller vai ser Acessado por este endereço na URL
public class TenisController {

	@Autowired
	private TenisRepository repository;
	
	@PostMapping
	public void cadastrar(@RequestBody DadosCadastroTenis dados) {
		
		repository.save(new Tenis(dados));
		
	}
}
