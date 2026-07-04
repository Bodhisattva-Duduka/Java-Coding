import java.util.Scanner;
public class Question4 {
    public static void main(String[] args) {
        System.out.println("Enter year, To check whether it is a leap year: ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
/*                if((year%4==0 && year%100!=0) || (year%200==0))
            {
                System.out.println(year + " is a leap year!");
            }
        else
            {
                System.out.println(year + " is not a leap year!");
            }
*/        
        if(year%200==0)
            {
                System.out.println(year + " is a leap year!");
            }
        else if(year%100!=0)
            {
                if(year%4==0)
                    {
                        System.out.println(year + " is a leap year!");
                    }
                else
                    {
                        System.out.println(year + " is not a leap year!");
                    }
            }
        else
            {
                System.out.println(year + " is not a leap year!");
            }
        sc.close();
    }  
}