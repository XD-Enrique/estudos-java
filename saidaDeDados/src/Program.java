import java.util.Locale;

public class Program {
	
	public static void main (String[] args) {
		
		int y = 25;
		double x = 10.35784;
		String nome = "Enrique";
		int idade = 20;
		double renda = 2.6769;
		
		System.out.println("Boa noite");
		System.out.println(y);
		System.out.println(x);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", x);
		System.out.println("RESULTADO = " + x + " METROS");
		System.out.printf("RESULTADO = %.2f METROS%n", x);
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
	}
	
}
