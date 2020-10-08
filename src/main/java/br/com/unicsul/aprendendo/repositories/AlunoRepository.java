package br.com.unicsul.aprendendo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.unicsul.aprendendo.domains.Aluno;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Integer> {
	
}
