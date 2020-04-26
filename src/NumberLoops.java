/*

 */

import java.util.Scanner;

public class NumberLoops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;

        do {
            System.out.println("Select a program by entering its number or 0 quit:\n" +
                    "1 - Print numbers 1-10\n" +
                    "2 - Print numbers 1-10 backwards\n" +
                    "3 - Print odd numbers from 1-20\n" +
                    "4 - Print even numbers from 1-20\n" +
                    "5 - Print all numbers from your selection to 1\n" +
                    "6 - Print sum of all values 1-10\n" +
                    "7 - Print sum of all values from your selection to 1\n" +
                    "8 - Print a rectangle\n" +
                    "9 - Print a right facing triangle\n" +
                    "10 - Print a left facing triangle\n" +
                    "11 - Print the factorial of a number\n");

            num = input.nextInt();

            switch (num) {
                case 1:
                    oneThruTen();
                    break;
                case 2:
                    tenThruOne();
                    break;
                case 3:
                    oddTwenty();
                    break;
                case 4:
                    evenTwenty();
                    break;
                case 5:
                    selectionToOne();
                    break;
                case 6:
                    sumOneThruTen();
                    break;
                case 7:
                    sumSelection();
                    break;
                case 8:
                    printRect();
                    break;
                case 9:
                    printLeftTri();
                    break;
                case 10:
                    printRightTri();
                    break;
                case 11:
                    getFactorial();
                    break;
                default:
                    System.out.println("Goodbye!");
                    System.exit(1);
            }
        } while (num != 0);
    }

    //Write a program that prints the numbers 1-10.
    public static void oneThruTen() {
        for (int i = 1; i < 11; i += 1) {
            System.out.println(i);
        }
    }
    //Write a program that prints the numbers 1-10 backwards.
    public static void tenThruOne() {
        for (int i = 10; i > 0; i -= 1) {
            System.out.println(i);
        }
    }
    //Write a program that prints all the odd numbers from 1-20.
    public static void oddTwenty() {
        for (int i = 1; i < 21; i += 2) {
            System.out.println(i);
        }
    }
    //Write a program that prints all the even numbers from 1-20.
    public static void evenTwenty() {
        for (int i = 2; i < 21; i += 2) {
            System.out.println(i);
        }
    }
    //Have the user input a number and print all numbers from that input value to 1.
    public static void selectionToOne() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = input.nextInt();

        for (; num > 0; num -= 1) {
            System.out.println(num);
        }
    }
    //Sum all values from 1-10.
    public static void sumOneThruTen() {
        int sum = 0;

        for (int i = 1; i < 11; i += 1) {
            sum += i;
        }

        System.out.println(sum);
    }
    //Have the user enter a number and print the sum of all numbers from that inputted value to 1.
    public static void sumSelection() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = input.nextInt();
        int sum = 0;

        for (; num > 0; num -= 1) {
            sum += num;
        }

        System.out.println(sum);
    }

    public static void printRect() {
        for (int i = 0; i < 4; i += 1) {
            System.out.println("**********");
        }
    }

    public static void printLeftTri() {
        String star = "*";
        for (int i = 0; i < 5; i += 1) {
            System.out.println(star);
            star = star.concat("*");
        }
    }

    public static void printRightTri() {
        String star = "        *";
        for (int i = 1; i < 11; i += 1) {
            star = star.replace(" ", "*");
            System.out.println(star);
        }
    }

    public static void getFactorial() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int product = input.nextInt();

        for (int i = product; i > 1; i -= 1) {
            product *= (i - 1);
        }

        System.out.println(product);
    }
}

