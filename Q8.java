import java.util.Scanner;

public class Q8 {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int idade = sc.nextInt();
		int qtd = 0;
		int soma = 0;
		
		while (idade > 0){
			qtd++;
			soma += idade;
			idade = sc.nextInt();
		}
		float media = (float)(soma) / qtd;
		System.out.format("%.2f", media);
		
	}
}