package JAVA;
import java.util.Scanner;

public class Exercicio_JAVA_06 {
	public static void main(String[] args) {
		Scanner tecladoUser = new Scanner (System.in);
		
		int num;
		
		System.out.println("Qual seu numero da sorte?: ");
		num = tecladoUser.nextInt();
		
		int numAdd = num + 1;
		int numSub = num - 1 ;
		
		System.out.println("Seu numero da sorte �: " + num);
		System.out.println("E o n�mero anterior �: " + numSub);
		System.out.println("E o n�mero sucessor �: " + numAdd);
		tecladoUser.close();
	}
}
