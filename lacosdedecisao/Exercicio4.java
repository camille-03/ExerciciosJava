import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		/* 4- Faça um programa em que permita a entrada de um número qualquer e exiba se este
		número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
				ímpar exiba o número elevado ao quadrado.*/

		
		double x, resultado;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nInforme um número: ");
		x = leia.nextInt();
		System.out.println("\nO número informado é: "+x);

		if(x % 2 == 0)
		{
			resultado = Math.sqrt(x);
			System.out.println("\nA raiz quadrada de "+x+ " é igual a "+resultado);
		}
		else
		{
			resultado = Math.pow(x, 2);
			System.out.println("\nO valor de "+x+ " ao quadrado é " +resultado);
		}
	}

}
