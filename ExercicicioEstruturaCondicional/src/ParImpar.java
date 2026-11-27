import java.util.Scanner;

public class ParImpar {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double num;
		
		System.out.println("Insira qualquer numero: ");
		num = sc.nextDouble();
		
		num = num % 2;
		
		if (num == 0) {
			System.out.printf("%.2f é Par", num);
		} else {
			System.out.printf("%.2f é Impar", num);
		}
		
		sc.close();
	}
	
	
}
