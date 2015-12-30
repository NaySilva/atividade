
import java.util.Scanner;

public class Q9 {
	
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		double valor = scanner.nextDouble();
		double [] valores = {100, 50, 20, 10, 5, 2, 1, 0.50, 0.25, 0.10, 0.05, 0.01};
		int [] quant = new int[12];
		for(int i = 0; i < 12; i++){
			if (valor > valores[i]){
				quant[i] = (int)(valor / valores[i]);
				valor = valor - (quant[i] * valores[i]);
				
			}
			String titulo = i == 0 ? "NOTAS: \n" : i == 6 ? "MOEDAS: \n" : ""; 
			System.out.print(titulo);
			if (i<6){
				System.out.println(quant[i] + " nota(s) de R$ " + valores[i]);
			}else{
				System.out.println(quant[i] + " moedas(s) de R$ " + valores[i]);
			}
		}
		
	}
}
