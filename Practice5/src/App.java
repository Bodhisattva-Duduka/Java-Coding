import java.util.Scanner;
public class App {
    public static void main(String[] args) {
    System.out.println("Enter 4 digit Passcode ");
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    if(a==4346)
    {
        System.out.println("Correct, Welcome back ");
    }
    else
    {
        System.out.println("Wrong Passcode");
    }
    }
}
