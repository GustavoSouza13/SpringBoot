package br.com.unicsul.aprendendo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.unicsul.aprendendo.domains.Aluno;
import br.com.unicsul.aprendendo.dto.AlunoDTO;
import br.com.unicsul.aprendendo.repositories.AlunoRepository;

@Service
public class AlunoService {
	@Autowired
	private AlunoRepository alunoRepository;
	
	public List<Aluno> findAll() {
		List<Aluno> list = alunoRepository.findAll();
		return list;
	}
	
	public Aluno findById(Integer id) {
		Optional<Aluno> aluno = alunoRepository.findById(id);
		return aluno.orElse(null);
	}
	
	public Aluno insert(Aluno aluno) {
		aluno.setRa(null);
		return alunoRepository.save(aluno);
	}
	
	public void delete(Integer id) {
		Aluno aluno = findById(id);
		alunoRepository.delete(aluno);
	}
	
	public Aluno update(Integer id, AlunoDTO alunoNovo) {
		Aluno alunoAtual = findById(id);
		updateData(alunoAtual, alunoNovo);
		return alunoRepository.save(alunoAtual);
	}
	
	private void updateData(Aluno alunoAtual, AlunoDTO alunoNovo) {
		alunoAtual.setNome(alunoNovo.getNome());
		alunoAtual.setSobrenome(alunoNovo.getSobrenome());
	}
	
}
