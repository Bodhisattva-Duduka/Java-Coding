import java.util.Scanner;
public class App {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number ");
    int a = sc.nextInt();
    System.out.println("Enter a number ");
    int b = sc.nextInt();
    if(a==4 || b==6){
        System.out.println("Fine");
    }
    else{
        System.out.println("Okay");
    }
    }
}
