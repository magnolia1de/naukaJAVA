import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj kolor w formacie szesnastkowym (np. #FFA500): ");
        String hexColor = scanner.nextLine();

        if (hexColor.startsWith("#")) {
            hexColor = hexColor.substring(1);
        }

        if (hexColor.length() != 6) {
            System.out.println("Niepoprawny format koloru!");
            return;
        }

        String redHex = hexColor.substring(0, 2);
        String greenHex = hexColor.substring(2, 4);
        String blueHex = hexColor.substring(4, 6);

        int red = Integer.parseInt(redHex, 16);
        int green = Integer.parseInt(greenHex, 16);
        int blue = Integer.parseInt(blueHex, 16);

        System.out.println("Kolor RGB: (" + red + ", " + green + ", " + blue + ")");
    }
}