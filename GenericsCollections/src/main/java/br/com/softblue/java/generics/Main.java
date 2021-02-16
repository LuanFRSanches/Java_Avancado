package br.com.softblue.java.generics;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		/*
		 * List list = new ArrayList();

		list.add("abc");
		list.add("def");
		list.add(100);

		for (Object obj : list) {
			String s = (String) obj;
			System.out.println(s);
		}*/

		List<String> list = new ArrayList<>();

		list.add("abc");
		list.add("def");
		

		for (String s : list) {
			System.out.println(s);
		}
	}

}
