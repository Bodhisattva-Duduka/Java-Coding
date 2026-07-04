public class Array_Question1 {
    public static void main(String args[])
    {
        int [] array = new int[5];
        array [0] = 12;
        array [1] = 53;
        array [2] = 23;
        array [3] = 75;
        array [4] = 64;
        int sum = 0;
        // int sum = array [0] + array [1] + array [2] + array [3] + array [4];
        for(int i = 0 ; i<=4; i++)
            {
                sum = sum + array[i];
            }
        System.out.println(sum);
    } 
}