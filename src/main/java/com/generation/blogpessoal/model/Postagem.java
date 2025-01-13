package com.generation.blogpessoal.model;

import java.time.LocalDateTime;

import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity //indica que a classe é uma tabela
@Table(name = "tb_postagens") //intica o nome da tabela
public class Postagem {
	
	@Id //CHAVE PRIMARIA
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Auto icrement
	private Long id;
	
	@NotBlank(message = "Esse campo é obrigatório")
	@Size(min = 5, max = 100, message = "Digite no minimo 5 ou no maxímo 100 caracteres")
	private String titulo;
	
	@NotBlank(message = "Esse campo é obrigatório")
	@Size(min = 10, max = 1000, message = "Digite no minimo 10 ou no maxímo 1000 caracteres")
	private String texto;
	
	@UpdateTimestamp // ele atualiza o horario em tempo real
	private LocalDateTime data; // Data 10/10/2025 e horários
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public LocalDateTime getData() {
		return data;
	}
	public void setData(LocalDateTime data) {
		this.data = data;
	}

	
	
}
