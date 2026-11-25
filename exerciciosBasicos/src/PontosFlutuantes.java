import java.util.Scanner;

public class PontosFlutuantes {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;
		
		System.out.println("Insira o valor de A: ");
		A = sc.nextDouble();
		System.out.println("Insira o valor de B: ");
		B = sc.nextDouble();
		System.out.println("Insira o valor de C: ");
		C = sc.nextDouble();
		
		triangulo = A * C / 2;
		circulo = Math.PI * Math.pow(C, 2);
		trapezio = (A + B) * C / 2;
		quadrado = Math.pow(B, 2);
		retangulo = A * B;
	
		System.out.printf("%nTRIANGULO: %.2f", triangulo);
		System.out.printf("%nCIRCULO: %.2f", circulo);
		System.out.printf("%nTRAPEZIO: %.2f", trapezio);
		System.out.printf("%nQUADRADO: %.2f", quadrado);
		System.out.printf("nRETANGULO: %.2f", retangulo);
		
		sc.close();
	}
	
}
