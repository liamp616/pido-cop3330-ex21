/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Liam Pido
 */

/*
Exercise 21 - Numbers to Names
Many programs display information to the end user in one form but use a different form inside the program.
For example, you may show the word Blue on the screen, but behind the scenes you’ll have a numerical value for that color or an
internal value because you may need to represent the textual description in another language for Spanish-speaking visitors.

Write a program that converts a number from 1 to 12 to the corresponding month.
Prompt for a number and display the corresponding calendar month, with 1 being January and 12 being December.
For any value outside that range, display an appropriate error message.

Example Output

Please enter the number of the month: 3
The name of the month is March.

Constraints

Use a switch or case statement for this program.
Use a single output statement for this program.

Challenges

Use a map or dictionary to remove the switch statement from the program.
Support multiple languages. Prompt for the language at the beginning of the program.
 */

package base;

import java.util.Scanner;

public class App {
    Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        App myApp = new App();

        int num = myApp.readNum();
        myApp.month(num);
    }

    public void month(int num) {
        switch(num) {
            case 1:
                System.out.println("The name of the month is January.");
                break;
            case 2:
                System.out.println("The name of the month is February.");
                break;
            case 3:
                System.out.println("The name of the month is March.");
                break;
            case 4:
                System.out.println("The name of the month is April.");
                break;
            case 5:
                System.out.println("The name of the month is May.");
                break;
            case 6:
                System.out.println("The name of the month is June.");
                break;
            case 7:
                System.out.println("The name of the month is July.");
                break;
            case 8:
                System.out.println("The name of the month is August.");
                break;
            case 9:
                System.out.println("The name of the month is September.");
                break;
            case 10:
                System.out.println("The name of the month is October.");
                break;
            case 11:
                System.out.println("The name of the month is November.");
                break;
            case 12:
                System.out.println("The name of the month is December.");
                break;
            default:
                System.out.println("Not a valid month number");
        }
    }

    public int readNum() {
        System.out.print("Please enter the number of the month: ");
        String input = in.nextLine();
        int num = Integer.parseInt(input);
        return num;
    }
}
