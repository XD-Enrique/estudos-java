import java.util.Locale;

public class ExercicioSaidaDeDados {
	
	public static void main (String  [] args) {
		
		String produto1 = "Computador";
		String produto2 = "Mesa de Escritorio";
		
		int idade = 30;
		int codigo = 5290;
		char genero = 'F';
		
		double preco1 = 2100.90;
		double preco2 = 650.50;
		double tamanho = 53.23456700;
		
		System.out.printf("Produtos:%n %s, custa R$ %.2f. %n %s, custa R$ %.2f", produto1, preco1, produto2, preco2);
		
		System.out.printf("%n%nRegistro: %d anos, codigo %d e genero: %s.", idade, codigo, genero);
		
		System.out.printf("%n%nMedida com oito casas decimais: %f. %nAredondamento (tres casas decimais): %.3f. %n", tamanho, tamanho);
		Locale.setDefault(Locale.US);
		System.out.printf("Ponto Flutuante padrao US: %.3f", tamanho);
		
		
	}
}
