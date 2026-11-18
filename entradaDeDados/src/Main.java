import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String x;
		int y;
		double z;
		char e;
		
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		e = sc.next().charAt(0); //charAt(0) vai pegar a primeira letra digitada
		
		System.out.println("Voce digitou: " + x);
		System.out.println("Voce digitou o inteiro: " + y);
		System.out.println("Voce digitou o decimal: " + z); // aqui o  sistema vai puxar a configuracao da localizacao da maquina
		System.out.println("Voce digitou a letra: " + e);
		
		System.out.println("Dados Digitados:");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(e);
		
		sc.close();
	}
	
}
