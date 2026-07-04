import java.util.Scanner;
public class Maxnumber {
    public static void main(String[] args) {
        System.out.println("Enter three numbers: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt() , b = sc.nextInt() , c = sc.nextInt();
        if((a==b) && (b==c) && (a==c))
            {
                System.out.println("Enter three different numbers");
            }
        else if((a==b) && (a>c))
            {
                System.out.println(a + " is the greatest number");
            }
        else if((a==c) && (a>b))
            {
                System.out.println(a + " is the greatest number");
            }
        else if((b==a) && (b>c))
            {
                System.out.println(b + " is the greatest number");
            }
        else if((b==c) && (b>a))
            {
                System.out.println(b + " is the greatest number");
            }
        else if((c==a) && (c>b))
            {
                System.out.println(c + " is the greatest number");
            }
        else if((c==b) && (c>a))
            {
                System.out.println(c + " is the greatest number");
            }
        else if((a>b) && (a>c))
            {
                System.out.println(a + " is the greatest number");
            }
        else if((b>a) && (b>c))
            {
                System.out.println(b + " is the greatest number");
            }
        else if((c>a) && (c>b))
            {
                System.out.println(c + " is the greatest number");
            }
        sc.close();
    }
    }