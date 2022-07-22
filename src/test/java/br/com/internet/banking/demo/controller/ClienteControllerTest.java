package br.com.internet.banking.demo.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import br.com.internet.banking.demo.model.DTO.ClienteDTO;
import br.com.internet.banking.demo.service.ClienteService;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
@ExtendWith(MockitoExtension.class)
public class ClienteControllerTest {

	@Mock
	private ClienteService service;
	
	@InjectMocks
	private ClienteController controller;
	
	@Test
	public void listagemClienteTest() {
		Mockito.when(service.listaCliente()).thenReturn(new ArrayList<ClienteDTO>());
		Assert.assertNotNull(controller.listaCliente());
	}
	
	@Test
	public void cadastrarClienteTest() {
		ClienteDTO dto = new ClienteDTO();
		
		dto.setNome("teste");
		dto.setPlanoExclusive(false);
		dto.setSaldo(BigDecimal.valueOf(1000));
		dto.setNumeroConta("00000-0");
		dto.setDataNascimento(new Date());
		
		Assert.assertNotNull(controller.cadastrarCliente(dto));
	}
	
}
