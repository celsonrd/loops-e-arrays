package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
*/
public class Ex6_Fatorial {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int numero = 0, fat = 1;

        System.out.print("Digite um número para calcular o fatorial: ");
        numero = ler.nextInt();

        for (int i = numero; i >= 1; i--){

            fat = fat * i;

        }

        System.out.println("O fatorial de " + numero + " é " + fat);


    }

}
