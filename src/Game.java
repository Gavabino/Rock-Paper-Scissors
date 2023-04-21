public class Game {
    public static int computerMove;
    public static int playerMove;
    public static int computer() {
        double move = Math.random();
        if (move <= 0.3) {
            move = 1; //Rock
        } else if (move >= 0.6) {
            move = 2; //Paper
        } else if (move > 0.3 && move < 0.6) {
            move = 3; //Scissors
        }
        computerMove = (int) move;
        return (int) move;
    }
    public static int textToInt(String move) {
        String newString = move.toLowerCase();
        int value = 0;
        switch (newString) {
            case "rock" -> value = 1;
            case "paper" -> value = 2;
            case "scissors" -> value = 3;
        }
        playerMove = value;
        return value;
    }
    public static String intToText(int computer) {
        String string = null;
        switch (computer) {
            case 1 -> string = "Rock";
            case 2 -> string = "Paper";
            case 3 -> string = "Scissors";
        }
        return string;
    }
}
