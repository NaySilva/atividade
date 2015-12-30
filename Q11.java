import java.util.Scanner;

public class Q11 {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		//1.Alcool 2.Gasolina 3.Diesel 4.Fim
		int op = sc.nextInt();
		int qtdAlcool = 0;
		int qtdGasolina = 0;
		int qtdDiesel = 0;
		while (op != 4){
			if (op == 1){
				qtdAlcool++;
			}else{
				if (op == 2){
					qtdGasolina++;
				}else{
					if (op == 3){
						qtdDiesel++;
					}
				}
			}
			op = sc.nextInt();
		}
		System.out.format("MUITO OBRIGADO\nAlcool: %d\nGasolina: %d\nDiesel: %d", qtdAlcool, qtdGasolina, qtdDiesel);
		
	}
}