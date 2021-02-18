package br.com.softblue.java.inner;

public class Main {

	public static void main(String[] args) {
		final int x = 10;
		Bebida b1 = new Cha();
		Bebida b2 = new Bebida() {
			public void preparar() {
				System.out.println("Preparando bebida não identificada");
				System.out.println(x);
			}

		};
		b1.preparar();
		b2.preparar();
	}
}
