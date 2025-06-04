package atividades;
import java.util.Scanner;
public class ativ3 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        // Exibe menu e solicita entrada
	        System.out.println("DIA DA SEMANA ");
	        System.out.println("1-Domingo 2-Segunda 3-Terça 4-Quarta 5-Quinta 6-Sexta 7-Sábado");
	        System.out.print("Digite o número: ");
	        int dia = scanner.nextInt();
	        
	        // Verifica e exibe o dia correspondente
	        switch (dia) {
	            case 1: System.out.println("DOMINGO"); break;
	            case 2: System.out.println("SEGUNDA-FEIRA"); break;
	            case 3: System.out.println("TERÇA-FEIRA"); break;
	            case 4: System.out.println("QUARTA-FEIRA"); break;
	            case 5: System.out.println("QUINTA-FEIRA"); break;
	            case 6: System.out.println("SEXTA-FEIRA"); break;
	            case 7: System.out.println("SÁBADO"); break;
	            default: System.out.println("Errou amigão: Digite apenas números de 1 a 7");
	        }
	        
	        scanner.close();
	    }
	}

