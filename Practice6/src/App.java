import java.util.Scanner;
public class App {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your age ");
    int age = sc.nextInt();
    System.out.println("Enter your height ");
    double height = sc.nextDouble();
    boolean age1 = (age==18);
    boolean height2 = (height==5.4);
    if(age1 && height2)
    {
        System.out.println("Okay");
    }
    else
    {
        System.out.println("not okay");
    }

    }
}
