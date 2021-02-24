package br.com.softblue.java.concurrent;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Semafaro implements Runnable {

	private boolean aberto = false;

	private ReentrantLock lock = new ReentrantLock();
	private Condition condiciton = lock.newCondition();

	@Override
	public void run() {
		while (true) {
			lock.lock();
			try {
				aberto = !aberto;
				System.out.println("Semáfaro aberto: " + aberto);
				if (aberto) {
					condiciton.signalAll();
				}
			} finally {
				lock.unlock();
			}
			try {
				Thread.sleep(1000 + (int) (Math.random() * 4000));
			} catch (InterruptedException e) {
				e.printStackTrace();

			}
		}
	}

	public void atravessar(int id) {
		lock.lock();

		try {
			while (!aberto) {
				System.out.println("[Carro  " + id + "] Aguardando");
				condiciton.await();
			}
			System.out.println("[Carro " + id + "] Atravessou");
		} catch (InterruptedException e) {

		} finally {
			lock.unlock();
		}
	}
}
