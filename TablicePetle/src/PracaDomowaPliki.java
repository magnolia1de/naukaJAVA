package TablicePetle.src;

public class PracaDomowaPliki {
    public static void main(String[] args) {

        int[] liczby = {2, 7, 9, 8};

       // System.out.println(liczby[2]);

       // System.out.println(liczby.length);

       int[] tablica = new int[10];

       int[][] tablica2= {{2, 4, 9}, {4, 8, 6}} ;

        System.out.println(tablica2[0][0]);
        System.out.println(tablica2[1][1]);
        System.out.println(tablica2[1][0]);

        for (int i = 0; i < liczby.length; i++) {
//            System.out.print(liczby[i] + " ");
        }
//        System.out.print("---------------------------------");

        tablica[0] =5;

        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = i;
//            System.out.print(tablica[i] + " ");
        }

//        System.out.println(tablica[10]);
    }
}