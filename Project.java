import java.util.List;
import java.util.Scanner;

public class Project {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns of the array: ");
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        double[][] array = new double[rows][cols];

        System.out.println("Enter the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = scanner.nextDouble();
            }
        }

        int[] location = locateLargest(array);
        System.out.println("The location of the largest element is at (" + location[0] + ", " + location[1] + ")");
    }

    public static int[] locateLargest(double[][] a) {
        int[] location = { 0, 0 };
        double max = a[0][0];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > max) {
                    max = a[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }

        return location;
    }
}