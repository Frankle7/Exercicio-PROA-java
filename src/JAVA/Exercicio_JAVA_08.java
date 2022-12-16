package JAVA;
import java.util.Scanner;
import java.util.Locale;

public class Exercicio_JAVA_08 {
	
		public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double total = 0;
		
		System.out.print("Informe o valor do IPI: ");
		double ipi = sc.nextDouble();
		
		System.out.print("C�digo da pe�a: ");
		int codPeca = sc.nextInt();
		
		System.out.print("Valor unit�rio da pe�a: ");
		double valor1 = sc.nextDouble();
		
		System.out.print("Quantidade de pe�as: ");
		int qtd1 = sc.nextInt();
		
		System.out.print("\nC�digo da pe�a: ");
		int codPeca2 = sc.nextInt();
		
		System.out.print("Valor unit�rio da pe�a: ");
		double valor2 = sc.nextDouble();
		
		System.out.print("Quantidade de pe�as: ");
		int qtd2 = sc.nextInt();
		
		total = (valor1 * qtd1 + valor2 * qtd2) * (ipi / 100 + 1);
		
		System.out.printf("\nValor total: %.2f", total);
		
		sc.close();
	}


}
