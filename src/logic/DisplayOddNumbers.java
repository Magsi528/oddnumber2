package logic;

public class DisplayOddNumbers {
    public void displayOddNumbersUpTo(int number) {
        System.out.println("Odd numbers from 1 to " + number + " are:");
        for (int i = 1; i <= number; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
