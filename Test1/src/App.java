import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 5 digit number: ");
        String number = sc.next();
        char a = number.charAt(4);
        char b = number.charAt(3);
        char c = number.charAt(2);
        char d = number.charAt(1);
        char e = number.charAt(0);
        System.out.printf("%c%c%c%c%c", a , b ,c ,d , e);
        sc.close();
    }
}
