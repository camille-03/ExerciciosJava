import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		/*1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias. */

		int total, dias, meses, anos;
		Scanner leia = new Scanner (System.in)
;		
		System.out.println("\nInforme sua idade completa\nDigite quantos anos você tem: ");
		anos = leia.nextInt();
		System.out.println("\nDigite os meses: ");
		meses = leia.nextInt();
		System.out.println("\nDigite os dias:");
		dias = leia.nextInt();
		
		total = (anos*365) + (meses*30) + dias;
		System.out.println("\nSua idade expressa em dias é: "+total);
	}

}
