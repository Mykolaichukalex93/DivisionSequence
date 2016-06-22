package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
//Input number
        System.out.println("Enter number here : ");
        String s = "";

        try {
            BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
            s = bufferRead.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

//Algorithm
        int number = Integer.parseInt(s);
        System.out.println("Number to check: " + number);
        String sequence = "";

        for (int i = number; i > 0; i--) {
            if (number % i == 0) {
                sequence = sequence + i + " ";
            }
        }

        System.out.println("Sequence: " + sequence);
    }
}