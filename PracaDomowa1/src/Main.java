public class Main {
    public static void main(String[] args) {
        int liczba = 1;
        for (int j = 0; liczba <= 10; j++) {
            System.out.println("Mnożenie liczby " + liczba);
            for (int i = 1; i <= 10; i++) {
                int wynik = liczba * i;
                System.out.println(liczba + " * " + i + " = " + wynik);
            }
            liczba++;
        }
    }
}