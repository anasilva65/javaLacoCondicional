package javaCondicional;

import java.util.Scanner;

public class exerc3 {
	/*
	 * Faça um programa que receba a idade de uma pessoa e mostre na saída em qual categoria ela se encontra:
·                     10-14 infantil
·                     15-17 juvenil
·                     18-25 adulto

	 */


	public static void main(String[] args) 
	{
		
		int idade;
		Scanner tec = new Scanner(System.in);
		
		System.out.print("Digite a sua idade: ");
		idade = tec.nextInt();
		
		if(idade>=10 && idade<=14)
		{
			System.out.println("Categoria infantil");
		}
		else if(idade>=15 && idade<=17)
		{
			System.out.println("Categoria juvenil");
		}
		else if(idade>=18)
		{
			System.out.println("Categoria adulta");
		}	
		
		tec.close();
}
	}
