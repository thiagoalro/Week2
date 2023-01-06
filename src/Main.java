import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		System.out.println("Hello world!");
		double preco = 20.0;
		System.out.printf("preco: %.2f%n", preco);
		preco = preco + 0.90;
		System.out.printf("preco: %.2f%n", preco);

		Scanner input = new Scanner(System.in);
		System.out.print("Digite o primeiro número: ");
		int number1 = input.nextInt();
		System.out.print("Digite o segundo número: ");
		int number2 = input.nextInt();
		int sum = number1 + number2;
		System.out.printf("Soma: %d%n", sum);

	}
}