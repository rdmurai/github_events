package br.com.rdmurai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.rdmurai.model.User;

@Repository
public interface UserRepository  extends JpaRepository<User, Long>{

}
