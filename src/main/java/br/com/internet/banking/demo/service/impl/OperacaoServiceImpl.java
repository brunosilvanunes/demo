package br.com.internet.banking.demo.service.impl;

import java.math.BigDecimal;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.internet.banking.demo.model.Cliente;
import br.com.internet.banking.demo.repository.IOperacaoRepository;
import br.com.internet.banking.demo.service.OperacaoService;

@Service
public class OperacaoServiceImpl implements OperacaoService {

	@Autowired
	private IOperacaoRepository repository;

	@Override
	public void sacar(Long id, Long valorSaque) {
		Long taxaAdiministracaoMenor = (long) (valorSaque * 0.004);
		Long taxaAdiministracaoMaior = (long) (valorSaque * 0.01);
		Optional<Cliente> optionalCliente = repository.findById(id);

		Cliente cliente = optionalCliente.get();
		Long saldoAtual = cliente.getSaldo().longValue();
	
		if(cliente.getPlanoExclusive() && valorSaque <= 100)
			cliente.setSaldo(cliente.getSaldo().subtract(BigDecimal.valueOf(valorSaque)));
			
		if (valorSaque > 100 && valorSaque <= 300) {
			saldoAtual = (long) ((saldoAtual - valorSaque) - taxaAdiministracaoMenor);
			cliente.setSaldo(BigDecimal.valueOf(saldoAtual));
		}
		
		if (valorSaque > 300) {
			saldoAtual = (long) ((saldoAtual - valorSaque) - taxaAdiministracaoMaior);
		}
		
		this.repository.save(cliente);
	}

}
