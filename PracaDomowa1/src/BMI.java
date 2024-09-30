import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
//        Napisz program, który wczytuje Twoją masę (podaną w kg) i wzrost
//        (podany w cm) i na tej podstawie wylicza i wypisuje BMI. Wzór na BMI
//        znajdziesz ww Internecie. Jeśli wyliczona wartość jest mniejsza niż
//        18.5, program powinien wypisać komunikat: jestes za chudy. Jeśli
//        wyliczona wartość jest większa niż 25, program powinien wypisać
//        komunikat jestes za gruby.

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Ile ważysz w kg?");
        int waga = scanner.nextInt();
        System.out.printf("Ile masz wzrostu w cm?");
        int wzrost = scanner.nextInt();

        float naMetry = wzrost / 100;
//        System.out.println("na metry: " + naMetry);
        float wynikWzrostu = naMetry * naMetry;
//        System.out.println("wzrost w m " + wynikWzrostu);

        float bmi = waga / wynikWzrostu;
        if (bmi <= 18.5) {
            System.out.println("Jesteś za chudy");
        } else if (bmi <= 25) {
            System.out.println("Jesteś za gruby");
        } else if (bmi >= 18.5 && bmi <= 25) {
            System.out.println("Twoje BMI jest okej!");
        }
//        System.out.println("BMI:" + bmi);
    }
}
