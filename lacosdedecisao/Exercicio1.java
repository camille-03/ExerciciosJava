import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		//1- Faça um programa que receba três inteiros e diga qual deles é o maior.

		int a,b,c;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nInforme o primeiro número: ");
		a = leia.nextInt();
		System.out.println("\nInforme o seundo número: ");
		b = leia.nextInt();
		System.out.println("Informe o terceiro número: ");
		c = leia.nextInt();
		
		if(a>=b && a>=c)
		{
			System.out.println("\nO maior número é: "+a);
		}
		else if(b>=a && b>=c)
		{
			System.out.println("\nO maior número é: "+b);
		}
		else
		{
			System.out.println("\nO maior número é: "+c);
		}
	}

}
