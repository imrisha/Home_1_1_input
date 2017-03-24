/**
 * Created by Игорь on 23.03.2017.
 */
//package com.jcourse.magina;

import com.jcourse.magina.Echo;
import com.jcourse.magina.RandomNumber;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;


public class MainClass {
        public static void main (String[] args) {


            Echo e1 = new Echo();
     //       e1.Echo1();
            RandomNumber rnd = new RandomNumber();
            rnd.guess(8);


        }
}
