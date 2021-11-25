import java.util.Arrays;
import java.util.Scanner;

public class pruebas {
    public static void main(String[] args) {

        int n = 10024;
        //Primer, pasarem el nombre "n" a un array format per tots els seus digits ordenats

        int[] arDigits = Integer.toString(n).chars().map(c -> c-'0').toArray();

        System.out.println(arDigits[4]);

/*
        String number = String.valueOf(n);
        int[] arDigits = Integer.parseInt(number);
        System.out.println(arDigits[0]);

        //Ara cream un array per posteriorment posar-li els nombres en format de paruales
        String[] arParaules = new String[number.length()];

        //Ara voldrem trobar els ultims valors de l'array, per poder aplicar les funcions
        for (int i = 1; i < arDigits.length; i++) {
            int last = arDigits[arDigits.length - i];
        }

        //la funció ordreIfs ens tornarà cada vegada el nom del nombre que pertoqui
        for (int i = 0; i < arDigits.length; i++) {
            String numeroActual = ordreIfs(arDigits, n);
            arParaules[i] = numeroActual;
            System.out.println(numeroActual);
        }

        //Retornam el resultat, però la primera lletra en majuscules
        String resultat = Arrays.toString(arParaules);
        System.out.println(resultat.substring(0, 1).toUpperCase() + resultat.substring(1));
    }

    //Aquesta funció decideix a quina de les proximes funcions anirá el programa, depengent de la longitut del nombre n
    private static String ordreIfs(char[] arDigits, long n) {
        String numero = "";

        //Primer de tot, si es menos que 20, va directe a la funció unitat.
        if (n < 20) {
            numero = unitat(arDigits);

            //Els altres dependràn del nombre de caractes que tengui el nombre, i pot ser necessitem més d'una funció (exemple: 101, nesecita 100 i 1, una unitat i una centena)


        }
        return numero;
        //Aquestes funcions, s'activaran quan el caracter sigui una unitat, desena, centena, etc
    }

    private static String unitat(char [] arDigits) {
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

        }
        System.out.println(numero);
        return numero;
   */ }
}
