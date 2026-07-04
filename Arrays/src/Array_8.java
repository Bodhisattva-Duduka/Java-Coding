public class Array_8 {
    public static void main(String[] args) {
        int[] array = {76,4,4,3,0};
        int a = 1;
        int b = 1;
        int k = 1;
        for(int i = 1; i<array.length; i++)
            { 
                if(array[i-1]<=array[i])
                    {
                        if((i==array.length-1) && (a==i))
                            {
                                System.out.println("It's a sorted array");
                                k = 2;
                            }
                        a = a + 1 ;
                    }
            }
        for(int j = 1; j<array.length; j++ )
            {
                if(array[j-1]>=array[j])
                    {
                        if((j==array.length-1) && (b==j))
                            {
                                System.out.println("It's a sorted array");
                                k = 2;
                            }
                        b = b + 1;
                    }
            }
        if(k==1)
            {
                System.out.println("It's not a sorted array");
            }
    }
}
