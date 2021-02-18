package br.com.softblue.lambda;

public class Main {

	public static void main(String[] args) {

		/*
		 * Calculator calc = new Calculator() {
		 *  public void calculate(int x) 
		 *  { x = x *x; 
		 *  System.out.println(x); 
		 *  }
			};
		 */

		// Calculator calc = e -> e = e *e;
		// calc.calculate(5);

		Calculator2 calc = p -> p * p;
		System.out.println(calc.calculate(9));

	}
}
