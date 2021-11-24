
public class Numbers {
    public static String say(long n) {
        //Primer, pasarem el nombre "n" a un array format per tots els seus arDigits
        String number = String.valueOf(n);
        char[] arDigits = number.toCharArray();

        //Ara voldrem trobar els ultims valors de l'array, per poder aplicar les funcions
        for (int i = 1; i < arDigits.length; i++) {
            int a = arDigits[arDigits.length - i];
        }


        //Aquesta funció, activarà la funció que pertoqui, depenguent del nombre
        String resultat = ordreIfs(arDigits, n);
        return resultat.substring(0, 1).toUpperCase() + resultat.substring(1);
    }

    //Aquesta funció decideix a quina de les proximes funcions anirá el programa, depengent de la longitut del nombre n
    private static String ordreIfs(char[] arDigits, long n) {
        String numero = "";
        //Primer de tot, si es menos que 20, va directe a la funció unitat.
        if (n < 20) {
            numero = unitat(n);
            //Els altres dependràn del nombre de caractes que tengui el nombre, i pot ser necessitem més d'una funció (exemple: 101, nesecita 100 i 1, una unitat i una centena)
        } else if (arDigits.length < 3) {
            numero = desena(n);
            /*if (arDigits[1] != 0){
                numero = unitat(n);
            }*/
        } else if (arDigits.length < 4) {
            numero = centena(arDigits);
            if (arDigits[1] != 0){
                numero = desena(n);
            }
        }
        return numero;
    }


    //Aquestes funcions, s'activaran quan el caracter sigui una unitat, desena, centena, etc
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

    private static String desena(long n) {
        String numero = "";
        switch ((int) n) {
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

    private static String centena(char[] arDigits) {
        String numero = "";
        switch (arDigits[3]) {
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