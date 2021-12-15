package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor seja inválido e continue pedindo
até que o usuário informe um valor válido.
*/

public class Ex2_Nota {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int nota;

        System.out.println("Digite um valor entre 0 - 10: ");
        nota = ler.nextInt();

        while (nota < 0 || nota > 10){

            System.out.println("Valor inválido! Digite novamente");
            nota = ler.nextInt();

        }

        System.out.println("O valor digitado foi: " + nota);

    }

}
