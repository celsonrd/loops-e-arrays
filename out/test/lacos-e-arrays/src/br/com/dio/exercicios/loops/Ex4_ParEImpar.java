package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que peça N números inteiros, calcule e mostre a quantidade de números pares e a quantidade de números
impares.
*/
public class Ex4_ParEImpar {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int numero = 0, par = 0, impar = 0, quantidadeRepeticoes = 0;

        System.out.print("Digite a quantidade de repeticoes (valor maior que zero): ");
        quantidadeRepeticoes = ler.nextInt();

        while (quantidadeRepeticoes > 0) {

            System.out.print("Digite um número inteiro: ");
            numero = ler.nextInt();

            if (numero % 2 == 0) {

                par++;

            } else {

                impar++;

            }

            quantidadeRepeticoes--;
        }


        System.out.println("Quantidade de números impares: " + impar);
        System.out.println("Quantidade de números pares: " + par);
    }
}
