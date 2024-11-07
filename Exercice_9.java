
import java.util.Scanner;

public class Exercice_9 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) { // try-with-resources
            System.out.print("Entrez un nombre pour afficher sa table de multiplication : ");
            int nombre = scanner.nextInt();

            System.out.println("Table de " + nombre + " :");
            for (int i = 1; i <= 10; i++) {
                System.out.println(nombre + " x " + i + " = " + (nombre * i));
            }
        }
    }
}

