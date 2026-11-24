import java.util.Scanner;

public class Caixa {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	int codItem1, codItem2, qtdItem1, qtdItem2;
	double valorItem1, valorItem2, total;
	
	System.out.println("Insira o codigo do item 1:");
	codItem1 = sc.nextInt();
	
	System.out.println("Insira a quantidade do item 1: ");
	qtdItem1 = sc.nextInt();
	
	System.out.println("Insira o valor do item: ");
	valorItem1 = sc.nextDouble();
	
	System.out.println("Insira o codigo do item 2:");
	codItem2 = sc.nextInt();	
	
	System.out.println("Insira a quantidade do item 2: ");
	qtdItem2 = sc.nextInt();
	
	System.out.println("Insira o valor do item: ");
	valorItem2 = sc.nextDouble();	
	
	total = (valorItem1 * qtdItem1) + (valorItem2 * qtdItem2);
	
		
	System.out.printf("Valor a pagar: R$ %.2f", total);
	
	}	
	
}
