import java.util.Scanner;
public class Question5 {
    public static void main(String[] args) {
        System.out.println("Enter website name: ");
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        boolean b = a.endsWith("com");
        boolean c = a.endsWith("org");
        boolean d = a.endsWith("in");
        if(b==true)
            {
                System.out.println("It is a Commerical website");
            }
        else if(c==true)
            {
                System.out.println("It is a organisation website");
            }
        else if(d==true)
            {
                System.out.println("It is a Indian website");
            }
        else
            {
                System.out.println("Enter a valid website");
            }
        sc.close();
    }
}