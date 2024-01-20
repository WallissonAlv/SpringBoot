package com.remedios.wallisson.curso.remedio;

public record DadosCadastroRemedio (
		String nome,
		Via via, 
		String lote, 
		String quantidade,
		String validadea, 
		Laboratorio laboratorio) {

}
