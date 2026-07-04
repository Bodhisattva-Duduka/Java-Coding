public class Practice {
    
    // lecture-1;

    // static int myMethod( int a ,int b)
    //     {
    //         int c = a + b;
    //         return c;
    //     }

    // int myMethod(int a , int b)
    //     {
    //         int c = a + b;
    //         return c;
    //     }

//     public static void main(String[] args) {
//         // Practice obj = new Practice();
//         int d = 40;
//         int f = 54;
//         int e = myMethod(d , f);
//         // int e = obj.myMethod(d , f);
//         System.out.println(e);
//     }
// }


// import java.util.Scanner;
// public class Practice_2 {

    // static method
    // non-static method

        // static method
        // static int add(int x , int y)
        //     {
        //         int z = x + y;
        //         return z;
        //     }
        
        // non-static method

//         double divide(double x , double y)
//             {
//                 double z = x/y;
//                 return z;
//             }        
//     public static void main(String[] args) {
//         Practice_2 obj = new Practice_2();
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter dividend : ");
//         double a = sc.nextInt();
//         System.out.println("Enter divisor : ");
//         double b = sc.nextDouble();
//         double c = obj.divide(a,b);
//         System.out.println("Quotient is: " + c);
//         sc.close();
//     }
// }

// -----------------------------------------------------------------------------------------------------------------------------------

// Lecture-2

// public class Practice_2 {

    //     void 
    //     static void show()
    //         {
    //             System.out.println("Good morning!");
    //         }
    
    //     method overloading
    //         static int calculate(int x , int y)
    //             {
    //                 int c = x + y;
    //                 return c ;
    //             }
    //         static int calculate(int x, int y, int z)
    //             {
    //                 int c = x+y+z;
    //                 return c;
    //             }
    //     public static void main(String[] args) {
    //         void
    //         show();
    
    //         method overloading
    //         int a = 49;
    //         int b = 65;
    //         int c = 54;
    //         int d ,e ;
    //         d = calculate(a, b);
    //         System.out.println(d);
    //         e = calculate(a, b, c);
    //         System.out.println(e);
    
    //     }
    // }

    // ---------------------------------------------------------------------------------------------------------------------------

    // lecture-3

    // public class Practice_2 {

    //     static int sum(int ...array)
    //         {
    //             // meaning is: int[] arr
    //             int result = 0;
    //             for(int element: array)
    //                 {
    //                     result += element;
    //                 }
    //             return result;
    //         }
    //     public static void main(String[] args) {
    //         int d = sum(2,4,5,43,65,68,89);
    //         System.out.println(d);
    //     }
    // }


    // public class Practice_2 {
    
        //         static String name(String ...array)
        //         {
        //             String result = "";
        //             for(String element: array)
        //                 {
        //                     result = result + " " + element;
        //                 }
        //             return result;
        //         }
        //     public static void main(String[] args) {
        //         String name_final = name("Hi" , "my", "name" , "is" , "bodhisattva").trim();
        //         System.out.println(name_final);
        //     }
        // }


    // -------------------------------------------------------------------------------------------------------------------------------

    // lecture-4

    // factorial
    // public class Practice_2 {
        //     static int factorial(int n)
        //         {
        //             int result = 1;
        //             if((n==1) || (n==0))
        //                 {
        //                     return 1;
        //                 }
        //             else
        //                 {
        //                     result = n * factorial(n-1);
        //                     return result;
        //                 }
        //         }
        //     public static void main(String[] args) {
        //     int number = factorial(4);
        //     System.out.println(number);
        //     }
        
        // }
}
    
    
