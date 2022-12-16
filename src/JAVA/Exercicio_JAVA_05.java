package JAVA;
import java.util.Scanner;

public class Exercicio_JAVA_05 {
	public static void main(String[] args) {
		Scanner tecladoUser = new Scanner(System.in);
		
		int age;
		
		System.out.println("Qual sua idade?: ");
		age = tecladoUser.nextInt();
		
	
		if(age <=15) {
			System.out.println("Na sua idade o voto n�o � permitido");
		}

		if(age>=16 && (age<18) || age>=65) {
			System.out.println("Na sua idade o voto � facultativo");
		}
		

		if(age>=18 && age<65) {
			System.out.println("Na sua idade o voto � obrigat�rio");
		}
		
		tecladoUser.close();
	}
}
