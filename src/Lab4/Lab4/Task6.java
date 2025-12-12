package Lab4;

import java.util.Random;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите количество строк: ");
        int rows = in.nextInt();

        System.out.print("Введите количество столбцов: ");
        int cols  = in.nextInt();

        int[][] original  = new int[rows][cols];
        Random random = new Random();

        System.out.println("\nИсходный массив " + rows + "x" + cols + ":");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                original[i][j] = random.nextInt(100);
                System.out.printf("%4d", original[i][j]);
            }
            System.out.println();
        }

        int rowToRemove = random.nextInt(rows);
        int colToRemove = random.nextInt(cols);

        System.out.println("\nУдаляется строка №" + rowToRemove + " и столбец №" + colToRemove);

        int[][] modified = new int[rows - 1][cols - 1];

        for (int i = 0; i < rows; i++) {
            if (i == rowToRemove) {
                continue;
            }
            for (int j = 0; j < cols; j++) {
                if (j == colToRemove) {
                    continue;
                }
                int newI = (i < rowToRemove) ? i : i - 1;
                int newJ = (j < colToRemove) ? j : j - 1;
                modified[newI][newJ] = original[i][j];
            }
        }

        System.out.println("\nИзменённый массив " + (rows - 1) + "x" + (cols - 1) + ":");
        for (int i = 0; i < rows - 1; i++) {
            for (int j = 0; j < cols - 1; j++) {
                System.out.printf("%4d", modified[i][j]);
            }
            System.out.println();
        }
    }
}
