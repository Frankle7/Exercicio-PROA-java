package JAVA;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio_JAVA_09 {
		
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner tecladoUser = new Scanner(System.in);
		
		System.out.print("Qual seu sal�rio atual?: ");
		
		double wage = tecladoUser.nextDouble();
		double qtdwage = wage / 1.212;
		
		
		System.out.printf("A quantidade de sal�rios m�nimos � de: %.2f",  qtdwage);
		tecladoUser.close();

	}
}
