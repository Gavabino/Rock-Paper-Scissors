public class Logic {
    private static final int playerMove = Game.playerMove;
    private static final int computerMove = Game.computerMove;

    public static String getWinner(){
        // Computer wins
        if (computerMove == 3 && playerMove == 2) {
            return "Computer Wins!";
        } else if (computerMove == 2 && playerMove == 1) {
            return "Computer Wins!";
        } else if (computerMove == 1 && playerMove == 3) {
            return "Computer Wins!";
        }

        // Player wins
        if (playerMove == 3 && computerMove == 2) {
            return "Player Wins!";
        } else if (playerMove == 2 && computerMove == 1) {
            return "Player Wins!";
        } else if (playerMove == 1 && computerMove == 3) {
            return "Player Wins!";
        }

        //Tie
        if (playerMove == computerMove) {
            return "Tie!";
        }
        return "Error";
    }
}
