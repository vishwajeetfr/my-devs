import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void main(String[] args)
    {

        Scanner in = new Scanner(System.in);
        int lives = 5;
        WordGame g1 = new WordGame();
        while(lives!=0) {
            System.out.println("Lives : " + lives);
            System.out.println("Enter 1 to guess the word");
            System.out.println("Enter 0 for a letter hint");
            int option = in.nextInt();
            in.nextLine();
            switch(option)
            {
                case 1:
                    System.out.println("Enter your Guess");
                    String guess = in.nextLine();
                    g1.guess(guess);
                    if(g1.guessed==1)
                    {
                        System.out.println("You guessed it!!");
                        lives = 1;
                    }
                    break;
                case 0:
                    System.out.println("Enter a letter");
                    char c1 = in.next().charAt(0);
                    g1.iterate(c1);
                    break;
                default:
                    System.out.println("Invalid input");
            };
            lives--;
        }
        if(g1.guessed==0){
            System.out.println("Better luck next time!!");
        }
    }
}