import java.util.Arrays;

public class Main {
    public static String calc(String input) {

        System.out.println("Input:");
        System.out.println(input);

        String[] array = input.split(" ");

        if (array.length > 3){
            System.out.println("Output:");
            System.out.println("throws Exception //т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
            System.exit (1);

        }

        int x = 0;

        try {

            int a = Integer.parseInt(array[0]);
            int b = Integer.parseInt(array[2]);


            switch (array[1]) {
                case "+":
                    x = a + b;
                    break;

                case "-":
                    x = a - b;
                    break;

                case "*":
                    x = a * b;
                    break;

                case "/":
                    x = a / b;
                    break;

            }

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Output:");
            System.out.println("Exception //т.к. строка не является математической операцией");
            System.exit (1);

        }catch (NumberFormatException e){
            System.out.println("Output:");
            System.out.println("throws Exception ");
            System.exit (1);
        }

    String result  = Integer.toString(x);

        System.out.println("Output:");
        System.out.println(result);
        return result;

    }

}


