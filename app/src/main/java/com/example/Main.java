package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner env = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String username = env.nextLine();
        float valor = 0f;
        int quantidade =0;

        float total = 0f;
        float maiorNumero = 0f;
        float menorNumero = 0f;    

        int caso = 1;

        do {
            
            System.out.println("Digite o valor da compra:");
            valor = env.nextFloat();
            quantidade++;


            System.out.println("Deseja continuar? (1 - Sim, 2 - Não):");
            caso = env.nextInt();
        } while (caso != 1);


    }
}