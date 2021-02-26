package br.com.softblue.java.rmi;

import java.rmi.RemoteException;

public interface ContaBancaria {

	void sacar(double valor) throws RemoteException;

	void depositar(double valor) throws RemoteException;

	void transferir(double valor, ContaBancaria outraConta) throws RemoteException;

	double getSaldo() throws RemoteException;
}
