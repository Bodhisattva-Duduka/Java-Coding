public class Array_7 {
    public static void main(String args[]) {
        int[] array = {61,48,21,95,546,84,861,286,4,51,68465165,8496};
        int min = array[0];
        int j = 0;
        for(int i = 1; i<array.length; i++)
            {
                if(array[i]<min) 
                    {
                        min = array[i];
                    }
                j=i;
            }
        System.out.println("min value of element in array is: " + min + " with element no. : " + j);
    }
}