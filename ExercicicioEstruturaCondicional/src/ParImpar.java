import java.util.Scanner;

public class ParImpar {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira qualquer numero inteiro: ");
		int num = sc.nextInt();
		
		if (num % 2 == 0) {
			System.out.println(num + " é Par");
		} else {
			System.out.println(num + " é Impar");
		}
		
		sc.close();
	}
}