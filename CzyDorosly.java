import java.util.Scanner;

public class CzyDorosly {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swój wiek");
        int wiek = scanner.nextInt();
        boolean result = czyDorosly(wiek);

        if (result) {
            System.out.println("Jestem dorosły");
        } else {
            System.out.println("Muszę dorosnąć");
        }

        System.out.println(czyParzysta(8));
    }
    //fukncja jako argument podany wiek int
    //typ zwracany logiczny, jak dorosły to true, jak nie to false

    public static boolean  czyDorosly(int age) {
        return age >=18;
    }

    //temperatura czyCieplo
    public static boolean czyCieplo(int teperatura) {
        return teperatura >= 20;
    }

    //funkcja logiczna, sprawdza czy liczba jest parzysta
    public  static  boolean czyParzysta(int number) {
        return (number % 2 == 0);
    }
}
