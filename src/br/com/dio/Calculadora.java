package br.com.dio;
import java.util.Scanner;

public class Calculadora {
    // a sequencia de comandos abaixo," puclic static int"  são chamados de metodos//
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Essa classe implementa as operações de entrada de dados pelo teclado no console precisa ser importada.//
        float a, b;

        System.out.println("DIGITE O PRIMEIRO NUMERO:");
        a = scan.nextFloat(); //captura números não inteiros  do teclado//
        System.out.println("DIGITE O SEGUNDO VALOR NUMERO:");
        b = scan.nextFloat();
        float soma = soma(a, b);
        float subtracao = subtracao(a, b);
        float multiplicacao = multiplicacao(a, b);
        float divisao = divisao(a, b);
        System.out.println("SOMA" + soma);
        System.out.println("SUBTRACAO" + subtracao);
        System.out.println("DIVISAO" + divisao);
        System.out.println("MULTIPLICACAO" + multiplicacao);
    }
    public static float soma(float a, float b) {
        return a + b;
    }
    public static float subtracao(float a, float b) {
        return a - b;
    }
    public static float divisao(float a, float b) {
        return (a / b) ;
    }
    public static float multiplicacao(float a, float b) {
        return a * b;
    }
}
