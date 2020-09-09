package javaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class exerc4 {
/*
 * Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este n�mero � par ou �mpar. 
 * Se for par exiba tamb�m a raiz quadrada do mesmo; se for �mpar exiba o n�mero elevado ao quadrado.
 */
	public static void main(String[] args) 
	{	
		Locale.setDefault(Locale.US); //Para padronizar a v�rgula como ponto - Padr�o americano.
		Scanner tec = new Scanner(System.in);
		double numero, raiz=0, potencia=0;
		
		System.out.print("Digite um n�mero: ");
		numero = tec.nextDouble();
		
		if(numero%2==0)
		{
			raiz = Math.sqrt(numero);
			System.out.printf("%.2f � par e sua ra�z quadrada �: %.2f.", numero, raiz);
		}
		else
		{
			potencia = Math.pow(numero, 2);
			System.out.printf("%.2f � um n�mero �mpar e %.2f ao quadrado �: %.2f", numero, numero, potencia);
		}
		
		tec.close();
}
}
