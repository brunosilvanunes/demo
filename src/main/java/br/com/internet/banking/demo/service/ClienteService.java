package br.com.internet.banking.demo.service;

import java.util.List;

import br.com.internet.banking.demo.model.DTO.ClienteDTO;

public interface ClienteService {

	public void cadastrarCliente(ClienteDTO cliente);

	public List<ClienteDTO> listaCliente();
}
