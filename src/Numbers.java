import java.util.Arrays;

public class Numbers {
    public static String say(long n) {
        //Primer, pasarem el nombre "n" a un array format per tots els seus digits ordenats
        //Basicament convertim l'int a string, després agafam l'equivalent a la taula ASCII, i el tornam a convertir.
        int[] arDigits = Integer.toString((int) n).chars().map(c -> c - '0').toArray();

        //Ara cream la funció bucle amb n i el seu array
        String resultat = bucle(arDigits, n);

        //Retornam el resultat, però la primera lletra en majuscules.
        return resultat.toUpperCase().substring(0, 1) + resultat.substring(1);
    }

    //La funció bucle, s'en carga de cridar a la funció ordreIfs tantes vegades sigui necessari per completar el número indicat
    private static String bucle(int[] arDigits, long n) {
        String numeroActual = "";
        String numeroDefinitiu = "";

        //Si el nombre es 0 o menor a 20, ens saltam el bucle
        if (n < 1) numeroDefinitiu = "zero";
        else if (n < 20) {

            //El bucle d'abaix li dona la variant "i" a "ordreIfs" perquè trobi els "0" innecessaris, per això li hem de donar una "i" fixa.
            int i = 0;
            numeroDefinitiu = ordreIfs(arDigits, n, i);

        } else
            for (int i = 0; i < arDigits.length; i++) {

                //Agafam el primer nombre de l'array (si no l'hem agafat ja)
                numeroActual = ordreIfs(arDigits, n, i);

                //Afegir guinet si es un decimal major a 19
                if (n < 100 && n > 19 && numeroActual != "") {
                    numeroActual = numeroActual + "-";

                    //Afegir "and" sempre que després d'una centena o millar hi hagi una unitat sense decimal.
                } else if (n > 100 && n % 10 != 0) {
                    numeroActual = numeroActual + " and ";
                }

                //Anirem afegint els números actuals al número definitiu per cada passada del bucle
                numeroDefinitiu = numeroDefinitiu + numeroActual;

                //Perquè el bucle vagi agafant de més gran a més petit,
                //convertim n a String per eliminar el seu primer caràcter i tonar-lo a long, fins que en quedi només un.
                if (n > 9) {
                    String str = Long.toString(n);
                    str = str.substring(1);
                    n = Long.valueOf(str);
                }
            }
        //Al final del bucle, es retorna el número definitiu. Si queda un guionet sobrant, s'elimina.
        return numeroDefinitiu.replaceAll("-$", "");
    }


    //Aquesta funció decideix a quina de les pròximes funcions anirà el programa, dependent de la longitud del nombre n
    private static String ordreIfs(int[] arDigits, long n, int i) {
        String numero = "";

        //A principi del bucle es revisara que el digit seguent no sigui 0, en tal cas, no volem que es nomeni.
        if (arDigits[i] == 0) {
            return numero;

            //Si és menor de 10, va directe a la funció unitat.
        } else if (n < 10) {
            numero = unitat(arDigits);

            //Si són menors de 20, van a desenes de 10.
        } else if (n < 20) {
            numero = desenesDe10(arDigits);

            //Menors de 100, van a desena
        } else if (n < 100) {
            numero = desena(arDigits);

            //Menors de 1000, a centena.
        } else if (n < 1000) {
            numero = centena(arDigits);
        }

        return numero;
    }

    //Aquestes funcions s'activaran quan el caràcter sigui una unitat, desena, centena, etc
    private static String unitat(int[] arDigits) {
        String numero = "";

        //Aquest switch sempre ha d'agafar com a variable l'ulim numero de l'array
        switch (arDigits[arDigits.length - 1]) {

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
        if (arDigits.length < 3)
            switch (arDigits[arDigits.length - 1]) {

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
        switch (arDigits[arDigits.length - 2]) {
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
        switch (arDigits[arDigits.length - 3]) {
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
                numero = "four hundred";
                break;
            case 5:
                numero = "five hundred";
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