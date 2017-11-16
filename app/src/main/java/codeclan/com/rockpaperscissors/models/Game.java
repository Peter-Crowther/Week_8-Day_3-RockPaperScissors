package codeclan.com.rockpaperscissors.models;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;
import java.util.Random;

/**
 * Created by user on 15/11/2017.
 */

public class Game {

    private List<Move> moves = new ArrayList<>(EnumSet.allOf(Move.class));
    private String computerMove;
    private String playerMove;

    public String playerMove(){
        return playerMove;
    }

    public int getNumberOfMoves() {
        return this.moves.size();
    }

    public int getRandomNumber() {
        Random rand = new Random();
        int numberOfMoves = this.getNumberOfMoves();
        return rand.nextInt(numberOfMoves);
    }

    public String playerGetsRock(){
        Move rockSelect = Move.ROCK;
        return rockSelect.toString();
    }

    public String playerGetsPaper(){
        Move paperSelect = Move.PAPER;
        return paperSelect.toString();
    }

    public String playerGetsScissors(){
        Move scissorsSelect = Move.SCISSORS;
        return scissorsSelect.toString();
    }


    public String computerMove() {
        int randomIndex = this.getRandomNumber();
        Move computerTurn = moves.get(randomIndex);
        return computerTurn.toString();
    }


    public String declareWinner(String playerMove, String computerMove){
        if(playerMove == computerMove) {
            return("IT IS A DRAW");
        } else if(playerMove == "ROCK" && computerMove == "SCISSORS") {
            return("YOU WIN");
        } else if(playerMove == "PAPER" && computerMove == "ROCK") {
            return("YOU WIN");
        } else if(playerMove == "SCISSORS" && computerMove == "PAPER") {
            return("YOU WIN");
        } else{
            return("YOU LOSE");
          }
    }
}




