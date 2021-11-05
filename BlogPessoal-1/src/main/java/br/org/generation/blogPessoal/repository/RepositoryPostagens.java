package br.org.generation.blogPessoal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.org.generation.blogPessoal.model.Postagem;

public interface RepositoryPostagens extends JpaRepository<Postagem, Long> {

}
