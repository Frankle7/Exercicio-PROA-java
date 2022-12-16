package JAVA;
import java.util.Scanner;

public class Exercicio_JAVA_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double balance;
        double cred;
        double result;

        System.out.print("Qual a media do seu saldo: ");
        balance= sc.nextDouble();

         if (balance>500 && balance<1000){
             cred = balance * 0.30;
             result = balance + cred;
            System.out.println("Seu saldo de R$ " + balance + " lhe concede um credito de 30%");
            System.out.println("Saldo Atual: R$ " + result);
        }
        else if (balance>1000 && balance<3000){
            cred = balance * 0.40;
            result = balance + cred;
            System.out.println("Seu saldo de R$ " + balance + " lhe concede um credito de 40%");
            System.out.println("Saldo Atual: R$ " + result);
        }
         else if (balance>3000){
             cred = balance * 0.50;
             result = balance + cred;
             System.out.println("Seu saldo de R$ " + balance + " lhe concede um credito de 50%");
             System.out.println("Saldo Atual: R$ " + result);
         }
         else {
             System.out.println("Saldo insuficente para se obter cr�dito");
             System.out.println("Saldo Atual: R$ " + balance);
         }
         
         sc.close();
	}
}
