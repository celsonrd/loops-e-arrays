package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
O usuário deve informar de qual numero ele deseja ver a tabuada.
A saída deve ser conforme o exemplo abaixo:

Tabuada de 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50
*/
public class Ex5_Tabuada {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int numero = 0, cont = 1;

        System.out.print("Digite um número para saber a tabuada: ");
        numero = ler.nextInt();

        while (cont <= 10){

            System.out.println(numero + " X " + cont + " = " + numero*cont);

            cont ++;
        }
    }

}
