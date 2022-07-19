package com.project;

import  java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        float a,b;
        char operator;
        Scanner input = new Scanner(System.in);

        System.out.println("===KALKULATOR SEDERAHANA===");
        System.out.print("Masukani nilai a -> ");
        a = input.nextFloat();
        System.out.print("Masukan operator -> ");
        operator = input.next().charAt(0);
        System.out.print("Masukan nilai b -> ");
        b = input.nextFloat();

        switch(operator){

            case '+' :
                System.out.println(a + " + " + b + " = " + (a + b));
                break;
            case '-' :
                System.out.println(a + " - " + b + " = " + (a - b));
                break;
            case '*' :
                System.out.println(a + " * " + b + " = " + (a * b));
                break;
            case '/' :

                if(b == 0){

                    System.out.println("tidak bisa membagi dengan 0");
                }else{

                    System.out.println(a + " / " + b + " = " + (a / b));
                }
                break;
            default :
                System.out.println("Maaf operator tidak tersedia");
        }
    }
}
