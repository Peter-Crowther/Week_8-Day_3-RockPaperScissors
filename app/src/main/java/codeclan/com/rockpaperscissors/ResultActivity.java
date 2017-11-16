package codeclan.com.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    Button playAgain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent intent = getIntent();

        Bundle extras = intent.getExtras();

        String playerChoice = extras.getString("PlayerChoice");
        TextView playerChoiceTextView = findViewById(R.id.playerChoice);
        playerChoiceTextView.setText(playerChoice);


        String computer = extras.getString("ComputerChoice");
        TextView computerChoiceTextView = findViewById(R.id.computerChoice);
        computerChoiceTextView.setText(computer);

        String result = extras.getString("Result");
        TextView textView = findViewById(R.id.result);

        textView.setText(result);
    }

    public void onReplayButtonClicked(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
