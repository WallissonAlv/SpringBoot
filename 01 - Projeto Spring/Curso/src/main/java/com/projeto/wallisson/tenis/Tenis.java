package com.projeto.wallisson.tenis;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table (name = "Tenis01")
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
@EqualsAndHashCode(of = "id")	//Com a dependencia Lombok não precisamos criar os Getters e os Setters nem os construtores...

@Entity
public class Tenis {
	
	// ATRIBUTOS ------------------------------------------------------------ 
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nome;
	private String tamanhous;
	private String tamanhobr;
	private String cabedal;
	private tipo tipo;
	@Enumerated(EnumType.STRING)
	private transportadora transportadora;
	
	//MÉTODOS PRINCIPAIS -----------------------------------------------------
	
	public Tenis(DadosCadastroTenis dados) {
		this.nome = dados.nome();
		this.tamanhous = dados.tamanhous();
		this.tamanhobr = dados.tamanhobr();
		this.cabedal = dados.cabedal();
		this.tipo = dados.tipo();
		this.transportadora = dados.transportadora();
	}
	
	// MÉTODOS ESPECIAIS ----------------------------------------------------
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTamanhous() {
		return tamanhous;
	}
	public void setTamanhous(String tamanhous) {
		this.tamanhous = tamanhous;
	}
	public String getTamanhobr() {
		return tamanhobr;
	}
	public void setTamanhobr(String tamanhobr) {
		this.tamanhobr = tamanhobr;
	}
	public String getCabedal() {
		return cabedal;
	}
	public void setCabedal(String cabedal) {
		this.cabedal = cabedal;
	}
	public tipo getTipo() {
		return tipo;
	}
	public void setTipo(tipo tipo) {
		this.tipo = tipo;
	}

}
