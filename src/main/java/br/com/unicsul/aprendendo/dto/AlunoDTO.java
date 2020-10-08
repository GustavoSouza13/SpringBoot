package br.com.unicsul.aprendendo.dto;

import java.io.Serializable;

public class AlunoDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String nome;
	private String sobrenome;
	
	public AlunoDTO() {
		
	}

	public AlunoDTO(String nome, String sobrenome) {
		this.nome = nome;
		this.sobrenome = sobrenome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
}
