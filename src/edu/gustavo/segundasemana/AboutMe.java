package edu.gustavo.segundasemana;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        // criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        try {
            System.out.println("Digite seu nome");
            String nome = scanner.next();

            System.out.println("Digite seu sobrenome");
            String sobrenome = scanner.next();

            System.out.println("Digite sua idade");
            int idade = scanner.nextInt();
            if (idade <= 0) {
                throw new IllegalArgumentException("Idade inválida. A idade deve ser um número inteiro positivo.");
            }

            System.out.println("Digite sua altura");
            double altura = scanner.nextDouble();
            if (altura <=0 ) {
                throw new IllegalArgumentException("Altura inválida. A altura deve ser um número positivo.");
            }

            // imprimindo os dados obtidos pelo usuario
            System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
            System.out.println("Tenho " + idade + " anos ");
            System.out.println("Minha altura é " + altura + "cm ");
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Certifique-se de digitar o tipo correto de dados.");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}