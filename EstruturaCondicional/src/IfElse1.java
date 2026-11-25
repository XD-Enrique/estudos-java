import java.util.Scanner;

public class IfElse1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite APENAS a hora atual (em formato 24h): ");
		int horas = sc.nextInt();
		
		if (horas < 0 || horas > 23) {
			System.out.println("Hora invalida!");
		} else if (horas <= 12) {
			System.out.println("Bom dia");
		} else if (horas <= 18) {
			System.out.println("Boa tarde");
		} else {
			System.out.println("Boa noite");
		}
		
		sc.close();
	}
}