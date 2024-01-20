package com.remedios.wallisson.curso.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.remedios.wallisson.curso.remedio.DadosCadastroRemedio;

@RestController
@RequestMapping("/remedios")
public class RemedioController {
	
	@PostMapping
	public void cadastrar(@RequestBody DadosCadastroRemedio dados) //ESTE É O DTO :D
	{
		System.out.println(dados);
	}

}
