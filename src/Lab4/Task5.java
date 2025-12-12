package Lab4;

import java.util.Scanner;
import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите количество строк: ");
        int rows = in.nextInt();

        System.out.print("Введите количество столбцов: ");
        int cols  = in.nextInt();

        int[][] matrix = new int[rows][cols];
        Random random = new Random();

        System.out.println("\nИсходный массив " + rows + "x" + cols + ":");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(100);
                System.out.printf("%4d", matrix[i][j]);
            }
            System.out.println();
        }

        int[][] transposed = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }

        System.out.println("\nТранспонированный массив " + cols + "x" + rows + ":");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.printf("%4d", transposed[i][j]);
            }
            System.out.println();
        }
    }
}
