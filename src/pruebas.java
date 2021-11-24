import java.util.Scanner;

public class pruebas {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int arN[] = new int[10];
        System.out.println("Insereix un numero");
        arN[0] = s.nextInt();
        int a = arN[0];
        //Cream la variable unidad, que ens permetrà trobar el primer nombre de l'array
        String unidad = "";

        //Segons quin sigui el nombre de l'array, "unidad" tindrà un valor o un altre
        switch (a) {
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
            default:
                unidad = "";

        }
        System.out.println(unidad);
    }
}
