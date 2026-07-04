public class Array_3 {
    public static void main(String[] args) {
        double[] PhysicsMarks = {53,45,76,74,24,63};
        double Marks = 0;
        for(double element: PhysicsMarks)
            {
                Marks = Marks + element;
            }
        double AverageMarks = (Marks/PhysicsMarks.length);
        System.out.println(AverageMarks + " is the Average marks in Physics");
    }
}