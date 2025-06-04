package atividades;
import java.util.Scanner;
public class ativ1 {
         public static void main(String[] args) {
        	         Scanner ler = new Scanner(System.in);
        	         
        	         // Solicita os dois números para soma
        	         System.out.println(" SOMA DE DOIS NÚMEROS");
        	         System.out.print("Digite o primeiro número: ");
        	         double num1 = ler.nextDouble();
        	         
        	         System.out.print("Digite o segundo número: ");
        	         double num2 = ler.nextDouble();
        	         
        	         // Calcula a soma dos dois números
        	         double soma = num1 + num2;
        	         
        	         // Apresenta o resultado
        	         System.out.println("\n=== RESULTADO ===");
        	         System.out.printf("%.2f + %.2f = %.2f\n", num1, num2, soma);
        	         
        	         ler.close();
        	     }
        	 
			
		}

