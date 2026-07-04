public class Question_1 {
    // multiplication table of number n
    static void generate(int n)
        {
            for(int i = 1; i<=10; i++)
                {
                    System.out.println(i + " x " + n + " = " + i*n);
                }
        }
        public static void main(String[] args) {
    generate(12);
        }
}
