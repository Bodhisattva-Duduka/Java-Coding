public class Question_8 {
    static void Pattern_4(int n)
        {
            if(n==0)
                {
                    return;
                }
            else
                {
                    for(int i = n; i<=n; i--)
                        {
                            System.out.print("*");
                        }
                }
                System.out.println();
                Pattern_4(n-1);
        }
        public static void main(String[] args) {
            Pattern_4(8);
        }
}