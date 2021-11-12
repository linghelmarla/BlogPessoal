package br.org.generation.blogPessoal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.org.generation.blogPessoal.model.Postagem;

public interface PostagensRepository extends JpaRepository<Postagem, Long> {

	Object findAllByTituloContainingIgnoreCase(String titulo);

}
