package br.com.unicsul.aprendendo.configs;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.unicsul.aprendendo.domains.Aluno;
import br.com.unicsul.aprendendo.repositories.AlunoRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	@Autowired
	private AlunoRepository alunoRepository; 
	
	@Override
	public void run(String... args) throws Exception {
		Aluno a1 = new Aluno(null, "Gabriel", "Zika", "ComeçoDosTempos", 33);
		Aluno a2 = new Aluno(null, "Pedro", "Montesquieu", "07/10/2000", 48);
		Aluno a3 = new Aluno(null, "Roger", "Menezes", "17/09/1989", 51);
		
		alunoRepository.saveAll(Arrays.asList(a1, a2, a3));
	}
}
