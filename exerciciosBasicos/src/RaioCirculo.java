import java.util.Scanner;

public class RaioCirculo {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		double raio, area;
		
		
		System.out.println("Insira o raio do circulo: ");
		raio = sc.nextDouble();
		
		area = Math.PI * Math.pow(raio, 2);
		
		System.out.printf("Area = %.4f", area);
	
		sc.close();
	}
	
}
