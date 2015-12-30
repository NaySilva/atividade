import java.util.Scanner;

public class Q7 {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int qtd = sc.nextInt();
		
		while (qtd > 0){
			sc.nextLine();
			String vels = sc.nextLine();
			int maior = 0;
			int ult = 0;
			int [] listVels = new int[qtd];
			for (int j = 0; j < qtd; j++){
				for(int i = ult; i < vels.length(); i++){
					if (vels.substring(i, i+1).equals(" ")){
						int tam = i - ult;
						listVels[j] = Integer.parseInt(vels.substring(ult, ult+tam));
						ult = i + 1;
						break;
					}
				}
				maior = listVels[j] > maior ? listVels[j] : maior;
				
			}
			int nivel = maior < 10 ? 1 : (maior >= 10 && maior < 20) ? 2 : 3;
			System.out.println(nivel);
			qtd = sc.nextInt();
		}
		
	}
}