public class Question_9 {
    double convert(double n)
        {
            double x = (n*(9.0/5.0))+32;
            return x;
        }
    public static void main(String[] args) {
    Question_9 obj = new Question_9();
        System.out.println(obj.convert(5));
    }
}
