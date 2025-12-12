package Lab4;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите текст для шифрования:");
        String text = in.nextLine();

        System.out.print("Введите ключ:");
        int shift = in.nextInt();

        String encryptedText = getEncryptString(text, shift);
        System.out.println("Текст после преобразования: " + encryptedText);

        System.out.println("Выполнить обратное преобразование? (y/n)");
        String response = in.next();

        switch (response.toLowerCase()) {
            case "y":
                String decryptedText = getDecryptString(encryptedText, shift);
                System.out.println("\nтекст после обратного преобразования: " + decryptedText);
                break;
            case "n":
                System.out.println("До свидания!");
                break;
            default:
                System.out.println("Введите корректный ответ");
                break;
        }

        in.close();
    }

    public static String getEncryptString(String encryptString, int shift) {
        char[] arrayChar = encryptString.toCharArray();

        long[] arrayInt = new long[arrayChar.length];

        char[] arrayCharNew = new char[arrayChar.length];

        for (int i = 0; i < arrayChar.length; i++) {
            arrayInt[i] = arrayChar[i] + shift;

            arrayCharNew[i] = (char) arrayInt[i];
        }

        encryptString = new String(arrayCharNew);
        return encryptString;
    }

    public static String getDecryptString(String decryptString, int shift) {
        char[] arrayChar = decryptString.toCharArray();

        long[] arrayInt = new long[arrayChar.length];

        char[] arrayCharNew = new char[arrayChar.length];

        for (int i = 0; i < arrayChar.length; i++) {
            arrayInt[i] = arrayChar[i] - shift;

            arrayCharNew[i] = (char) arrayInt[i];
        }
        decryptString = new String(arrayCharNew);
        return decryptString;
    }
}
