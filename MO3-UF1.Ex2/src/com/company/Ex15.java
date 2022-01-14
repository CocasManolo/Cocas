package com.company;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Escriu el primer nombre, a");
        int a = input.nextInt();
        System.out.println("Escriu el segon nombre, b");
        int b = input.nextInt();
        System.out.println("Escriu el tercer nombre, c");
        int c = input.nextInt();
        if (b > a) {
            int aux = a;
            a = b;
            b = aux;
        }
        if (c > b) {
            int aux = b;
            b = c;
            c = aux;
            if (b > a) {
                aux = a;
                a = b;
                b = aux;
                }
                System.out.println("Nombres ordenats:" + a + " " + b + "" + c);
            }
        }

    }