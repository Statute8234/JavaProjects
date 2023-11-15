import java.util.Scanner;

public class Chapeter9 {
    public static void main(String[] args) {
        String[][] Board = new String[3][3];
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Pick a letter between [o and x]");
            String picked = input.nextLine();
            if (!picked.equalsIgnoreCase("O") && !picked.equalsIgnoreCase("X")) {
                System.out.printf("Sorry, but '{%s}' is not an option \n", picked);
            } else {
                System.out.println("Pick a location in the 3-by-3 grid");
                int row = input.nextInt();
                int column = input.nextInt();
                if (!checkUserInput(row, column, Board)) {
                    System.out.printf("Sorry, {%d} and {%d} is not a valid spot \n", row, column);
                } else {
                    Board[row][column] = picked;
                    PrintBord(Board);
                }
            }
        }
    }

    public static boolean checkUserInput(int row, int column, String[][] Board) {
        // check user values
        if ((row > Board.length || column > Board[Board.length].length) && (row < 0 || column < 0)) {
            return false;
        }
        return Board[row][column].equals("null");
    }

    public static void PrintBord(String[][] Board) {
        String spot;
        for (int x = 0; x < Board.length; x++) {
            for (int y = 0; y < Board[x].length; y++) {
                if (Board[x][y].equals("null")) {
                    spot = " ";
                } else {
                    spot = Board[x][y];
                }
                System.out.print(spot);
            }
            System.out.println();
        }
    }
}
