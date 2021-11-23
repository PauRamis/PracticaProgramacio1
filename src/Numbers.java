
public class Numbers {
    public static String say(long n) {
        //Primer, pasarem el nombre "n" a un array format per tots els seus arDigits
        String number = String.valueOf(n);
        char[] arDigits = number.toCharArray();

        //Ara voldrem trobar els ultims valors de l'array, per poder aplicar les funcions
        for (int i = 1; i < arDigits.length; i++) {
            int a = arDigits[arDigits.length - i];

        }

        String numero = unitat(n);
        //String numero = desena1(n);
        //String numero = desena2(n);
        //String numero = centena(n);
        return numero.substring(0, 1).toUpperCase() + numero.substring(1);

    }

    //Aquesta funció agafa la primera unitat
    private static String unitat(long n) {
        String numero = "";
        switch ((int) n) {
            case 0:
                numero = "zero";
                break;
            case 1:
                numero = "one";
                break;
            case 2:
                numero = "two";
                break;
            case 3:
                numero = "three";
                break;
            case 4:
                numero = "four";
                break;
            case 5:
                numero = "five";
                break;
            case 6:
                numero = "six";
                break;
            case 7:
                numero = "seven";
                break;
            case 8:
                numero = "eigth";
                break;
            case 9:
                numero = "nine";
                break;
        }
        return numero;
    }

    private static String desena1(long n) {
        String numero = "";
        switch ((int) n) {
            case 10:
                numero = "ten";
                break;
            case 11:
                numero = "eleven";
                break;
            case 12:
                numero = "twelve";
                break;
            case 13:
                numero = "thirteen";
                break;
            case 14:
                numero = "fourteen";
                break;
            case 15:
                numero = "fifteen";
                break;
            case 16:
                numero = "sixteen";
                break;
            case 17:
                numero = "seventeen";
                break;
            case 18:
                numero = "eighteen";
                break;
            case 19:
                numero = "nineteen";
                break;
            default:
                numero = "";
                break;
        }
        return numero;
    }

    private static String desena2(long n) {
        String numero = "";
        switch ((int) n) {
            case 2:
                numero = "twenty";
            case 3:
                numero = "thirteen";
            case 4:
                numero = "forty";
            case 5:
                numero = "fifthy";
            case 6:
                numero = "sixty";
            case 7:
                numero = "seventy";
            case 8:
                numero = "eighty";
            case 9:
                numero = "ninety";
        }
        return numero;
    }

    private static String centena(long n) {
        String numero = "";
        switch ((int) n) {
            case 1:
                numero = "one hundred";
            case 2:
                numero = "two hundred";
            case 3:
                numero = "three hundred";
            case 4:
                numero = "forth hundred";
            case 5:
                numero = "fifth hundred";
            case 6:
                numero = "six hundred";
            case 7:
                numero = "seven hundred";
            case 8:
                numero = "eight hundred";
            case 9:
                numero = "nine hundred";
        }
        return numero;
    }

    public static long words(String s) {
        return 0;
    }

}