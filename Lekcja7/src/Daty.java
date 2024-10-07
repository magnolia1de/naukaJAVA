import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Daty {
    public static void main(String[] args) throws ParseException {
        //skanner, podanie daty, przypisanie do daty
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dzisiejszą datę w formacie rrrr-mm-dd: ");
        String data = scanner.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(data.toString());
        System.out.println("Mamy taką datę: ");
        System.out.println(date);
    }
}
