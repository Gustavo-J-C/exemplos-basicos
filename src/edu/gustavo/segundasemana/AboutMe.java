package edu.gustavo.segundasemana;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        // Criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        String nome = "";
        String sobrenome = "";
        int idade = 0;
        double altura = 0.0;
        
        boolean nomeValido = false;
        while (!nomeValido) {
            try {
                System.out.println("Digite seu nome");
                nome = scanner.next();
                nomeValido = true;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. O nome deve ser uma string.");
                scanner.next();
            }
        }
        
        boolean sobrenomeValido = false;
        while (!sobrenomeValido) {
            try {
                System.out.println("Digite seu sobrenome");
                sobrenome = scanner.next();
                sobrenomeValido = true;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. O sobrenome deve ser uma string.");
                scanner.next();
            }
        }

        boolean idadeValida = false;
        while (!idadeValida) {
            try {
                System.out.println("Digite sua idade");
                idade = scanner.nextInt();
                if (idade <= 0) {
                    throw new IllegalArgumentException("Idade inválida. A idade deve ser um número inteiro positivo.");
                }
                idadeValida = true;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. A idade deve ser um número inteiro.");
                scanner.next();
            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
        
        boolean alturaValida = false;
        while (!alturaValida) {
            try {
                System.out.println("Digite sua altura em centimetros");
                altura = scanner.nextDouble();
                if (altura <= 0) {
                    throw new IllegalArgumentException("Altura inválida. A altura deve ser um número positivo.");
                }
                alturaValida = true;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. A altura deve ser um número real.");
                scanner.next();
            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
        
        // Imprimindo os dados obtidos pelo usuário
        System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");
        
        scanner.close();
    }
}
