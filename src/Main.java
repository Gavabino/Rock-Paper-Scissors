import java.util.Scanner;
public class Main {
    public static void game() {
        boolean gameover = false;
        while (!gameover) {

            //Create objects
            Scanner scan = new Scanner(System.in);

            //Get user input
            System.out.println("Enter your move");
            String input = scan.next();

            //Return player and computer moves
            System.out.println("You chose: " + Game.intToText(Game.textToInt(input)));
            System.out.println("The computer chose: " + Game.intToText(Game.computer()));

            //Return winner
            System.out.println(Logic.getWinner());

            System.out.println("Would you like to play again? y/n:");
            String x = scan.next();
            if (x.equalsIgnoreCase("y")) {
                game();
            } else {
                gameover = true;
            }
        }
    }

    public static void main(String[] args) {
        game();
    }
}
