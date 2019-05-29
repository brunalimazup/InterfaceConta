package br.com.zup.teste;

import br.com.zup.modelo.Conta;

public class TesteConta {

	public static void main(String[] args) {

		Conta conta = new Conta("2014", "Santander", "5847.8852", 400);

		conta.depositar(800);
		conta.sacar(250);
		conta.transferir(150, conta);
		conta.saldoConta(0);
		System.out.println(conta);

	}

}
