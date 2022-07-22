package br.com.internet.banking.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.internet.banking.demo.model.Cliente;

@Repository
public interface IClienteRepository extends CrudRepository<Cliente, Long> {
}
