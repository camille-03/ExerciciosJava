import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		/*5- Crie um programa que leia um número do teclado até que encontre um
		número igual a zero. No final, mostre a soma dos números
		digitados.(DO...WHILE)*/

		int x, somaX=0;
		Scanner leia = new Scanner (System.in);
		do
		{
			System.out.println("\nInforme um número:");
			x = leia.nextInt();
			somaX += x;		
		}
		while(x != 0);
		System.out.println("\nA soma dos números informados é: "+somaX);
	}	

}
