package polymorphism;

public class PolymorphismExample {

	public int multiply(int num1, int num2, int num3) {
		return (num1 * num2 * num3);
	}

	public int multiply(int num1, int num2) {
		return (num1 * num2);
	}

	public double multiply(double num1, double num2) {
		return (num1 * num2);
	}

	double sum(int a, float b) {
		return a + b;
	}

	double sum(double a, float b) {
		return a + b;
	}
}
