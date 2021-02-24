package br.com.softblue.java.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	private static final int NUM_CARROS = 5;

	public static void main(String[] args) {
		ExecutorService e = Executors.newFixedThreadPool(NUM_CARROS + 1);

		Semafaro semafaro = new Semafaro();
		e.execute(semafaro);

		for (int i = 0; i < NUM_CARROS; i++) {
			Carro carro = new Carro(i, semafaro);
			e.execute(carro);

		}
		e.shutdown();
	}
}
