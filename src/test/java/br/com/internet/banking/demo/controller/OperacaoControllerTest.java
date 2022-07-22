package br.com.internet.banking.demo.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import br.com.internet.banking.demo.service.OperacaoService;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
@ExtendWith(MockitoExtension.class)
public class OperacaoControllerTest {
	
	@InjectMocks
	private OperacaoController controller;

	@Mock
	private OperacaoService service;
	
	@Test
	public void saqueTest() {
		Assert.assertNotNull(controller.sacar(Long.valueOf(0), Long.valueOf(0)));
	}

	
}
