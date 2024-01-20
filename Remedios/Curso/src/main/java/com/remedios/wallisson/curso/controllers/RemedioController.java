package com.remedios.wallisson.curso.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.remedios.wallisson.curso.remedio.DadosCadastroRemedio;
import com.remedios.wallisson.curso.remedio.Remedio;
import com.remedios.wallisson.curso.remedio.RemedioRepository;

@RestController
@RequestMapping("/remedios")
public class RemedioController {
	
	@Autowired
	private RemedioRepository repository; // 1 - INJETANDO O REPOSITORIO
	
	@PostMapping
	public void cadastrar(@RequestBody DadosCadastroRemedio dados) //ESTE É O DTO :D
	{
		repository.save(new Remedio(dados)); // 2 - ESTE REPOSITORIO VAI USAR O MÉTODO SAVE PARA CRIAR UM NOVO OBJETO REMEDIO SEM PRECISAR SUJAR NOSSO CODIGO
		
	}

}
