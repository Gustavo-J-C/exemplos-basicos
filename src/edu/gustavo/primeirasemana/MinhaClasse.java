package edu.gustavo.primeirasemana;
public class MinhaClasse {

    public static void main(String[] args) {

       String primeiroNome = "Gustavo";
       String SegundoNome = "Costa";

       String nomeCompleto = nomeCompleto(primeiroNome, SegundoNome);
       System.out.println(nomeCompleto);
    }

    public static String nomeCompleto ( String primeiroNome, String SegundoNome) {
        return primeiroNome.concat(" ").concat(SegundoNome);
    }
}
