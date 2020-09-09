package javaCondicional;

import java.util.Scanner;

public class exerc2 {
/*
 * Faça um programa que entre com três números e coloque em ordem crescente.
 */
	public static void main(String[] args) {
		int num1, num2, num3, aux;
		Scanner tec = new Scanner(System.in);
		
		System.out.print("1º número: ");
		num1 = tec.nextInt();
		
		System.out.print("2º número: ");
		num2 = tec.nextInt();
		
		System.out.print("3º número: ");
		num3 = tec.nextInt();
		
		if(num1 > num2) {
			aux = num1;
			num1 = num2;
			num2 = aux;
		} 
		if(num1 > num3) {
			aux = num1;
			num1 = num3;
			num3 = aux;
		}
		if(num2 > num3) {
			aux = num2;
			num2 = num3;
			num3 = aux;
		} 
		System.out.printf("Número 1: %d - Número 2: %d - Número 3: %d", num1, num2, num3);
		
		tec.close();
}
}



