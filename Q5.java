import java.util.Scanner;

public class Q5 {
	
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		int i = 0;
		while (i < 3){
			int senhaDigitada = scanner.nextInt();
			if (senhaDigitada == 2002){
				i = 3;
				System.out.println("Acesso Permitido");
				break;
			}else{
				i++;
				if (i == 3){
					System.out.println("Acesso Negado");
				}else{
					System.out.format("Senha Invalida\n");
				}
			}
		}
		
	}
}
