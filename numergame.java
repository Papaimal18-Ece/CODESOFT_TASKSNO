import java.util.Random;
import java.util.Scanner;
public class numergame {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        String playagain;
        do {
        int number = random.nextInt(100) + 1;
        int guess;
        int attempts = 0;
        int max_Attempts = 10;
        System.out.println(" ===== NUMBER GAME =====");
        System.out.println("Guess a number between 1 and 100(Max " + max_Attempts + " attempts) ");
        do {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;
            if (guess > number){
                System.out.println("Too High!");
            } else if (guess < number){
                System.out.println(" Too low");
            }else {
                System.out.println("Congratulations! you guess the number.");
                System.out.println( "Attempts: " + attempts);
            }
            if (attempts == max_Attempts){
                System.out.println("Game over ! You've used all attempts. ");
                System.out.println(" The correct number Was:" + number);
            }
        }while(guess != number);
        System.out.print("Do you want to play again? (yes/no): ");
        playagain = sc.next();
    } while(playagain.equalsIgnoreCase("yes"));

       sc.close();
    }   
}
