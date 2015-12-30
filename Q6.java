import java.util.Scanner;
import java.io.*;

public class Q6 {
	
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		int qtd = scanner.nextInt();
		int nC = 0;
		int nR = 0;
		int nS = 0;
		for(int i = 0; i < qtd; i++){
			int nCobaias = scanner.nextInt();
			String tCobaias = scanner.next();
			scanner.nextLine();
			nC = tCobaias.toUpperCase().equals("C") ? nC + nCobaias : nC + 0;
			nR = tCobaias.toUpperCase().equals("R") ? nR + nCobaias : nR + 0;
			nS = tCobaias.toUpperCase().equals("S") ? nS + nCobaias : nS + 0;
		}
		int total = nC + nR + nS;
		System.out.println(nC);
		float pC = (float) (nC * 100.00 / total);
		float pR = (float) (nR * 100.00 / total);
		float pS = (float) (nS * 100.00 / total);
		
		System.out.format("Total: %d cobaias\n", total);
		System.out.format("Total de coelhos: %d\n", nC);
		System.out.format("Total de ratos: %d\n", nR);
		System.out.format("Total de sapos: %d\n", nS);
		System.out.format("Percentual de coelhos: %.2f %%\n", pC);
		System.out.format("Percentual de ratos: %.2f %%\n", pR);
		System.out.format("Percentual de sapos: %.2f %%\n", pS);
		}
		
	}