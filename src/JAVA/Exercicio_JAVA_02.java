package JAVA;
import java.util.Scanner;

public class Exercicio_JAVA_02 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        int num;

	        System.out.println("Digite o número a ser dividido: ");
	        num = sc.nextInt();

	        if(num %10 ==0){
	            System.out.println(num +  " pode ser dividido por 10");
	            System.out.println(num +  " pode ser dividido por 10");

	        }
	        else if (num%5==0){
	            System.out.println(num + " pode ser dividido por 5");

	        }
	        else if (num%2==0){
	            System.out.println(num + " pode ser dividido 2");

	        }
	        else {
	            System.out.println(num + " não pode ser dividido por 10, 5 ou 2");
	        }
	        
	        sc.close();
	}
}
