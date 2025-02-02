package edu.hender.primeirasemana;

public class MinhaClasse {
    public static void main(String[] args) {

        final String BR = "Brasilll"; // constante
        System.out.println(BR);

        String $nome;

        $nome = "Hender";

        System.out.println($nome);
        System.out.println(somar(2025, 1975));

    }

    public static String somar(int num1, int num2) {

        if ((num1 - num2) == 49) {
            return "Idade: " + (num1 - num2) + " anos";

        } else {
            return "Não";
        }
    }
}
