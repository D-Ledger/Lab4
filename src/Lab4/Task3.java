package Lab4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите количество строк: ");
        int rows = in.nextInt();

        System.out.print("Введите количество столбцов: ");
        int cols  = in.nextInt();

        int z = 0;

        int[][] rectangle = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                rectangle[i][j] = 2;
            }
        }

        for (int i = 0; i < rows; i++) {
            int score = i + 1;
            System.out.print("номер строки: " + score + " ");
            for (int j = 0; j < cols; j++) {
                System.out.print(rectangle[i][j]);
                z++;
            }
            System.out.println(" Количество символов в строке " + z);
            z = 0;
        }
    }
}
