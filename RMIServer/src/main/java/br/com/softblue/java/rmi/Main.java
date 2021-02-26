package br.com.softblue.java.rmi;

import java.rmi.Remote;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Main {

	public static void main(String[] args) throws Exception {
		ContaBancaria conta = new ContaBancariaImpl();

		ContaBancaria contaStub = (ContaBancaria) UnicastRemoteObject.exportObject((Remote) conta, 0);

		Registry registry = LocateRegistry.createRegistry(1099);
		registry.rebind("conta", (Remote) contaStub);

		System.out.println("Aguardando requisições");

	}

}
