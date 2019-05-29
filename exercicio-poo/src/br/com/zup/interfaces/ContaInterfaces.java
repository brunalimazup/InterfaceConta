package br.com.zup.interfaces;

import br.com.zup.modelo.Conta;

public interface ContaInterfaces {
	
	void depositar(double deposito);
	void sacar (double saque);
	void saldoConta(double saldo);
	void transferir(double valor, Conta contaEntrada);
	
}

