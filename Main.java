//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        wypiszSume(2,3);
        wypiszSume(2, 3, 4);
        System.out.println(wypiszSume2(3,8));
        mnozeniePrzezDwa(2);
        System.out.println(mnozeniePrzezDwa2(10));
    }

    public static void wypiszSume(int a, int b) {
        System.out.println(a + b);
    }

    public static void wypiszSume(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public static int wypiszSume2(int a, int b) {
        return a+b;
    }

    public static void mnozeniePrzezDwa(int a) {
        System.out.println(a*2);
    }

    public static int mnozeniePrzezDwa2(int a) {
        return a*2;
    }

    //fukncja jako argument podany wiek int
    //typ zwracany logiczny, jak dorosły to true, jak nie to false

}