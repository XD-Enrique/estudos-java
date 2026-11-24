import java.util.Scanner;

public class Salario {

	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numFuncionario;
		double horas, valorH, salario;
		
		System.out.println("Insira o Numero do Funcionario: ");
		numFuncionario = sc.nextInt();
		
		System.out.println("Insira quantas horas foram trabalhadas: ");
		horas = sc.nextDouble();
		
		System.out.println("Insira quanto o funcionario ganha por hora: ");
		valorH = sc.nextDouble();
		
		salario = horas * valorH;
		
		System.out.println("Numero do funcionario: " + numFuncionario);
		System.out.printf("Salario do funcionario: %.2f", salario);
		
		sc.close();
	}
	
}
