package br.org.generation.blogPessoal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.org.generation.blogPessoal.model.Postagem;
import br.org.generation.blogPessoal.repository.RepositoryPostagens;

@RestController
@RequestMapping("/postagens")
@CrossOrigin(origins ="*",allowedHeaders = "*")
public class ControllerPostagens {
	
	@Autowired
	private RepositoryPostagens repositorio;

	//metodo get
	@GetMapping
	public ResponseEntity<List<Postagem>>getAll(){
		return ResponseEntity.ok(repositorio.findAll());
	}
	
}