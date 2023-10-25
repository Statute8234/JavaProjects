import java.util.Random;
import java.util.Scanner;
import java.util.random;
public class Chapter6 {
    public static void main(String[] args) {
        CrapsGame game = new CrapsGame();
        game.playCrap();

        for (int num = 1; num <= 100; num++) {
            System.out.println(getPentagonalNumber(num) + " ");
        }

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = obj.nextInt();
        System.out.println(isPalindrome(number));

        System.out.println("Feet Meters    Meters Feet");
        int i2 = 20;
        for (int i = 1; i < 11; i++) 
        {
            System.out.println(i + " " + footToMeter(i) + "      " + (i2) + " " + meterToFoot(i2));
            i2 += 5;
        }

        System.out.println("enter password");
        string password = obj.toString();
        if (isValidPassword(password)) {
            System.out.println(password + "is a valid password");
        }
    }

    public static int getPentagonalNumber(int n) {
        return n * (3 * n - 1) / 2;
    }

    public static int sumDigits(long n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static boolean isPalindrome(int number) {
        return reverse(number) == number;
    }

    public static int reverse(int number) {
        int reverseNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reverseNumber = reverseNumber * 10 + digit;
            number /= 10;
        }
        return reverseNumber;
    }

    public static double footToMeter(double foot) 
    {
        double meter = 0.305 * foot;
        return meter;
    }
    public static double meterToFoot(double meter)
    {
        double foot = 3.279 * meter;
        return foot;
    }

    public static boolean isValidPassword(String password) 
    {
        int passwordLength = password.length();
        boolean charicter;
        boolean stringCharacter;
        boolean returnVar = false; 
        for (int i = 0; i < passwordLength; i++)
        {
            char letter = str.charAt(i);
            if (charicter = isDigit(letter))
            {
                if (stringCharacter = isLetter(letter)) 
                {
                    returnVar = true;
                }
            }
        }
        return returnVar;
    }

    public class CrapsGame {
        // Named constants
        private static final int CRAPS = 2;
        private static final int NATURAL = 7;
        private static final int POINT = 0;
        private static final int WIN = 1;
        private static final int LOSE = -1;
        private static final int UNDECIDED = 0;
    
        // Method to roll a die and return the face value
        public int rollADie() {
            // Logic to roll a die and return the face value
            return 1 + (int)(Math.random() * 6);
        }
    }

    public int checkSumOfDice(int dice1, int dice2) {
        int sum = dice1 + dice2;
        if (sum == CRAPS || sum == NATURAL) {
            return sum;
        } else {
            return POINT;
        }
    }

    public int checkSumOfDice(int dice1, int dice2, int point) {
        int sum = dice1 + dice2;
        if (sum == point) {
            return WIN;
        } else if (sum == 7) {
            return LOSE;
        } else {
            return UNDECIDED;
        }
    }

    public void playCrap() {
        int dice1 = rollADie();
        int dice2 = rollADie();
        int sum = dice1 + dice2;

        int result;
        if (sum == CRAPS || sum == NATURAL) {
            result = sum;
        } else {
            System.out.println("Point established: " + sum);
            while (true) {
                dice1 = rollADie();
                dice2 = rollADie();
                result = checkSumOfDice(dice1, dice2, sum);
                if (result != UNDECIDED) {
                    break;
                }
            }
        }

        printResult(result);
    }

    public void printResult(int result) {
        switch (result) {
            case CRAPS:
                System.out.println("Crap - You Lose!");
                break;
            case NATURAL:
                System.out.println("Natural - You Win!");
                break;
            case WIN:
                System.out.println("You rolled the point established - You Win!");
                break;
            case LOSE:
                System.out.println("Seven rolled - You Lose!");
                break;
            default:
                System.out.println("Point established - Undecided");
        }
    }
}
