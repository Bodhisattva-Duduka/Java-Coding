import java.util.Scanner;
public class Question2 {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        // int p = sc.nextInt();
        // int n = (p/2)+1;
        // int i = (n*n) - (n);
        // System.out.println(i);
        int n = sc.nextInt();
        int p = 0;
        for(int i = 0; i<=n; i++)
            {
                p = p + (2*i);
            }
        System.out.println(p);
        sc.close();
    }  
}