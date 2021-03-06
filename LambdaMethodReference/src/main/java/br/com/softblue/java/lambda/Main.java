package br.com.softblue.java.lambda;

import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<String> nomes = Arrays.asList("alfredo", "joana", "ricardo", "marina");
		// nomes.forEach(e -> System.out.println(e));

		// nomes.replaceAll(e -> e.toUpperCase());

		//nomes.replaceAll(String::toUpperCase);
	
		//nomes.replaceAll(e->Main.intercalar(e));
		nomes.replaceAll(Main::intercalar);
		
		nomes.forEach(System.out::println);
	
	
	}

	public static String intercalar(String s) {
		char[] chars = s.toCharArray();

		boolean lowerCase = true;
		StringBuilder sb = new StringBuilder();
		for (char c : chars) {
			if (lowerCase) {
				sb.append(Character.toLowerCase(c));
			} else {
				sb.append(Character.toUpperCase(c));
			}
			lowerCase = !lowerCase;
		}
		return sb.toString();
	}
}
