import java.util.Scanner;

public class Numbers {
    public static String say(long n) {
        int arN[] = new int[10];
        Scanner s = new Scanner(System.in);
        System.out.println("Insereix un numero");
        arN[10] = s.nextInt();

        switch (arN[0]) {
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eigth";
            case 9:
                return "nine";
            case 10:
                return "ten";

            default:
                return "";
        }

        switch (arN[1]) {
            case 11:
                return "eleven";
            case 12:
                return "twelve";
            case 13:
                return "thirteen";
            case 14:
                return "fourteen";
            case 15:
                return "fifteen";
            case 16:
                return "sixteen";
            case 17:
                return "seventeen";
            case 18:
                return "eighteen";
            case 19:
                return "nineteen";
            default:
                return "";

        }

        switch (arN[2]){

            case 2:
                return "twenty";
            case 3:
                return "thirteen";
            case 4:
                return "forty-" + arN[0];
            case 5:
                return "fifthy" + arN[0];
            case 6:
                return "sixty" + arN[0];
            case 7:
                return "seventy" + arN[0];
            case 8:
                return "eighty" + arN[0];
            case 9:
                return "ninety" + arN[0];
            default:
                return "";
        }

        switch (arN[3]){
            case 1:
                return "one hundred and" + arN[2];
            case 2:
                return "two hundred and" + arN[2];
            case 3:
                return "three hundred and" + arN[2];
            case 4:
                return "forth hundred and" + arN[2];
            case 5:
                return "fifth hundred and" + arN[2];
            case 6:
                return "six hundred and" + arN[2];
            case 7:
                return "seven hundred and" + arN[2];
            case 8:
                return "eight hundred and" + arN[2];
            case 9:
                return "nine hundred and" + arN[2];
            default:
                return "";
        }
    }