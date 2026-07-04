import java.util.Scanner;
class Quadratic_Equation {
    public static void main(String[] args) {
        System.out.println(" This is General Quadratic Equation (ax^2 + bx + c)");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a :");
        double a = sc.nextDouble();
        if(a==0)
            {
                System.out.println("value of a is 0, which makes the equation a linear");
            }
        else
            {
                System.out.println("Enter value of b :");
                double b = sc.nextDouble();
                System.out.println("Enter value of c :");
                double c = sc.nextDouble();
                double d = ((b*b) - (4*a*c));
                if(d>=0)
                    {
                        double f = Math.sqrt(d);
                        double g = ((-b) + f)/(2*a);
                        double h = ((-b) - f)/(2*a);
                        System.out.println(g); 
                        System.out.println(h);
                        System.out.println("The roots are: " + g + " and " + h );
                    }
                else
                    {
                        System.out.println("Real roots doesn't exist for this Quadratic equation");
                    }
            }
       sc.close();
    }
}