public class Question_7 {
    static void Pattern_3(int n)
        {
            if(n==0)
                {
                    return ;
                }
            else 
                {
                    for(int i = 0; i<n; i++)
                        {
                            System.out.print("*");
                        }
                    System.out.println();
                        Pattern_3(n-1);
                }
        }
        public static void main(String[] args) {
            Pattern_3(16);
        }
}
