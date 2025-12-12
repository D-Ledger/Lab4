package Lab4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите размер треугольника: ");
        int size = in.nextInt();

        char[][] triangle = new char[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j <= i) {
                    triangle[i][j] = '+';
                } else {
                    triangle[i][j] = ' ';
                }
            }
        }

        for (int i = 0; i < size; i++) {
            int score = i + 1;
            System.out.print("номер строки: " + score + " ");
            for (int j = 0; j < size; j++) {
                System.out.print(triangle[i][j]);
            }
            int z = i + 1;
            System.out.println(" Количество символов в строке " + z);
        }
    }
}
