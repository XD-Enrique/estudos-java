import java.util.Locale;
import java.util.Scanner;

public class Caixa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int codItem1, codItem2, qtdItem1, qtdItem2;
		double valorItem1, valorItem2, total;

		System.out.print("Insira o codigo do item 1: ");
		codItem1 = sc.nextInt();

		System.out.print("Insira a quantidade do item 1: ");
		qtdItem1 = sc.nextInt();

		System.out.print("Insira o valor do item 1: ");
		valorItem1 = sc.nextDouble();

		System.out.print("Insira o codigo do item 2: ");
		codItem2 = sc.nextInt();

		System.out.print("Insira a quantidade do item 2: ");
		qtdItem2 = sc.nextInt();

		System.out.print("Insira o valor do item 2: ");
		valorItem2 = sc.nextDouble();

		total = (valorItem1 * qtdItem1) + (valorItem2 * qtdItem2);

		System.out.printf("Valor a pagar: R$ %.2f%n", total);

		sc.close();
	}
}