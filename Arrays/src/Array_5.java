public class Array_5 {
    public static void main(String args[]) {
        int[] array ={64,4,6,85,35,8,94,54};
        int[] reversed_array={0,0,0,0,0,0,0,0};
        int j = 0;
        for(int i = array.length -1; i>=0; i--)
            {
                reversed_array[j] = array[i];
                j = j + 1;
                if(j==reversed_array.length)
                    {
                        break;
                    }    
            }
        for(int i:reversed_array)
            {
                System.out.print(i +" ");
            }
    }
}