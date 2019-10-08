package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {


        public static final int MIN = 0;	// the minimum of the guess range
        public static final int MAX = 100;  // the minimum of the guess range

    public static void main(String[] args) {

        System.out.println("Please choose a number (0 and 100) and I will guess!");

        Scanner input = new Scanner(System.in);

        Random rand = new Random();
        char feedback = 'o';
        int min = MIN;
        int max = MAX;
        // this line makes the first guess between 0 and 100
        int guess = min + rand.nextInt(max-min+1);

		/*==============================================================================*/
	do
        {
            if(feedback=='l')
            {
                min=guess;
            }
            else if(feedback=='s')
            {
                max=guess;
            }
            guess = rand.nextInt(max-min+1) + min;
            System.out.println("Is your number " + guess + "?");
            feedback=input.next().charAt(0);

        }
        while(feedback!='c');
		System.out.println("This number is CORRECT");



		/*==============================================================================*/


        if(feedback == 'c' )
            System.out.println("The number you chose is " + guess + "!");

    }
    }

