package br.com.internet.banking.demo.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CLIENTE")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_CLIENTE")
	private Long id;
	
	@Column(name = "NOME")
	private String nome;
	
	@Column(name = "PLANO_EXCLUSIVE")
	private Boolean planoExclusive;
	
	@Column(name = "SALDO")
	private BigDecimal saldo;
	
	@Column(name = "NUMERO_CONTA")
	private String numeroConta;
	
	@Column(name = "DATA_NASCIMENTO")
	private Date dataNascimento;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Boolean getPlanoExclusive() {
		return planoExclusive;
	}
	
	public void setPlanoExclusive(Boolean planoExclusive) {
		this.planoExclusive = planoExclusive;
	}
	
	public BigDecimal getSaldo() {
		return saldo;
	}
	
	public void setSaldo(BigDecimal big) {
		this.saldo = big;
	}
	public String getNumeroConta() {
		return numeroConta;
	}
	
	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}
	
	public Date getDataNascimento() {
		return dataNascimento;
	}
	
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	
}
