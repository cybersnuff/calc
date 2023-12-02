import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static String calc() {

        Scanner in = new Scanner(System.in);
        System.out.println("Input:");
       String input = in.nextLine();

        String[] array = input.split(" ");

        int x = 0;

        if (array.length > 3) {
            System.out.println("Output:");
            throw new RuntimeException("формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        }

        try {

            int a = Integer.parseInt(array[0]);
            int b = Integer.parseInt(array[2]);

            if (array[1].equals("+")) {
                x = a + b;

            } else if (array[1].equals("-")) {
                x = a - b;

            } else if (array[1].equals("/")) {
                x = a / b;

            } else if (array[1].equals("*")) {
                x = a * b;

            } else {
                System.out.println("Output:");
                throw new RuntimeException("неверный оператор, используйте только +, -, /, * " +
                        "Ваш знак - " + array[1]);

            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Output:");
            throw new RuntimeException("Cтрока не является математической операцией");

        } catch (NumberFormatException e) {
            System.out.println("Output:");
            throw new RuntimeException("Используйте только целые числа");

        }

        String result = Integer.toString(x);

            System.out.println("Output:");
            System.out.println(result);

            return result;

    }
    public static void main(String[] args) {
        calc();

    }
}