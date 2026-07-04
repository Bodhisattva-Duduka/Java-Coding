public class Question_2 {
    // star pattern
    void pattern(int n)
        {
            for(int i = 1; i<=n; i++)
                {
                    for(int j = 1; j<=i; j++)
                        {
                            System.out.print("*");
                        }
                    System.out.println();
                }
        }
        public static void main(String[] args) {
            Question_2 obj = new Question_2();
            obj.pattern(4);
        }
}
