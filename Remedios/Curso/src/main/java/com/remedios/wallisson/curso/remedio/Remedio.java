package com.remedios.wallisson.curso.remedio;

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
import lombok.Setter;
import lombok.NoArgsConstructor;



@Entity(name = "remedios")	// ESSA CLASSE SERÁ UMA ENTIDADE
@Table (name = "Remedio") 	// TABELA DO BANCO DE DADOS
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")

public class Remedio { 		// ISTO É UMA ENTIDADE !!!
	
	@Id 
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id;
	private String nome;
	@Enumerated(EnumType.STRING)
	private Via via;
	private String lote; 
	private String quantidade;
	private String validade;
	@Enumerated(EnumType.STRING)
	private Laboratorio laboratorio;
	
	//METODOS ESPECIAIS -------------------------------
	//GETTERS -----------------------------------------
	
	public Long getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public Via getVia() {
		return via;
	}
	public String getLote() {
		return lote;
	}
	public String getQuantidade() {
		return quantidade;
	}
	public String getValidade() {
		return validade;
	}
	public Laboratorio getLaboratorio () {
		return laboratorio;
	}
	
	//SETTERS -----------------------------------------
	
	public void setId(Long id) {
		this.id = id;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setVia(Via via) {
		this.via = via;
	}
	public void setLote(String lote) {
		this.lote = lote;
	}
	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}
	public void setValidade(String validade) {
		this.validade = validade;
	}
	public void setLaboratorio(Laboratorio laboratorio) {
		this.laboratorio = laboratorio;
	}
}
