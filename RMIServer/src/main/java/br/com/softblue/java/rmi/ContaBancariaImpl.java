package br.com.softblue.java.rmi;

import java.rmi.RemoteException;

public class ContaBancariaImpl implements ContaBancaria {

	private double saldo;

	public void sacar(double valor) {
		this.saldo -= valor;
	}

	public void depositar(double valor) {
		this.saldo += valor;

	}

	public void transferir(double valor, ContaBancaria outraConta) throws RemoteException {
		sacar(valor);
		outraConta.depositar(valor);
	}

	public double getSaldo() {
		return saldo;
	}

}
