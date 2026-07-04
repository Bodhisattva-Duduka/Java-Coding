import java.util.Scanner;
public class Question5 {
    public static void main(String[] args) {
        // int i = 5;
        // while(i!=0)
        //     {
        //         System.out.println(i);
        //     }
        // for(int i = 1; i != 0;)
        //     {
        //         System.out.println(i);
        //     }
        System.out.println("Enter a number to find it's factorial: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int p = 1;
        while(i<=n)
            {
                p = p*i;
                i++;
            }
        System.out.println(p);
        sc.close();
    }
}
