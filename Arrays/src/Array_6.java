public class Array_6 {
    public static void main(String[] args) {
        int[] array = {12,36,99,84};
        int max = 0;
        int j = 0;
        for(int i = 0; i<array.length; i++)
            {
                if(array[i] > max)
                    {
                        max = array[i];
                    }
                    j=i;
                }
            System.out.println("max value of element in array is: " + max + " with array no. " + j);
    }
}
