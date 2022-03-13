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
        peso = scan.nextFloat();
        imc = peso / (altura * altura);
        System.out.println("IMC" + imc);
        {
            if (imc < 18.5){
            System.out.println(" Abaixo do peso");
        }
       else if (imc >18.5 && imc<=24.9)
            {
        System.out.println("Peso normal");
    }
           else if  (imc >25  && imc <= 29.9)
            {
            System.out.println("Sobrepeso ");
           }
           else if(imc >30  && imc <= 34.9)
            {
                System.out.println("Obesidade grau I");
            }
            else if(imc >35  && imc>= 39.9)
            {
                System.out.println("Obesidade grau II, Vá malhar pra não morrer ! ");
            }


        }


    }
}
