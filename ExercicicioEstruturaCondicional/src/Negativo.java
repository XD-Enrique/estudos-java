import java.util.Scanner;

public class Negativo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double num;
		
		System.out.println("Insira qualquer numero: ");
		num = sc.nextDouble();
		
		if (num > 0) {
			System.out.printf("%.2f é Positivo!", num);
		} else if (num < 0) {
			System.out.printf("%.2f é Negativo!", num);
		} else {
			System.out.println("0 é Neutro");
		}
		
		sc.close();
	}
	
	
}
