package br.com.softblue.java.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	private static List<String> itens = Arrays.asList("computador", "papel", "caneta", "quadro", "borracha", "cortina",
			"gaveta");

	public static void main(String[] args) {
		// 1. Ordernar
		// 2. Manter só os 3 primeiros elementos
		// 3. Mostrar o resultado na tela

		itens.stream().sorted().limit(3).forEach(System.out::println);
	}

	private static void executrar2() {
		// 1. Filtrar só elementos com a letra 'c'
		// 2. Montar uma nova lista com estes elementos

		List<String> itensFiltrados = itens.stream().filter(e -> e.contains("c")).collect(Collectors.toList());
		System.out.println(itensFiltrados);
	}

	public void executar3() {
		// 1 . Somar a quantidade de caracteres de todos os elementos
		// 2 . Retorna a soma

		int count = itens.stream().collect(Collectors.summingInt(e -> e.length()));
		System.out.println(count);
	}

}
