package curso;

import java.util.Scanner;

public class Programa16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Quantos numeros voce quer digitar?");
		int n = sc.nextInt();
		
		int sum = 0;
		for (int i = 1; i<=n; i++) {
			System.out.print("Valor #" + i + ": ");
			int x = sc.nextInt();
			sum += x;
		}
		
		System.out.println("A soma é = " + sum);
		
		sc.close();

	}
}