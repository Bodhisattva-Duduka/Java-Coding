public class Question_10 {
    static void sum_of_n_natural_numbers_2(int n)
        {
            int j = 0;
            for(int i = 0; i<=n; i++)
                {
                    j += i;
                }
            System.out.println(j);
        }
        public static void main(String[] args) {
            sum_of_n_natural_numbers_2(4);
        }
}
