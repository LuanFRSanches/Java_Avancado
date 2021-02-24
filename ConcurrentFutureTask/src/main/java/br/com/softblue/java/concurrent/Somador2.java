package br.com.softblue.java.concurrent;

import java.util.concurrent.Callable;

public class Somador2 implements Callable<Integer> {

	private int n2;
	private int n1;

	public Somador2(int n2, int n1) {
		super();
		this.n2 = n2;
		this.n1 = n1;
	}

	@Override
	public Integer call() throws Exception {
		if (n1 < 0 || n2 < 0) {
			throw new Exception("Número negativo....");
		}
		Thread.sleep(3000);
		return n1 + n2;
	}

}
