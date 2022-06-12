package tabuada;

import java.util.Scanner;

public class programTab {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Tabuada: ");
		int tabuada = scan.nextInt();
		
		System.out.println("Tabuada de : ");
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(tabuada + "X" + i + "=" + (tabuada*i));
		}

	}

}
