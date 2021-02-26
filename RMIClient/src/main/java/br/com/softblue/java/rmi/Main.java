package br.com.softblue.java.rmi;

import java.rmi.Naming;

public class Main {
	public static void main(String[] args) throws Exception {

		ContaBancaria conta = (ContaBancaria) Naming.lookup("rmi://localhost:1099/conta");
	conta.depositar(1000);
	conta.sacar(200);
	
	System.out.println(conta.getSaldo());
	}
}
