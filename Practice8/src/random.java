import java.util.Scanner;
import java.util.Random;
public class random {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i = 1; i != 0;)
            {
        System.out.println("Enter 1 to choose rock ");
        System.out.println("Enter 2 to choose paper ");
        System.out.println("Enter 3 to choose scissors");
        System.out.println("Enter here: ");
        int game = sc.nextInt();
        Random rnd = new Random();
        int randomnumber = rnd.nextInt(100);
//      rock = "1" , paper = "2" , scissors = "3";
        if((game != 1) || (game != 2) || (game !=3))
            {
                System.out.println("Choose a valid number");
            }
//      0<=rock<=33      (randomnumber>=0 && randomnumber<=33)
//      33<paper<=66     (randomnumber>33 && randomnumber<=66)
//      66<scissors<=100 (randomnumber>66 && randomnumber<=100)
            if(game==1 && (randomnumber>=0 && randomnumber<=33))
                {
                    System.out.println("Rock, It's a tie, try again");
                }
            else if(game==1 && (randomnumber>33 && randomnumber<=66))
                {
                    System.out.println("Paper, You lose!");
                }
            else if(game==1 && (randomnumber>66 && randomnumber<=100))
                {
                    System.out.println("Scissors,  You win!");
                }
            if(game==2 && (randomnumber>=0 && randomnumber<=33))
                {
                    System.out.println("Rock, You win!");
                }
            else if(game==2 && (randomnumber>33 && randomnumber<=66))
                {
                    System.out.println("Paper, It's a tie, try again");   
                }
            else if(game==2 && (randomnumber>66 && randomnumber<=100))
                {
                    System.out.println("Scissors, You lose!");
                }
            if(game==3 && (randomnumber>=0 && randomnumber<=33))
                {
                    System.out.println("Rock, You lose!");
                }
            else if(game==3 && (randomnumber>33 && randomnumber<=66))
                {
                    System.out.println("Paper, You Win!");
                }
            else if(game==3 && (randomnumber>66 && randomnumber<=100))
                {
                    System.out.println("Scissors, Its a tie, try again");
                }
                System.out.println();
            }
            sc.close();
        }
}