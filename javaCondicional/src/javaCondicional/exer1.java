package javaCondicional;

import java.util.Scanner;

public class exer1 {
/*
 * Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
 */
	public static void main(String[] args) {
		int a, b, c;
		Scanner tec = new Scanner(System.in);
		
		System.out.print("Digite o 1� n�mero: ");
		a = tec.nextInt();
		
		System.out.print("Digite o 2� n�mero: ");
		b = tec.nextInt();
		
		System.out.print("Digite o 3� n�mero: ");
		c = tec.nextInt();
		
		if((a>=b)&&(a>=c)) 
		{
			System.out.println("O maior n�mero �: " + a);
		}
		else if((b>=a)&&(b>=c))
		{
			System.out.println("O maior n�mero �: " + b);
		}
		else
		{
			System.out.println("O maior n�mero �: " + c);
		}
		
		tec.close();
}
}
