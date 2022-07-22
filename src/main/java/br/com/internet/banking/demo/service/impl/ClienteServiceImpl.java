package br.com.internet.banking.demo.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.internet.banking.demo.model.Cliente;
import br.com.internet.banking.demo.model.DTO.ClienteDTO;
import br.com.internet.banking.demo.repository.IClienteRepository;
import br.com.internet.banking.demo.service.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService {
	
	@Autowired
	private IClienteRepository clienteRepository;

	@Override
	public void cadastrarCliente(ClienteDTO clienteDTO) {
		Cliente cliente = new Cliente();
		
		cliente.setNome(clienteDTO.getNome());
		cliente.setPlanoExclusive(clienteDTO.getPlanoExclusive());
		cliente.setSaldo(BigDecimal.valueOf(clienteDTO.getSaldo().longValue()));
		cliente.setNumeroConta(clienteDTO.getNumeroConta());
		cliente.setDataNascimento(clienteDTO.getDataNascimento());
		
		clienteRepository.save(cliente);
		
	}

	@Override
	public List<ClienteDTO> listaCliente() {
		List<ClienteDTO> clientesDTO = new ArrayList<>();
		ClienteDTO clienteDTO = new ClienteDTO();
		
		Iterable<Cliente> clientes = this.clienteRepository.findAll();
		
		for(Cliente lista : clientes) {
			clienteDTO.setNome(lista.getNome());
			clienteDTO.setPlanoExclusive(lista.getPlanoExclusive());
			clienteDTO.setSaldo(lista.getSaldo());
			clienteDTO.setNumeroConta(lista.getNumeroConta());
			clienteDTO.setDataNascimento(lista.getDataNascimento());
			
			clientesDTO.add(clienteDTO);
		}
		
		return clientesDTO;
	}

}
