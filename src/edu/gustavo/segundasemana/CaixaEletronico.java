package edu.gustavo.segundasemana;

public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 50.00;
        double valorSolicitado = 57.0;

        if(valorSolicitado < saldo)
            saldo = saldo -valorSolicitado;

        System.out.println(saldo);
    }
}
