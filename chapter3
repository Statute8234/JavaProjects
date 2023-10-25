import java.util.Scanner;
import java.util.Random;

public class chapter3 {
    public static void main(String[] args) {
        System.out.println("Section 3.1");
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter A, B, C: ");
        double NumA = userInput.nextDouble();
        double NumB = userInput.nextDouble();
        double NumC = userInput.nextDouble();
        double discriminant = Math.pow(NumB, 2) - 4 * NumA * NumC;
        if (discriminant > 0) {
            double formula1 = (-NumB + Math.sqrt(discriminant)) / (2 * NumA);
            double formula2 = (-NumB - Math.sqrt(discriminant)) / (2 * NumA);
            System.out.println("The equation has two real roots: r1 = " + formula1 + " and r2 = " + formula2);
        } else if (discriminant == 0) {
            double formula1 = -NumB / (2 * NumA);
            System.out.println("The equation has one real root: r1 = " + formula1);
        } else {
            System.out.println("The equation has no real roots.");
        }
        System.out.println("Section 3.7");
        System.out.println("How manny dollars do you have?: ");
        System.out.println("How manny pennies do you have?: ");
        int dollars = userInput.nextInt();
        int pennies = userInput.nextInt();
        if (dollars > 1) {
            if (pennies > 1) {
                System.out.printf("You have %d dollars and %d pennies\n", dollars, pennies);
            } else if (pennies == 1) {
                System.out.printf("You have %d dollars and %d pennie\n", dollars, pennies);
            }
        } else if (dollars == 1 && pennies > 1) {
            System.out.printf("You have %d dollar and %d pennies\n", dollars, pennies);
        }
        System.out.println("Section 3.9");
        System.out.println("Enter the first digts of ISBN: ");
        int FirstNineDigits = userInput.nextInt();
        int checksun = 0;
        int temp = FirstNineDigits;
        for (int i = 9; i >= 1; i--) {
            int digit = temp % 10;
            checksun += digit * i;
            temp /= 10;
        }

        checksun %= 11;
        char lastDigit;
        if (checksun == 10) {
            lastDigit = 'X';
        } else {
            lastDigit = (char)(checksun + 'O');
        }

        String isbn10 = String.format("%09d%c", FirstNineDigits, lastDigit);
        System.out.println("The 10-digit ISBN is: " + isbn10);
        System.out.println("Section 3.14");
        Random randint = new Random();
        System.out.println("heads or tails? ");
        String choice = userInput.nextLine();
        int flipCoin = randint.nextInt(1,2);
        String coinState = "";
        if (flipCoin == 0) {
            coinState = "heads";
        } else {
            coinState = "tails";
        }
        if (choice.equals(coinState) || !choice.equals(coinState)) {
            System.out.println("The coins state is: " + coinState);
        }
        System.out.println("Section 3.21");
        System.out.print("Enter year: ");
        int year = userInput.nextInt();
        System.out.print("Enter month number: ");
        int month = userInput.nextInt();
        System.out.print("Enter day: ");
        int day = userInput.nextInt();
        if (month == 1 || month == 2) {
            month += 12;
            year--;
        }
        int j = year / 100;
        int k = year % 100;
        int h = (day + 26 * (month + 1) / 10 + k + k / 4 + j / 4 + 5 * j) % 7;
        String[] daysOfWeek = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        System.out.println("Day of the week is " + daysOfWeek[h]);
    }

}
