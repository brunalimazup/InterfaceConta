package br.com.zup.modelo;

import br.com.zup.interfaces.ContaInterfaces;

public class Conta implements ContaInterfaces {

	// Atributos
	private String numeroConta;
	private String banco;
	private String agencia;
	private double saldo;

	// Construtor
	public Conta(String numeroConta, String banco, String agencia, double saldo) {
		super();
		this.numeroConta = numeroConta;
		this.banco = banco;
		this.agencia = agencia;
		this.saldo = saldo;
	}

	// Gets e Sets
	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	// toString
	@Override
	public String toString() {

		String modelo = "";
		modelo += "\n - Número Conta -> " + this.getNumeroConta() + "\n";
		modelo += " -Banco ->" + this.getBanco() + "\n";
		modelo += " -Agência -> " + this.getAgencia() + "\n";
		modelo += " -Saldo -> " + this.getSaldo() + "\n";

		return modelo;

	}

	@Override
	public void depositar(double deposito) {
		double totalValor = this.getSaldo() + deposito;
		this.setSaldo(totalValor);

	}

	@Override
	public void saldoConta(double saldo) {
		System.out.println("Seu saldo atual é:" + this.getSaldo());

	}

	@Override
	public void transferir(double valor, Conta contaEntrada) {
		if (this.getSaldo() > valor) {
			double transferencia = this.getSaldo() - valor;
			this.setSaldo(transferencia);
		} else {
			System.out.println("Você não possue saldo suficiente para essa operação.");
		}
	}

	@Override
	public void sacar(double saque) {
		if (this.getSaldo() >= saque) {
			double totalValor = this.getSaldo() - saque;
			this.setSaldo(totalValor);
		} else {
			System.out.println("Você não possue saldo suficiente para esse saque.");
		}
	}
}
