package com.company;

import java.util.Scanner;

public class Main {
/* Escribir un programa que pida al usuario un número entero y muestre por pantalla si es par o impar.

 */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
	    int numero;
        System.out.println("Escriba un número");
        numero = scan.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Es par");
        } else
            System.out.println("Es impar");

    }
}
