package br.com.dio;

import java.util.Scanner;

class Desafio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int A, B, soma;

        A = sc.nextInt();
        B = sc.nextInt();

        soma = A + B ;  //insira as variáveis corretamente

        System.out.println("SOMA \n = \n" +  soma);

        sc.close();

    }
}
