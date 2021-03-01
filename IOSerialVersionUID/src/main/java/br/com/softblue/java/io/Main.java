package br.com.softblue.java.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
	public static void main(String[] args) throws Exception {

		serilizere();
		unserilizere();
	}

	private static void serilizere() throws Exception {
		Usuario u = new Usuario();
		u.setId(5);
		u.setNome("Pedro");

		try (ObjectOutputStream oss = new ObjectOutputStream(new FileOutputStream("usuario.bin"))) {
			oss.writeObject(u);
		}

	}

	private static void unserilizere() throws Exception {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("usuario.bin"))) {
			Usuario u = (Usuario) ois.readObject();
			System.out.println(u);
		}
	}
}
