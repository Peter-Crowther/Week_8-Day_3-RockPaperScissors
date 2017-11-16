package codeclan.com.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import codeclan.com.rockpaperscissors.models.Game;

public class MainActivity extends AppCompatActivity {

    private TextView welcome;
    private Button rockButton;
    private Button paperButton;
    private Button scissorsButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.paperButton = findViewById(R.id.paperButton);
        this.rockButton = findViewById(R.id.rockButton);
        this.scissorsButton = findViewById(R.id.scissorsButton);
    }



    public void onRockButtonClicked(View rockButton) {
        Intent intent = new Intent(this, ResultActivity.class);

        Game game = new Game();

        String computerMove = game.computerMove();

        String winner = game.declareWinner("ROCK", computerMove);

        intent.putExtra("Result", winner);
        intent.putExtra("ComputerChoice", computerMove);
        intent.putExtra("PlayerChoice", "ROCK");

        startActivity(intent);

    }

    public void onPaperButtonClicked(View rockButton) {
        Intent intent = new Intent(this, ResultActivity.class);

        Game game = new Game();

        String computerMove = game.computerMove();

        String winner = game.declareWinner("PAPER", computerMove);

        intent.putExtra("Result", winner);
        intent.putExtra("ComputerChoice", computerMove);
        intent.putExtra("PlayerChoice", "PAPER");

        startActivity(intent);
    }


    public void onScissorsButtonClicked(View rockButton) {
        Intent intent = new Intent(this, ResultActivity.class);

        Game game = new Game();

        String computerMove = game.computerMove();

        String winner = game.declareWinner("SCISSORS", computerMove);

        intent.putExtra("Result", winner);
        intent.putExtra("ComputerChoice", computerMove);
        intent.putExtra("PlayerChoice", "SCISSORS");

        startActivity(intent);

    }
}
