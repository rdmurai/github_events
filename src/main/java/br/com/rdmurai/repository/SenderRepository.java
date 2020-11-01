package br.com.rdmurai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.rdmurai.model.Sender;

@Repository
public interface SenderRepository extends JpaRepository<Sender, Long>{

}
