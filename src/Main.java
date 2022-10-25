import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Podaj swoje imię: ");
        String firstName = sc.nextLine();

        System.out.print("Podaj swoje nazwisko: ");
        String lastName = sc.nextLine();

        System.out.print("Podaj swój wiek: ");
        int age = sc.nextInt();

        if (age < 18) {
            System.out.println("Jesteś niepełnoletni, wypad!");
        }
        else {
            System.out.println("Możesz wejść. ");
        }
    }
}
