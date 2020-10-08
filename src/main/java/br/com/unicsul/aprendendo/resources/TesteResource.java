package br.com.unicsul.aprendendo.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.unicsul.aprendendo.domains.Aluno;
import br.com.unicsul.aprendendo.services.AlunoService;

@RestController
@RequestMapping(value="/rogerin")
public class TesteResource {
	@Autowired
	private AlunoService alunoService;
	
	@GetMapping
	public ResponseEntity<List<Aluno>> findAll() {
		List<Aluno> list = alunoService.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Aluno> findById(@PathVariable Integer id) {
		Aluno aluno = alunoService.findById(id);
		return ResponseEntity.ok().body(aluno);
	}
	
	@PostMapping
	public ResponseEntity<Aluno> insert(@RequestBody Aluno aluno) {
		aluno = alunoService.insert(aluno);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}").buildAndExpand(aluno.getRa()).toUri();
		return ResponseEntity.created(uri).body(aluno);
	}
	
}
