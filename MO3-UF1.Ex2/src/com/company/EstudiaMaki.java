package com.company;

import java.util.Scanner;

public class EstudiaMaki {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        int num = 1;

        System.out.println("Cual es tu número?");
        num = input.nextInt();

        switch (num) {
            case 1: System.out.println("Soy el primero");
                    break;

            case 2: System.out.println("Soy el segundo");
                    break;

            case 3: System.out.println("Soy el tercero");
                    break;

            default: System.out.println("Soy chistosito");
                    break;

        }
    }


}
