import java.util.Scanner;

public class Exercice_7 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) { // try-with-resources
            System.out.print("Entrez un nombre de départ : ");
            int nombre = scanner.nextInt();
            int compteur = 1;

            while (compteur <= 10) {
                nombre++;
                System.out.println(nombre);
                compteur++;
            }
        }
    }
}
