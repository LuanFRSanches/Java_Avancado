package br.com.softblue.java.concurrent;

public class Tasks implements Runnable {

	private int id;

	public Tasks(int id) {
		this.id = id;
	}

	@Override
	public void run() {
		System.out.println("Tarefa " + id + " iniciando");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

		}
		System.out.println("Tarefa " + id + " terminando");
	}
}
