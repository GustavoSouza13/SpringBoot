package br.com.unicsul.aprendendo.domains;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Aluno implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer ra;
	private String nome;
	private String sobrenome;
	private String dataNasc;
	private Integer curso;
	
	public Aluno() {
		
	}
	
	public Aluno(Integer ra, String nome, String sobrenome, String dataNasc, Integer curso) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.ra = ra;
		this.dataNasc = dataNasc;
		this.curso = curso;
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
	public Integer getRa() {
		return ra;
	}
	public void setRa(Integer ra) {
		this.ra = ra;
	}
	public String getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}
	public Integer getCurso() {
		return curso;
	}
	public void setCurso(Integer curso) {
		this.curso = curso;
	}

	public Aluno(int ra) {
		super();
		this.ra = ra;
	}
}
