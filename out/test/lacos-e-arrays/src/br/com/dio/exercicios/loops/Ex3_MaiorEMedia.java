package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que leia 5 números e informe o maior número e a média desses números.
*/
public class Ex3_MaiorEMedia {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int maior = 0, soma = 0, numero = 0 , cont = 0;

        while (cont < 5){
            System.out.println("Digite um número: ");
            numero = ler.nextInt();

            if (maior < numero)

                maior = numero;

            soma = soma + numero;

            cont ++;
        }

        System.out.println("O maior número foi:" + maior);
        System.out.println("A média dos números digitados foi: " + soma/5);

    }
}
