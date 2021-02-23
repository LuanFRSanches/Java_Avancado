package br.com.softblue.java.concurrent;

public class Escritor implements Runnable {

	private Info info;

	public Escritor(Info info) {
		this.info = info;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			info.setInfo();
		}
	}
}
