package br.com.softblue.java.concurrent;

public class Somador1 implements Runnable {

	private int n1;
	private int n2;
	private int resultado;
	private Exception exception;
	private boolean running;

	public Somador1(int n1, int n2) {
		this.n1 = n1;
		this.n2 = n2;
		running = true;
	}

	public Exception getException() {
		return exception;
	}

	public int getResultado() {
		return resultado;
	}

	public boolean isRunning() {
		return running;
	}

	@Override
	public void run() {

		running = true;
		try {
			if (n1 < 0 || n2 < 0) {
				throw new Exception("Número negativo");
			}
			Thread.sleep(3000);
			resultado = n1 + n2;
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (Exception e) {
			this.exception = e;
		} finally {
			running = false;
		}

	}

}
