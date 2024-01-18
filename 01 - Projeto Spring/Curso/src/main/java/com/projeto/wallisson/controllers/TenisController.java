package com.projeto.wallisson.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController				//Esta Classe vai ser um Controller
@RequestMapping("/tenis")	// Este controller vai ser Acessado por este endereço na URL
public class TenisController {

	@PostMapping
	public void cadastrar(@RequestBody String json) {
		System.out.println(json);	
	}
}
