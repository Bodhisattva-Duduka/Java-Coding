import java.util.Scanner;
public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your yearly salary(in Lakhs) here: ");
        double salary = sc.nextDouble();
        System.out.println("Your salary is : " + salary + "lakhs");
        if(salary<=2.5)
            {
               System.out.println("You won't be paying any tax");
            }
        else if(salary>2.5 && salary<=5)
            {
                double tax1 = (salary - 2.5)*(5.0/100.0);
                System.out.println("you need to pay tax of " + tax1 + " lakhs");
            }
        else if(salary>5 && salary<=10)
            {
                double tax2 = (salary - 5.0)*(20.0/100.0);
                System.out.println("you need to pay tax of " + tax2 + " lakhs");
            }
        else
            {
                double tax3 = (salary - 10.0)*(30.0/100.0);
                System.out.println("you need to pay tax of " + tax3 + " lakhs");
            }
        sc.close();
    }
}