package br.com.softblue.java.concurrent;

public class Carro implements Runnable {

	private int id;
	private Semafaro semafaro;

	public Carro(int id, Semafaro semafaro) {
		this.id = id;
		this.semafaro = semafaro;
	}

	@Override
	public void run() {
		while (true) {
			semafaro.atravessar(id);
			try {
				Thread.sleep(1000 + (int) (Math.random() * 4000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
