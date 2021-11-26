import java.util.Arrays;

public class Numbers {
    public static String say(long n) {
        //Primer, pasarem el nombre "n" a un array format per tots els seus digits ordenats
        //Basicament convertim l'int a string, després agafam l'equivalent a la taula ASCII, i el tornam a convertir.
        int[] arDigits = Integer.toString((int) n).chars().map(c -> c - '0').toArray();

        //Ara cream un array per posteriorment guardar els nombres en format de paruales, per la longitut usam l'anterior array com referencia
        String[] arParaules = new String[arDigits.length];

        //la funció ordreIfs ens tornarà cada vegada el nom del nombre que pertoqui
        for (int i = 0; i < arDigits.length; i++) {
            String numeroActual = ordreIfs(arDigits, n);
            arParaules[i] = numeroActual;
        }

        //Retornam el resultat, però la primera lletra en majuscules i eliminant els [].
        String resultat = Arrays.toString(arParaules);
        return resultat.toUpperCase().substring(0, 2).replace("[", "") + resultat.substring(2).replace("]", "");
    }

    //Aquesta funció decideix a quina de les proximes funcions anirá el programa, depengent de la longitut del nombre n
    private static String ordreIfs(int[] arDigits, long n) {
        String numero = "";

        //Primer de tot, si es menos que 10, va directe a la funció unitat.
        if (n < 10) {
            numero = unitat(arDigits);

            //Si son menys de 20, van a desenes de 10.
        } else if (n < 20){
            numero = desenesDe10(arDigits);

        //Els altres dependràn del nombre de caractes que tengui el nombre, i pot ser necessitem més d'una funcio (exemple: 101, nesecita 100 i 1, una unitat i una centena)
        } else if (arDigits.length < 3) {
            numero = desena(arDigits);

        } else if (arDigits.length < 4) {
            numero = centena(arDigits);
        }
        return numero;
    }


    //Aquestes funcions, s'activaran quan el caracter sigui una unitat, desena, centena, etc
    private static String unitat(int[] arDigits) {
        String numero = "";
        switch (arDigits[0]) {
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
            default:
                numero = "";
                break;

        }
        return numero;
    }

    private static String desenesDe10(int[] arDigits) {
        String numero = "";
        switch (arDigits[0]) {

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

    private static String centena(int[] arDigits) {
        String numero = "";
        switch (arDigits[2]) {
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