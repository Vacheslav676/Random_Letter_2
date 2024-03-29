package android.example.randomletter2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class BrainTrainMenu extends AppCompatActivity implements View.OnClickListener {

    Button words20SecondsButton;
    Button category2Letters;
    Button randomCharacter;
    Button switchingToMyTimer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brain_train_menu);

        words20SecondsButton = (Button) findViewById(R.id.words_in_20_seconds_button);
        category2Letters = (Button) findViewById(R.id.category_2_letters_button);
        randomCharacter = (Button) findViewById(R.id.acting_skills_button);
        switchingToMyTimer = (Button) findViewById(R.id.switching_to_my_timer_button);

        words20SecondsButton.setOnClickListener(this);
        category2Letters.setOnClickListener(this);
        randomCharacter.setOnClickListener(this);
        switchingToMyTimer.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        Intent intent;
        switch (v.getId()) {
            case R.id.words_in_20_seconds_button:
               intent = new Intent(BrainTrainMenu.this, words20seconds.class);

                startActivity(intent);
                break;
            case R.id.category_2_letters_button:
                intent = new Intent(BrainTrainMenu.this, categoryAnd2Letters.class);

               startActivity(intent);
                break;
            case R.id.acting_skills_button:
                intent = new Intent(BrainTrainMenu.this, ActingSkills.class);

                startActivity(intent);
                break;

            case R.id.switching_to_my_timer_button:
                intent = new Intent(BrainTrainMenu.this, MyTimer.class);
                startActivity(intent);
                break;


        }

    }
}