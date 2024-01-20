package com.remedios.wallisson.curso.remedio;

public record DadosCadastroRemedio ( // ISTO E UM DTO!!!
		String nome,
		Via via, 
		String lote, 
		String quantidade,
		String validade, 
		Laboratorio laboratorio) {

}
