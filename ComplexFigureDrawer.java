package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // get the number of lines to draw in the figure from the user
        System.out.println("Please enter an even number for the number lines in the figure: ");
        int nLines = input.nextInt();

        do {

            // this for loop and the two print statements print the first line of the figure
            System.out.print("#");
            for (int i = 0; i < (nLines*2); i++)
                System.out.print("=");
            System.out.println("#");
            //this  loop how many lines will be used for
            for (int line = 1; line <= nLines/2; line++) {
                System.out.print("|");
                for (int spaces = 1; spaces <= line * -2 + (nLines/2) * 2; spaces++) //finds the first number of spaces on each line
                {
                    System.out.print(" ");
                }
                System.out.print("<>");
                for (int dots = 1; dots <= line * 4 - 4; dots++)//number of dots per line
                {
                    System.out.print(".");
                }
                System.out.print("<>");
                for (int spaces = 1; spaces <= line * -2 + (nLines/2) * 2; spaces++) {//finds the second number of spaces on each line
                    System.out.print(" ");
                }
                System.out.println("|");
            }



                //this for loop counts backwards
            for (int line = nLines/2; line >= 1; line--) {
                System.out.print("|");
                for (int spaces = 1; spaces <= line * -2 + (nLines/2) * 2; spaces++) {
                    System.out.print(" ");
                }
                System.out.print("<>");
                for (int dots = 1; dots <= line * 4 -4; dots++) {
                    System.out.print(".");
                }
                System.out.print("<>");
                for (int spaces = 1; spaces <= line * -2 + (nLines/2) * 2; spaces++) {
                    System.out.print(" ");
                }
                System.out.println("|");
            }

            // this for loop and the two print statements print the last line of the figure
            System.out.print("#");
            for (int i = 0; i < (nLines*2); i++)
                System.out.print("=");
            System.out.println("#");



            // get the number of lines in the figure from the user
            System.out.println("Please enter an even number for the number lines in the figure: ");
            nLines = input.nextInt();


        } while(nLines != -1);  // when the user enter input -1, exit the do/while loop

        System.out.println("Thank you very much for using this program. See you later!");
    }
    }

