
public class Numbers {
    public static String say(long n) {
        int arN[] = new int[10];
        String unidad = prim(n);
        return unidad.substring(0, 1).toUpperCase() + unidad.substring(1);

    }

    //Aquesta funció agafa la primera unitat
    private static String prim(long n) {
        String unidad = "";
        switch ((int) n) {
            case 0:
                unidad = "zero";
                break;
            case 1:
                unidad = "one";
                break;
            case 2:
                unidad = "two";
                break;
            case 3:
                unidad = "three";
                break;
            case 4:
                unidad = "four";
                break;
            case 5:
                unidad = "five";
                break;
            case 6:
                unidad = "six";
                break;
            case 7:
                unidad = "seven";
                break;
            case 8:
                unidad = "eigth";
                break;
            case 9:
                unidad = "nine";
                break;
            case 10:
                unidad = "ten";
                break;
            case 11:
                unidad = "eleven";
                break;
            case 12:
                unidad = "twelve";
                break;
            case 13:
                unidad = "thirteen";
                break;
            case 14:
                unidad = "fourteen";
                break;
            case 15:
                unidad = "fifteen";
                break;
            case 16:
                unidad = "sixteen";
                break;
            case 17:
                unidad = "seventeen";
                break;
            case 18:
                unidad = "eighteen";
                break;
            case 19:
                unidad = "nineteen";
                break;
            default:
                unidad = "";
                break;
        }
        /*
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

             */
    return unidad;
    }

    public static long words(String s) {
        return 0;
    }
}
