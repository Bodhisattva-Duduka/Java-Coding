import java.util.Scanner;
public class Oddnumbers_breakandcontinue {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = -1; i<=n; i +=2)
            {
                if(i==7)
                    {
                        System.out.println("Cool!...");
                        continue;
                    }
                int p = i + 2;
                System.out.println(p);
                // if(i==5)
                //     {
                //         System.out.println("breaking the loop");
                //         break;
                //     }
            }
        sc.close();
        }
    }
