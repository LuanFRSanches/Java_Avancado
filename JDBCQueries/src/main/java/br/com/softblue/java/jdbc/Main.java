package br.com.softblue.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) throws Exception {
		String[] nomesProdutos = { "Feijão", "Batata", "Cebola", "Tomate" };

		String url = "jdbc:mysql://localhost:3306/softblue";

		try (Connection conn = DriverManager.getConnection(url, "root", "root")) {
			System.out.println("Conectou no banco de dados");

			// String sql = "INSERT INTO produto (nome)VALUES('Arroz')";

			// try (Statement stmt = conn.createStatement()) {
			// stmt.executeUpdate(sql);
			// System.out.println("Produto inserido");
			// }

			try (PreparedStatement stmt = conn.prepareStatement("INSERT INTO produto (nome) VALUES  (?)")) {
				for (String nomeProduto : nomesProdutos) {
					stmt.setString(1, nomeProduto);

				}
			}
		}
	}
}
