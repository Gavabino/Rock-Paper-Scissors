import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

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
    }
}
