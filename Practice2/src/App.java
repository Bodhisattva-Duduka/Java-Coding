import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        System.out.println("Enter few sentences ");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = a.replace(" " , "_");
        System.out.println(b);

    }
}
