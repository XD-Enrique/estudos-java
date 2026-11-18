import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x; //teste com variavel de outro tipo;
		String s1, s2, s3;
		
		x = sc.nextInt();
		sc.nextLine(); // sem esse nextLine(), o program iria criar um espaco em branco, pois o enter seria absorvido para o proximo nextLine() 
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		// precisa usar o nextLine(), pois ele le a linha toda ate o entre ja o next() le apenas a palavra

		System.out.println("DADOS DIGITADOS: ");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		sc.close();

	}

}
