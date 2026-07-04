import java.util.Scanner;
public class Question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter your marks in first Subject: ");
            double firstsubject = sc.nextDouble();
            System.out.println("Enter your marks in second Subject: ");
            double secondsubject = sc.nextDouble();
            System.out.println("Enter your marks in third Subject: ");
            double thirdsubject = sc.nextDouble();
            double a = ((firstsubject + secondsubject + thirdsubject)/300)*100;
            System.out.println("This is your total Percentage: " + a);
            if(a>=40 && firstsubject>=33 && secondsubject>=33 && thirdsubject>=33)
                {
                    System.out.println("Congrats, You have passed the exam!");
                }
            else
            {
                System.out.println("You have failed the exam");
            }
        sc.close();
    }
}