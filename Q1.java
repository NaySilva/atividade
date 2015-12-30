import java.util.Scanner;

public class Q1 {
	
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		int dist = scanner.nextInt();
		double cons = scanner.nextDouble();
		double consMedio = (double) (dist/cons); 
		System.out.format("%.3f km/l", consMedio);
		
	}
}
