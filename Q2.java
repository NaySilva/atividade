import java.util.Scanner;

public class Q2 {
	
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		String nome = scanner.nextLine();
		double salario = scanner.nextDouble();
		double vendas = scanner.nextDouble(); 
		float total = (float)(salario + (vendas * 0.15));
		System.out.format("TOTAL = R$ %.2f", total);
		
	}
}
