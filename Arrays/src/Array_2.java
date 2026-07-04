import java.util.Scanner;
public class Array_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check whether it exists in Array: ");
        int number = sc.nextInt();
        int[] array = new int[4];
        array [0] = 431;
        array [1] = 465;
        array [2] = 876;
        array [3] = 987;
        // if((number == array[0]) || (number == array[1]) || (number == array[2]) || (number == array[3]))
        //     {
        //         System.out.println("number exists in array");
        //     }
        // else
        //     System.out.println("number doesn't exist in array");
        for(int element: array)
            {
                if(number == element)
                    {
                        System.out.println("number exists in array");
                        break;
                    }
                else
                    {
                        System.out.println("number doesn't exist in array");
                        break;
                    }
            }
        sc.close();
    }
}
