package br.com.dio;
import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float altura, peso, idade, imc;
        char nome;
        System.out.println("Informe o seu nome: ");
        nome = scan.next().charAt(0);
        System.out.println("Informe sua altura: ");
        altura = scan.nextFloat();
        System.out.println("Informe sua idade");
        idade = scan.nextFloat();
        System.out.println("Informe seu peso");
        peso=scan.nextFloat();
        imc = peso/(altura*altura);
        System.out.println("IMC" + imc);


    }


}
