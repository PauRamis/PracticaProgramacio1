import java.util.Arrays;
import java.util.Scanner;

public class pruebas {
    public static void main(String[] args) {

        long n = 2;

        //Primer, pasarem el nombre "n" a un array format per tots els seus digits ordenats
        //Basicament convertim l'int a string, després agafam l'equivalent a la taula ASCII, i el tornam a convertir.
        int[] arDigits = Integer.toString((int) n).chars().map(c -> c - '0').toArray();

        //Ara cream la funció bucle amb n i el seu array
        String resultat = bucle(arDigits, n);

        //Retornam el resultat, però la primera lletra en majuscules.
        System.out.println( resultat.toUpperCase().substring(0, 1) + resultat.substring(1));

        System.out.println("...");

        /* String str = Long.toString(n);

        str = str.substring(1);

        n = Long.valueOf(str);

        System.out.println(n+100); */
    }

    private static String bucle(int[] arDigits, long n) {
        String numeroActual = "";
        String numeroDefinitiu = "";

        //Si el nombre es 0 o menor a 20, no fa falta un bucle
        if (n < 1) numeroDefinitiu = "zero";
        else if (n < 20) numeroDefinitiu = ordreIfs(arDigits, n);
        else
            for (int i = 0; i < arDigits.length; i++) {

                //Agafam el primer nombre de l'array (si no l'hem agafat ja)
                numeroActual = ordreIfs(arDigits, n);

                //Afegir guinet
                if (n < 100 && n > 19){
                    numeroActual = numeroActual + "-";
                }

                //Anirem afegint els números actuals al número definitiu per cada passada del bucle
                numeroDefinitiu = numeroDefinitiu + numeroActual;

                //També anem dividint n entre 10 perquè el bucle vagi agafant de més gran a més petit.
                n = n / 10;
            }

        //Al final del bucle, es retorna el numero definitiu. Si queda un quionet sobrant, s'elimina.
        return numeroDefinitiu.replaceAll("-$","");
    }

    //Aquesta funció determina si el numero actual es una unitat, desena, o centena
    private static String ordreIfs(int[] arDigits, long n) {
        String numero = "";

        //Primer de tot, si es menos que 10, va directe a la funció unitat.
        if (n < 10) {
            numero = unitat(arDigits);

            //Si son menys de 20, van a desenes de 10.
        } else if (n < 20) {
            numero = desenesDe10(arDigits);

            //Els altres dependràn del nombre de caractes que tengui el nombre, i pot ser necessitem més d'una funcio (exemple: 101, nesecita 100 i 1, una unitat i una centena)
        } else if (n < 99) {
            numero = desena(arDigits);

        } else if (n < 999) {
            numero = centena(arDigits);
        }
        return numero;
    }

    //Aquestes funcions s'activaran quan el caracter sigui una unitat, desena, centena, etc
    private static String unitat(int[] arDigits) {
        String numero = "";

        //Aquest switch sempre ha d'agafar com a variable l'ulim numero de l'array
        switch (arDigits[arDigits.length -1]) {

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
        switch (arDigits[arDigits.length -1]) {

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
        switch (arDigits[arDigits.length -2]) {
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
                numero = "fifthy";
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
        switch (arDigits[arDigits.length -3]) {
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
        System.out.println("!!!");
        System.out.println(numero);
        System.out.println("!!!!!");
        return numero;

    }


}
