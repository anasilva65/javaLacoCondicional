package javaCondicional;

import java.util.Scanner;

public class exer1 {
/*
 * Faça um programa que receba três inteiros e diga qual deles é o maior.
 */
	public static void main(String[] args) {
		int a, b, c;
		Scanner tec = new Scanner(System.in);
		
		System.out.print("Digite o 1º número: ");
		a = tec.nextInt();
		
		System.out.print("Digite o 2º número: ");
		b = tec.nextInt();
		
		System.out.print("Digite o 3º número: ");
		c = tec.nextInt();
		
		if((a>=b)&&(a>=c)) 
		{
			System.out.println("O maior número é: " + a);
		}
		else if((b>=a)&&(b>=c))
		{
			System.out.println("O maior número é: " + b);
		}
		else
		{
			System.out.println("O maior número é: " + c);
		}
		
		tec.close();
}
}
