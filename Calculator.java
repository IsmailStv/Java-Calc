import java.util.Scanner;

import static java.lang.Integer.parseInt;

import java.util.Scanner;

        import static java.lang.Integer.parseInt;

public class Calculator {
    public static void calculator (String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Input a number:");
        String string = in.nextLine();
        String[] elements = string.split(" ");

        if ((elements.length == 3) && (0 <= parseInt(elements[0]) && parseInt(elements[0]) <= 10)
                && (0 <= parseInt(elements[2]) && parseInt(elements[2]) <= 10)) {

            switch (elements[1]) {
                case "+":
                    System.out.println(parseInt(elements[0]) + parseInt(elements[2]));
                    break;
                case "-":
                    System.out.println(parseInt(elements[0]) - parseInt(elements[2]));
                    break;
                case "*":
                    System.out.println(parseInt(elements[0]) * parseInt(elements[2]));
                    break;
                case "/":
                    System.out.println(parseInt(elements[0]) / parseInt(elements[2]));
                    break;
            }
        }
        else
        if ((elements.length == 3) && RomanNumeral.valueOf(elements[0]) != null &&
                RomanNumeral.valueOf(elements[2]) != null) {
            RomanNumeral number1 = RomanNumeral.valueOf(elements[0]);
            RomanNumeral number2 = RomanNumeral.valueOf(elements[2]);
            int x = 0;
            switch (elements[1]) {
                case "+":
//                        System.out.println(number1.getArabiс() + number2.getArabiс());
                    x = (number1.getArabiс() + number2.getArabiс());
//                        System.out.println(RomanNumeralXX.values()[x-1]);
                    break;
                case "-":
                    x = (number1.getArabiс() - number2.getArabiс());
//                        System.out.println(RomanNumeralXX.values()[x-1]);
                    break;

                case "*":
                    x = (number1.getArabiс() * number2.getArabiс());
//                        System.out.println(RomanNumeralXX.values()[x-1]);
//                        System.out.println(number1.getArabiс() * number2.getArabiс());
                    break;

                case "/":
                    x = (number1.getArabiс() / number2.getArabiс());
//                        System.out.println(RomanNumeralXX.values()[x-1]);
                    break;}

            if (x > 0) {
                System.out.println(RomanNumeralXX.values()[x-1]);}

            else {
                System.out.println("Nonono!");
            }


        }
        else {
            System.out.println("Not correct");
        }

        in.close();
    }
}