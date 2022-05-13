package repeticao;

import java.util.Scanner;

public class Multiplos {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Informe o múltiplo desejado: ");
		
		int mult = s.nextInt();
		
		for(int i = 1; i <= 100; i++) {
			if(i % mult == 0) {
				System.out.println(i);
			}
		}

	}

}
