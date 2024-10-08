package br.com.cesul.springcesulapi.repository;

import br.com.cesul.springcesulapi.entidade.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessorRepository extends JpaRepository<Aluno, Integer> {
}
