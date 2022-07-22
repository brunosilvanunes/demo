package br.com.internet.banking.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.internet.banking.demo.service.OperacaoService;

@RestController
@RequestMapping("/operacao")
public class OperacaoController {

	@Autowired
	private OperacaoService operacaoService;

	@PutMapping("/saque/{id}/{valorSaque}")
	public ResponseEntity<?> sacar(@PathVariable Long id, @PathVariable Long valorSaque) {
		try {
			this.operacaoService.sacar(id, valorSaque);
			
			return ResponseEntity.ok().build();
		} catch (Exception e) {
			
		}
		
		return null;
	}

}
