package android.example.randomletter2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;
import java.util.*;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button SportButtonMenu;
    Button BrainTrainButtonMenu;

       @Override
    protected void onCreate(Bundle savedInstanceState) {
           super.onCreate(savedInstanceState);
           setContentView(R.layout.activity_main);

           SportButtonMenu = (Button) findViewById(R.id.sport_button_menu);
           BrainTrainButtonMenu = (Button) findViewById(R.id.brain_train_button_menu);

           SportButtonMenu.setOnClickListener(this);
           BrainTrainButtonMenu.setOnClickListener(this);

       }

    @Override
    public void onClick(View v) {

        Intent intent;
        switch (v.getId()) {
           case R.id.sport_button_menu:
               // Создаю интент и говорю что хочу перейти из этого (this) активити,
               // в активити2 = SportMenu.class
                intent = new Intent(MainActivity.this, SportMenu.class);
               //специальная функция для старта интента. После нее текущая активити
               // не закрывается, а сворачивается
                startActivity(intent);
               //Сделал простейшие кнопки для перехода по активностям.
               // Но каждая предыдущая активити будет висеть в буфере и в истории.
                break;
            case R.id.brain_train_button_menu:
                intent = new Intent(MainActivity.this, BrainTrainMenu.class);

                startActivity(intent);
                break;
        }

    }

}