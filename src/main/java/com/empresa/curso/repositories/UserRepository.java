package com.empresa.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empresa.curso.entities.User;

// não precisa de anotação de repository, porque já está herdando o Jpa,
// e o Jpa já é registrado no java spring. se tratando de injeção de dependencia.
public interface UserRepository extends JpaRepository<User, Long> {

}
