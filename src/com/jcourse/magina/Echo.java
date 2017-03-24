package com.jcourse.magina;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Echo {

    public void Echo1() {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //String s = null;
        System.out.println("start typing, 0-exit");
        try {
            //s = reader.readLine();
            int c;
            while ((c = reader.read()) != -1) {
                if ((char) c == '0') break;
                System.out.print((char) c);
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

        //System.out.println(s);


        System.out.println("\n Please typing again, 0-exit \n");

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String s = scanner.next();
            System.out.println(s);
            if ("0".equals(s)) break;
        }
        System.out.println("Exit!");

        // System.out.println("Please typing again, 0-exit");
        /* 3 из командной строки
                while(true) {
                    String s = System.console().readLine();
                    System.out.println(s);
                    if("0".equals(s)) break;
                }
        */
    }

}


