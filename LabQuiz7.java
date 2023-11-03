import java.util.Scanner;

public class LabQuiz7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 3-by-3 matrix row by row:");
        double[][] matrix = new double[3][3];
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                matrix[x][y] = input.nextDouble();
            }
        }

    }

    public static boolean isMarkovMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double num : row) {
                if (num <= 0) {
                    return false;
                }
            }
        }
        for (int j = 0; j < matrix[0].length; j++) {
            double sum = 0;
            for (double[] doubles : matrix) {
                sum += doubles[j];
            }
            if (sum != 1) {
                return false;
            }
        }

        return true;
    }
}
