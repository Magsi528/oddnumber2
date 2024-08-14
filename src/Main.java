package main;

import java.util.Scanner;
import logic.DisplayOddNumbers;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the limit: ");
        int number = sc.nextInt();

        DisplayOddNumbers displayOddNumbers = new DisplayOddNumbers();
        displayOddNumbers.displayOddNumbersUpTo(number);

        sc.close();
    }
}
