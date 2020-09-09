package javaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class exerc4 {
/*
 * Faça um programa em que permita a entrada de um número qualquer e exiba se este número é par ou ímpar. 
 * Se for par exiba também a raiz quadrada do mesmo; se for ímpar exiba o número elevado ao quadrado.
 */
	public static void main(String[] args) 
	{	
		Locale.setDefault(Locale.US); //Para padronizar a vírgula como ponto - Padrão americano.
		Scanner tec = new Scanner(System.in);
		double numero, raiz=0, potencia=0;
		
		System.out.print("Digite um número: ");
		numero = tec.nextDouble();
		
		if(numero%2==0)
		{
			raiz = Math.sqrt(numero);
			System.out.printf("%.2f é par e sua raíz quadrada é: %.2f.", numero, raiz);
		}
		else
		{
			potencia = Math.pow(numero, 2);
			System.out.printf("%.2f é um número ímpar e %.2f ao quadrado é: %.2f", numero, numero, potencia);
		}
		
		tec.close();
}
}
