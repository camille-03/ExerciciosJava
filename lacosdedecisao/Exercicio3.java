import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		/*3- Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
		categoria ela se encontra:
			 10-14 infantil
			 15-17 juvenil
			 18-25 adulto*/

		int idade;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nInforme a sua idade: ");
		idade = leia.nextInt();
		
		if(idade>=10 && idade<=14)
		{
			System.out.println("\nVocê está na categoria Infantil!");
		}
		else if(idade>=15 && idade<=17)
		{
			System.out.println("\nVocê está na categoria Juvenil");
		}
		else if(idade>=18 && idade<=25)
		{
			System.out.println("\nVocê está na categoria Adulta!");
		}
		else
		{
			System.out.println("\nVocê não se encaixa em nenhuma categoria aceita!");
		}	
			
		}
}
