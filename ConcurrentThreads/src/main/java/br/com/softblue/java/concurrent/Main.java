package br.com.softblue.java.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
	public static void main(String[] args) {

		// ExecutorService e = Executors.newSingleThreadExecutor();
		ExecutorService e = Executors.newFixedThreadPool(5);
		for (int i = 1; 1 <= 5; i++) {
			Tasks t = new Tasks(i);
			e.execute(t);
		}
	}

}
