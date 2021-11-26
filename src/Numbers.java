import java.util.Arrays;

public class Numbers {
    public static String say(long n) {
        //Primer, pasarem el nombre "n" a un array format per tots els seus digits ordenats
        //Basicament convertim l'int a string, després agafam l'equivalent a la taula ASCII, i el tornam a convertir.
        int[] arDigits = Integer.toString((int) n).chars().map(c -> c - '0').toArray();


        String numeroActual = "";
        //la funció ordreIfs ens tornarà cada vegada el nom del nombre que pertoqui
        if (n > 20) {
            for (int i = 0; i < arDigits.length; i++) {
                numeroActual = ordreIfs(arDigits, n, i);
            }
            //Aquest else és exclusiu pels nombres menors de 20
        } else for (int i = 0; i < arDigits.length; i++) {
            numeroActual = ordreIfs(arDigits, n, i);
        }
        //Retornam el resultat, però la primera lletra en majuscules.

        String resultat = "";
        resultat = resultat + numeroActual;
        return resultat.toUpperCase().substring(0, 1) + resultat.substring(1);
    }

    //Aquesta funció decideix a quina de les proximes funcions anirá el programa, depengent de la longitut del nombre n
    private static String ordreIfs(int[] arDigits, long n, int i) {
        String numero = "";

        //Primer de tot, si es menos que 1, es zero directament, i si es menor a 10, va a la funció unitat.
        if (n < 1) {
            numero = "zero";
        } else if (n < 10) {
            numero = unitat(arDigits);

            //Si son menys de 20, van a desenes de 10.
        } else if (n < 20) {
            numero = desenesDe10(arDigits);

        } else if (n < 100) {
            numero = desena(arDigits);

        } else if (n < 1000) {
            numero = centena(arDigits);
        }
        return numero;
    }

    //Aquestes funcions, s'activaran quan el caracter sigui una unitat, desena, centena, etc
    private static String unitat(int[] arDigits) {
        String numero = "";
        switch (arDigits[0]) {
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
            default:
                numero = "";
                break;
        }
        return numero;
    }

    private static String desenesDe10(int[] arDigits) {
        String numero = "";
        switch (arDigits[1]) {

            case 0:
                numero = "ten";
                break;
            case 1:
                numero = "eleven";
                break;
            case 2:
                numero = "twelve";
                break;
            case 3:
                numero = "thirteen";
                break;
            case 4:
                numero = "fourteen";
                break;
            case 5:
                numero = "fifteen";
                break;
            case 6:
                numero = "sixteen";
                break;
            case 7:
                numero = "seventeen";
                break;
            case 8:
                numero = "eighteen";
                break;
            case 9:
                numero = "nineteen";
                break;
        }
        return numero;
    }

    private static String desena(int[] arDigits) {
        String numero = "";
        switch (arDigits[1]) {
            case 1:
                numero = "";
                break;
            case 2:
                numero = "twenty";
                break;
            case 3:
                numero = "thirty";
                break;
            case 4:
                numero = "forty";
                break;
            case 5:
                numero = "fifty";
                break;
            case 6:
                numero = "sixty";
                break;
            case 7:
                numero = "seventy";
                break;
            case 8:
                numero = "eighty";
                break;
            case 9:
                numero = "ninety";
                break;
        }
        return numero;
    }

    private static String centena(int[] arDigits) {
        String numero = "";
        switch (arDigits[2]) {
            case 1:
                numero = "one hundred";
                break;
            case 2:
                numero = "two hundred";
                break;
            case 3:
                numero = "three hundred";
                break;
            case 4:
                numero = "forth hundred";
                break;
            case 5:
                numero = "fifth hundred";
                break;
            case 6:
                numero = "six hundred";
                break;
            case 7:
                numero = "seven hundred";
                break;
            case 8:
                numero = "eight hundred";
                break;
            case 9:
                numero = "nine hundred";
                break;
        }
        return numero;

    }


    public static long words(String s) {
        return 0;
    }

}