package atividades;

import java.util.Scanner;

public class ativ4 {
		    // Método principal 
		    public static void main(String[] args) {
		        Scanner ler = new Scanner(System.in);
		        // Declara uma variável 
		        double soma = 0;
		        System.out.println("Digite 10 números para calcular a soma:");
		        
		        // Loop que se repete 10 vezes
		        for (int i = 1; i <= 10; i++) {
		            // Solicita ao usuário que digite o número atual
		            System.out.print("Digite o " + i + "º número: ");
		            double numero = ler.nextDouble();
		            soma = soma + numero;
		            // Alternativa mais concisa: soma += numero;
		        }
		        
		        System.out.println("A soma dos 10 números é: " + soma);
		        ler.close();
		    }
		    
}
