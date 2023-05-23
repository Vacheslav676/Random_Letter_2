package android.example.randomletter2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActingSkills extends AppCompatActivity {

    String[] actingSkillsArrays = {"Богатырь", "Рок звезда", "Голос войс", "Лепс", "Егор Шереметьев", "Как свой начальник", "Мэтью МакКонахи"};
    int oneActor = actingSkillsArrays.length;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acting_skills);
        Button startToTimer = (Button) findViewById(R.id.buttonStart);

    }

    public void startToTimer (View v) {
        Intent intent;
        intent = new Intent(ActingSkills.this, MyTimer.class);
        startActivity(intent);

    }

    //этот метод вызывается при нажатии кнопки "сл.персонаж"
    //
    public void randCharac(View view){
       int rand = (int) (Math.random() * oneActor);
       String typeRC = actingSkillsArrays[rand];

       TextView rcTextView = (TextView) findViewById(R.id.ran_char_text_view);
        rcTextView.setText(typeRC);

    }





}