package com.empresa.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empresa.curso.entities.Order;

// não precisa de anotação de repository, porque já está herdando o Jpa,
// e o Jpa já é registrado no java spring. se tratando de injeção de dependencia.
public interface OrderRepository extends JpaRepository<Order, Long> {

}
