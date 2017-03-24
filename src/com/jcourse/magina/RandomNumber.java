package com.jcourse.magina;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;


public class RandomNumber {
    public void guess (int n){ // n попыток
        Random r = new Random();
        int number = r.nextInt(100) + 1;
//        System.out.println("Число " + number);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner = new Scanner(System.in);
        int tr;
        int trr;
        for (int i=1; i < n + 1; i++) {


            System.out.println("Guess number! \n");
           /* try {
                tr = reader.read();
            } catch (IOException e) {
                e.printStackTrace();
            }
*/
            trr = scanner.nextInt ();

            if (trr == number) {
                System.out.println("Yes!! Number = " + trr);
                System.exit(10);
            }
            System.out.println("try " + i + " = " + trr);

            if (trr > number)
                System.out.println("Less < !\n");
            else System.out.println("More > !\n");
        }
        System.out.println("Не угадал!!! Это было " + number);
        System.exit(0);

    }
}
