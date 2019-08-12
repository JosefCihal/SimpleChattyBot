package bot;

import java.util.Scanner;

public class SimpleBot {
    public static void main(String[] args) {
        System.out.println("Hello! My name is Alien.");
        System.out.println("I was created in 2019.");
        System.out.println("Please, remind me your name.");
        Scanner scanner = new Scanner (System.in);
        String userName = scanner.nextLine();
        System.out.println("What a great name you have, "+ userName+ "!");
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        int remainderThree = scanner.nextInt();
        int remainderFive = scanner.nextInt();
        int remainderSeven = scanner.nextInt();
        int age = (remainderThree * 70 + remainderFive * 21 + remainderSeven * 15) % 105;
        System.out.println("Your age is "+ age + "; that's a good time to start programming!");
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int number = scanner.nextInt();
        for (int i = 0; i <= number; i++){
            System.out.println(i + "!");
        }
        System.out.println("Let's test your programming knowledge.");
        System.out.println("Why do we use methods?");
        System.out.println("1. To repeat a statement multiple times.");
        System.out.println("2. To decompose a program into several small subroutines.");
        System.out.println("3. To determine the execution time of a program.");
        System.out.println("4. To Interrupt the execution of a program.");
        int response = scanner.nextInt();
        while (response != 2){
            System.out.println("Please, try again.");
            response = scanner.nextInt();
        }
        System.out.println("Congratulations, have a nice day!");
    }
}
