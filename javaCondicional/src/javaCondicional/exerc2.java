package javaCondicional;

import java.util.Scanner;

public class exerc2 {
/*
 * Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.
 */
	public static void main(String[] args) {
		int num1, num2, num3, aux;
		Scanner tec = new Scanner(System.in);
		
		System.out.print("1� n�mero: ");
		num1 = tec.nextInt();
		
		System.out.print("2� n�mero: ");
		num2 = tec.nextInt();
		
		System.out.print("3� n�mero: ");
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
		System.out.printf("N�mero 1: %d - N�mero 2: %d - N�mero 3: %d", num1, num2, num3);
		
		tec.close();
}
}



