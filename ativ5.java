package atividades;
import java.util.Scanner;
public class ativ5 {
		    
		    public static void main(String[] args) {
		        Scanner ler = new Scanner(System.in);
		        // Arrays para armazenar os nomes e idades das 8 pessoas
		        String[] nomes = new String[8];  // Array de strings para os nomes
		        int[] idades = new int[8];       // Array de inteiros para as idades
		     
		        final int IDADE_MAIORIDADE = 18;
		        
		        System.out.println("Digite o nome e a idade de 8 pessoas:");
		      
		        // Loop para coletar os dados das 8 pessoas (índice de 0 a 7)
		        for (int i = 0; i < 8; i++) {
		            
		            System.out.println("Pessoa " + (i + 1) + ":");
		            // Solicita e lê o nome da pessoa atual
		            System.out.print("Nome: ");
		            nomes[i] = ler.nextLine();  
		            System.out.print("Idade: ");
		            idades[i] = ler.nextInt();  
		            ler.nextLine();
		        }
		        System.out.println("PESSOAS MAIORES DE IDADE:"); 
		        
		        int contadorMaiores = 0;
		        
		        for (int i = 0; i < 8; i++) {
		           
		            if (idades[i] >= IDADE_MAIORIDADE) {
		                // Incremento o contador de pessoas maiores de idade
		                contadorMaiores++;
		                
		                System.out.println(nomes[i] + " - " + idades[i] + " anos");
		            }
		        }
		        
		        if (contadorMaiores == 0) {
		            
		            System.out.println("Nenhuma pessoa maior de idade foi encontrada.");
		        } else {
		            
		            System.out.println("\nTotal de pessoas maiores de idade: " + contadorMaiores);
		        }
		  
		        ler.close();
		    }
		}


