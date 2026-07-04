import java.util.Scanner;
public class Question4 {
    public static void main(String[] args) {
        System.out.println("Enter a number get it's factorial: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = 1;
        for(int i = 1; i<=n; i++)
            {
                p = p*i;
            }
        System.out.println(p);
        sc.close();
    }
    
}
