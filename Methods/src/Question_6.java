public class Question_6 {
    static double average(double ...array)
        {
            double sum = 0;
            double sum2 = 0;
            for (double element : array) {
                sum = sum + element;
                sum2 = sum;
            }
            return sum2/array.length;
        }
    public static void main(String[] args) {
        System.out.println("The average is: " + average(2,45,6,78,9,5,88,8));
    }
}
