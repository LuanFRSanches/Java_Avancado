package br.com.softblue.java.reflection;

import java.lang.reflect.Method;

public class Main {
	public static void main(String[] args) throws Exception {
		MinhaClasse mc = new MinhaClasse();
		executar(mc);
	}

	private static void executar(MinhaClasse mc) throws Exception {
		@SuppressWarnings("unchecked")
		Class<MinhaClasse> c = (Class<MinhaClasse>) mc.getClass();
		
		Method[] methods = c.getDeclaredMethods();
	
		for (Method method : methods) {
			Executar annot = method.getDeclaredAnnotation(Executar.class);
			
			if (annot != null) {
				String arg = annot.value();
				method.invoke(mc, arg);
			}
		}
	}
}
