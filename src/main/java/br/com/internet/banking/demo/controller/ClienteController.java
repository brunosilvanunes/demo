package br.com.internet.banking.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.internet.banking.demo.model.DTO.ClienteDTO;
import br.com.internet.banking.demo.service.ClienteService;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

	@Autowired
	private ClienteService clientService;
	
	@GetMapping("/listar")
	public List<ClienteDTO> listaCliente() {
		List<ClienteDTO> cliente = this.clientService.listaCliente();
		
		return cliente;
	}
	
	@PostMapping("/cadastrar")
	public ResponseEntity<String> cadastrarCliente(@RequestBody ClienteDTO cliente) {
		this.clientService.cadastrarCliente(cliente);
		
		return ResponseEntity.status(HttpStatus.OK).body("OK");
	}
	
}
