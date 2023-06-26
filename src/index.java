import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        System.out.println("cual es tu nombre?");
        Scanner sc = new Scanner(System.in);

        String nombre = sc.nextLine();

        System.out.println("Tu nombre es: " + nombre);
    }

}