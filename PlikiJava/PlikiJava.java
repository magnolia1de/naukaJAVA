package PlikiJava;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class PlikiJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nazwę pliku jaki chcesz znaleźć (razem z rozszerzeniem)");
        String name = scanner.nextLine();
        File file = new File(name);
        if (file.exists()) {
            Date nowDate = new Date();
            long modyfikacja = file.lastModified();
            Date lastModifiedDate = new Date(modyfikacja);
            System.out.println(lastModifiedDate);

            zmianaFormatu(nowDate);

            //boolean isHidden()
            sprawdzCzyPlikUKryty(file);

            //czytanie pliku
            FileReader fileReader = czytaniePliku(name);
            String linia;

            czytaniePlikuIWypisywanie(fileReader);
        } else {
            System.out.println("File does not exist");
        }
    }

    private static void zmianaFormatu(Date nowDate) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
        System.out.println(formatter.format(nowDate));
    }

    private static void czytaniePlikuIWypisywanie(FileReader fileReader) {
        String linia;
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        try {
            while ((linia = bufferedReader.readLine()) != null) {
                System.out.println(linia);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static FileReader czytaniePliku(String name) {
        FileReader fileReader = null;
        String linia = "";
        try {
            fileReader = new FileReader(name);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return fileReader;
    }

    private static void sprawdzCzyPlikUKryty(File file) {
        boolean ukryty = file.isHidden();
        if (ukryty) {
            System.out.println("plik jest ukryty");
        } else {
            System.out.println("plik nie jest ukryty");
        }
    }
}