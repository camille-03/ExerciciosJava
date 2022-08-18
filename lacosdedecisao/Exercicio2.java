import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		//2- Faça um programa que entre com três números e coloque em ordem crescente.
		
		int a,b,c;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nInforme o primeiro número: ");
		a = leia.nextInt();
		System.out.println("\nInforme o segundo número: ");
		b = leia.nextInt();
		System.out.println("\nInforme o terceiro número: ");
		c = leia.nextInt();
		
		if(a<=b && b<=c)
		{
			System.out.println("\nA ordem crescente dos números informados é: "+a+"," +b+" e "+c);
		}
		else if(a<=c && c<=b)
		{
			System.out.println("\nA ordem crescente dos números informados é: "+a+"," +c+" e "+b);
		}
		else if(b<=a && a<=c)
		{
			System.out.println("\nA ordem crescente dos números informados é: "+b+"," +a+" e "+c);
		}
		else if(b<=c && c<=a)
		{
			System.out.println("\nA ordem crescente dos números informados é: "+b+"," +c+" e "+a);
		}
		else if(c<=a && a<=b)
		{
			System.out.println("\nA ordem crescente dos números informados é: "+c+"," +a+" e "+b);
		}
		else
		{
			System.out.println("\nA ordem crescente dos números informados é: "+c+"," +b+" e "+a);
		}

	}

}
