package atividades;
import java.util.Scanner;

public class ativ2 {
       public static void main(String[] args) {
    	   

   
    	      
    	           Scanner ler = new Scanner(System.in);
    	           
    	           // Exibe título e solicita os dados necessários
    	           System.out.println("CÁLCULO DA ÁREA DO TRIÂNGULO ");
    	           System.out.print("Digite a base do triângulo: ");
    	           double base = ler.nextDouble();
    	           
    	           System.out.print("Digite a altura do triângulo: ");
    	           double altura = ler.nextDouble();
    	           
    	           // Calcular a área usando a fórmula: 
    	           double area = (base * altura) / 2;
    	           
    	           // Apresenta o resultado formatado
    	           System.out.println(" RESULTADO ");
    	           System.out.printf("Base: ", base);
    	           System.out.printf("Altura:", altura);
    	           System.out.printf("Área do triângulo: %.2f\n", area);
    	           
    	           ler.close();
    	       }
	}

