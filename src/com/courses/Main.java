package com.courses;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int a;
	Scanner in = new Scanner(System.in);
        System.out.println("Введите число, которое вы хотите проверить? ");
        a = in.nextInt();
        if ( a % 2 == 0 )
        {
            System.out.println("Ваше число четное - "+a);
        }
        else
        {
            System.out.println("Ваше число нечетное - "+a);
        }
        }
    }
