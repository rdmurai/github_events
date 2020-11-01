package br.com.rdmurai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.rdmurai.model.Issue;

@Repository
public interface IssueRepository extends JpaRepository<Issue, Long>{

}
