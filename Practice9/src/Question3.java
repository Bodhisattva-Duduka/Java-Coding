import java.util.Scanner;
public class Question3 {
    public static void main(String[] args) {
        // System.out.println("Enter a number to get it's multiplication table : ");
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // Multiplication in order
        // for(int i =1; i<=10; i++)
        //     {
        //         System.out.println(n + "x" + i + "=" + (n*i));
        //     }
        // Multiplication in reverse order
        System.out.println("Enter a number to get it's multiplication table in reverse order : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 10; i>=1; i--)
            {
                System.out.println(n + "x" + i + "=" + (n*i));
            }
        sc.close();
    }
}
