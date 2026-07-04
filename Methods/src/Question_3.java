public class Question_3 {
    static int sum_of_n_natural_numbers(int n)
        {
            if(n==1)
                {
                    return 1;
                }
            int result = 0;
            result = n + sum_of_n_natural_numbers(n-1);
            return result;
        }
    public static void main(String[] args) {
        int number = sum_of_n_natural_numbers(3);
        System.out.println(number);
    }
}
