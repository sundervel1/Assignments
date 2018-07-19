import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		int a = 0, b = 0;
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Input first number");
			a = sc.nextInt();
			System.out.println("Input second number");
			b = sc.nextInt();
		} catch (Exception e) {
			System.out.println("Input numbers only");
		}
		add(a, b);
		subtract(a, b);
		multiply(a, b);
		division(a, b);
	}

	private static void division(int a, int b) {
		double div = (double) a / b;
		System.out.println("The quotient of " + a + " and " + b + " is " + div);

	}

	private static void multiply(int a, int b) {
		int prod = a * b;
		System.out.println("The product of " + a + " and " + b + " is " + prod);

	}

	private static void subtract(int a, int b) {
		int diff = a - b;
		System.out.println("The difference of " + a + " and " + b + " is " + diff);

	}

	private static void add(int a, int b) {
		int sum = a + b;
		System.out.println("The sum of " + a + " and " + b + " is " + sum);
	}

}
