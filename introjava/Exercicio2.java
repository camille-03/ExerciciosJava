import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		/*2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias. */
 
		int total, anos, meses, dias, res, resto, diasT;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nInforme sua idade em dias: ");
		diasT = leia.nextInt();
		
		anos = diasT/365;
		meses =  (diasT%365)/30;
		dias = (diasT%365)%30;
		
		
		System.out.println("\nSua idade completa: "+anos+"anos, "+meses+"meses e "+dias+"dias.");
	}

}
