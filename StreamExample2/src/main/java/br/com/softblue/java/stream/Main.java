package br.com.softblue.java.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
	private static List<Produto> produtos;

	static {
		produtos = new ArrayList<Produto>();
		produtos.add(new Produto(1, "Batata", 3.5));
		produtos.add(new Produto(2, "Tomate", 4.3));
		produtos.add(new Produto(3, "Cebola", 2.9));
		produtos.add(new Produto(4, "Cenoura", 1.8));
		produtos.add(new Produto(5, "Vagem", 3.2));
	}

	public static void main(String[] args) {
		executar1();

	}

	@SuppressWarnings("deprecation")
	private static void executar1() {
		// 1. Ordenar os produtos por preço
		// 2. Converte os preços em dólar
		// 3. Mostrar os  do produto na tela

		double cotacao = 4;

		produtos.stream().sorted((e1, e2) -> new Double(e1.getPreco()).compareTo(e2.getPreco()))
				.map(p -> new Produto(p.getId(), p.getNome(), p.getPreco() / 4))
				.forEach(p -> System.out.println(p.getNome() + " -> " + p.getPreco()));
	}

	private static void executar2() {
		// 1.Criar um Map onde chave é o ID é o valor é o nome do produto
		Map<Integer, String> map = produtos.stream().collect((Collectors.toMap(p -> p.getId(), p -> p.getNome())));
		System.out.println(map);
	}

	private static void executar3() {
		// 1.Criar uma representação de texto dos produtos

		String str = produtos.stream().map(p -> String.format("%d:%s:%.2f", p.getId(), p.getNome(), p.getPreco()))
				.collect(Collectors.joining(";"));
		System.out.println(str);
	}
}
