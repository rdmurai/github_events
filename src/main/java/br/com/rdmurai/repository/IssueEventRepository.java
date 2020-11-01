package br.com.rdmurai.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.rdmurai.model.IssueEvent;

@Repository
public interface IssueEventRepository extends JpaRepository<IssueEvent, Long>{
	
	@Query(value = "select * from issue_event a where a.id = ?1 ", nativeQuery = true)
	List<IssueEvent> findAllByIssueId(Long id);
}
