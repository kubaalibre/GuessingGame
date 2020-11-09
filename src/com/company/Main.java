package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Task1:
        //Create a guessing game:
        //1. User types a number.
        //2. program prints out "correct" or "not correct" depending on the number entered.
        //3. if the number is not correct, program promts the input again.
        //4. go to 1.
        //Hints:
        //1. Create a variable and assign a value to it.
        //2. Read user's input using Scanner.
        //3. Using "if" statement check if the number is correct or not.
        //4. Use while loop to repeat asking for a number.
        //5. Exit criteria would be a correct number.

        int Number = 0;
        while(!(Number==1)){
            System.out.println("Input number");
            Scanner scanner = new Scanner(System.in);
            int read = scanner.nextInt();
            if(read == 1){
                System.out.println("correct number");
                Number = read;
            } else {
                System.out.println("wrong number");
            }
        }
    }
}
