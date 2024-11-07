import java.util.Scanner;

public class Exercice_8 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) { // try-with-resources
            System.out.print("Entrez un nombre de départ : ");
            int nombre = scanner.nextInt();

            for (int i = 1; i <= 10; i++) {
                System.out.println(nombre + i);
            }
        }
    }
}
