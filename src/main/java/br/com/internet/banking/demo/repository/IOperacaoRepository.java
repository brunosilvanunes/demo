package br.com.internet.banking.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.internet.banking.demo.model.Cliente;

@Repository
public interface IOperacaoRepository extends  CrudRepository<Cliente, Long>{
}
