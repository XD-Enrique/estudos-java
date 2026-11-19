import java.util.Scanner;

public class SomaNumero {

 public static void main(String[] args) {
	 
	 Scanner sc = new Scanner(System.in);
	 
	 int num1, num2, result;
	 
	 System.out.println("Insira o primeiro numero: ");
	 num1 = sc.nextInt();
	 
	 System.out.println("Insira o segundo numero: ");
	 num2 = sc.nextInt();
	 
	 result = num1 + num2;
	 
	 System.out.println("A soma de " + num1 + " + " + num2 + " e igual a " + result);
	 
	 sc.close();
 }
	
	
}
