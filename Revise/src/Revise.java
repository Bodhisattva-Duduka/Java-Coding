import java.util.Scanner;
public class Revise {
    public static void main(String[] args) {
        // Revision of String & String methods 
        // String name = "bodhisattva";
        // String name1 = name.toUpperCase();
        // String name2 = name.toLowerCase();
        // String name3 = name.trim();
        // String name4 = name.substring(3,6);
        // String name5 = name.replace('d' , 'i');
        // boolean name6 = name.startsWith("Bodhi");
        // char name7 = name.charAt(4);
        // boolean name8 = name.toUpperCase().equals("BODHISATTVA");
        // Escape sequence characters \t ,\n ,\' \"
        // System.out.println("Hi, My name is \'Bodhisattva\' ");
       

// ------------------------------------------------------------------------------------------------------------------------------------

        // Revision of if-else conditionls statements
        // 1. Income tax calculator
            // 2.5L - 5.0L   5% tax
            // 5.0L - 10.0L   20% tax
            // above 10.0L    30% tax
            // Scanner sc = new Scanner(System.in);
            // System.out.println("Enter your salary (in Lakhs): ");
            // double salary = sc.nextDouble();
            // double range1 = (5.0/100.0)*(salary-2.5);
            // double range2 = (((5.0/100.0)*2.5) + (20.0/100.0)*(salary-5.0));
            // double range3 = (((5.0/100.0)*2.5) + ((20.0/100.0)*5.0) + ((30.0/100.0)*(salary-10.0)));
            // if(salary<=2.5)
            //     {
            //         System.out.println("You don't have to pay any tax");
            //     }
            // else if((salary>2.5) && (salary<=5.0))
            //     {
            //         System.out.println("Tax you have to pay is " + range1);
            //     }
            // else if((salary>5.0) && (salary<=10.0))
            //     {
            //         System.out.println("Tax you have to pay is " + range2);
            //     }
            // else if((salary>10.0))
            //     {
            //         System.out.println("Tax you have to pay is " + range3);
            //     }
            // else
            //     {
            //         System.out.println("Enter correct input");
            //     }
            // sc.close();

        //  Week no. to week name

            // Scanner sc = new Scanner(System.in);
            // System.out.println("Enter week no. to week name: ");
            // int week_no = sc.nextInt();
            // if(week_no == 1)
            //     {
            //         System.out.println("Monday");
            //     }
            // else if(week_no == 2)
            //     {
            //         System.out.println("Tuesday");
            //     }
            // else if(week_no == 3)
            //     {
            //         System.out.println("Wednesday");
            //     }
            // else if(week_no == 4)
            //     {
            //         System.out.println("Thursday");
            //     }
            // else if(week_no == 5)
            //     {
            //         System.out.println("Friday");
            //     }
            // else if(week_no == 6)
            //     {
            //         System.out.println("Saturday");
            //     }
            // else if(week_no == 7)
            //     {
            //         System.out.println("Sunday");
            //     }
            // else if(week_no>7)
            //     {
            //         System.out.println("Enter a no. between 1 to 7");
            //     }
            // sc.close();

        // Leap year 

            // Scanner sc = new Scanner(System.in);
            // System.out.println("Enter a number to know whether it is a leap year: ");
            // int year = sc.nextInt();
            // if((year%100 != 0 && year%4 == 0) || (year%200 == 0))
            //     {
            //         System.out.println(year + " is a leap year!");
            //     }
            // else
            //     {
            //         System.out.println(year + " is not a leap year!");
            //     }
            // sc.close();

        // Type of website by the url

            // Scanner sc = new Scanner(System.in);
            // System.out.println("Enter name of website to know about it ");
            // String website = sc.next();
            // boolean com = website.endsWith("com");
            // boolean org = website.endsWith("org");
            // boolean in = website.endsWith("in");
            // if(com == true)
            //     {
            //         System.out.println("It's a Commercial website");
            //     }
            // else if(org == true)
            //     {
            //         System.out.println("It's a Organization website");
            //     }
            // else if(in == true)
            //     {
            //         System.out.println("It's a Indian website");
            //     }
            // sc.close();

//------------------------------------------------------------------------------------------------------------------------------------------

        // Revision of Loops

            // while loop
                // int i = 1;
                // while(i<=100)
                //     {
                //         System.out.println(i);
                //         i++;
                //     }

            // do-while loop
                // int i = 1;
                // do
                //     {
                //         System.out.println(i);
                //         i++;
                //     }
                // while(i<=100);
            // for loop
                // for(int i = 1; i<=100; i++)
                //     {
                //         System.out.println(i);
                //     }

            // printing odd numbers using for loop
                // for(int i = 1; i<=100; i=i+2)
                //     {
                //         System.out.println(i);
                //     }
            // break and continue
                // for(int i = 1; i<=100; i=i+2)
                //     {
                //         if(i==99)
                //             {
                //                 break;
                //             }
                //         if(i==95)
                //             {
                //                 continue;
                //             }
                //         System.out.println(i);
                //     }

            // Printing star pattern

                // for(int i = 5; i>=0; i--)
                //     {
                //         for(int j = 1; j<=i; j++)
                //             {
                //                 System.out.print("*");
                //             }
                //         System.out.println();
                //     }
            
            // sum of first n even numbers

                // int i = 0;
                // int j = 0;
                // while(i<100)
                //     {
                //         i = i + 2;
                //         j = j + i;
                //     }
                // System.out.println(j);

            // multiplication table of given number

                // Scanner sc = new Scanner(System.in);
                // System.out.println("enter a number to get multiplication table");
                // int n = sc.nextInt();
                // for(int i = 1; i <= 10; i++)
                //     {
                //         System.out.println(n + " x " + i + " = " + i*n);
                //     }

            // multiplication table of given number in reverse order

                // Scanner sc = new Scanner(System.in);
                // System.out.println("enter a number to get multiplication table");
                // int n = sc.nextInt();
                // for(int i = 10; i >= 0; i--)
                //     {
                //         System.out.println(n + " x " + i + " = " + i*n);
                //     }

            // finding factorial using for loop
            
                // Scanner sc = new Scanner(System.in);
                // System.out.println("enter a number to find it's factorial: ");
                // int n = sc.nextInt();
                // int j = 1;
                // for(int i = 1; i<=n; i++)
                //     {
                //         j = j*i;
                //     }
                // System.out.println(j);
                // sc.close();
                
            // finding factorial using while loop

                // Scanner sc = new Scanner(System.in);
                // System.out.println("enter a number to get it's factorial");
                // int n = sc.nextInt();
                // int i = 1;
                // int j = 1;
                // while(i<=n)
                //     {
                //         j = i*j;
                //         i++;
                //     }
                // System.out.println(j);
                // sc.close();

            // sum of numbers occuring in multiplication table of 8

                // int n = 8;
                // int j = 0;
                // for(int i = 1; i<=10; i++)
                //     {
                //         j =  j + (i*n);
                //     }
                // System.out.println(j);

//------------------------------------------------------------------------------------------------------------------------------------------

        
    }       
}
