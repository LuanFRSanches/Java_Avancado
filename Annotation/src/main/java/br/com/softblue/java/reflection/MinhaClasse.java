package br.com.softblue.java.reflection;

public class MinhaClasse {

	@Executar("A")
	public void m1(String param) {
		System.out.println("m1()");
	}

	@Executar(value = "B")
	public void m2(String param) {
		System.out.println("m2()");
	}

	public void m3(String param) {
		System.out.println("m3");
	}
}
