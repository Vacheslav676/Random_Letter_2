package android.example.randomletter2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.os.CountDownTimer;

public class MyTimer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_timer);

        TextView txtSec = (TextView) findViewById(R.id.text_seconds_timer);
        Button button20Sec = (Button) findViewById(R.id.button_20_timer);
        Button button60Sec = (Button) findViewById(R.id.button_60_Timer);
        Button buttonStartTimer = (Button) findViewById(R.id.button_start_timer);

            View.OnClickListener oneClick = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                long seconds = Long.parseLong(txtSec.getText().toString());
                CountDownTimer myTimer = new CountDownTimer(seconds * 1000, 1000) {
                    @Override
                    public void onTick(long millisUntilFinished) {
                        txtSec.setText(Long.toString(millisUntilFinished / 1000));
                        // отображение в секундах а не милисекндах
                    }
                    @Override
                    public void onFinish() {
                        txtSec.setText("Время вышло");
                    }
                };
                myTimer.start();
            }

        };
        // вписываем кнопкам методы-обработчики
        buttonStartTimer.setOnClickListener(oneClick);
//
//        button20Sec.setOnClickListener(oneClick);
//        button60Sec.setOnClickListener(oneClick);



    }

    // Этот метод вызывается при нажатии кнопки20.
    public void submitOrder3(View view) {
        String type24 = "20";
        display3(String.valueOf(type24));
    }
    // Этот метод Заполняет окно
    public void display3(String CCC) {
        TextView txtSec = (TextView) findViewById(R.id.text_seconds_timer);
        txtSec.setText(CCC);
    }


    // Этот метод вызывается при нажатии кнопки60.
    public void submitOrder4(View view) {
        String type25 = "60";
        display4(String.valueOf(type25));
    }
    // Этот метод Заполняет окно
    public void display4(String CCC) {
        TextView txtSec = (TextView) findViewById(R.id.text_seconds_timer);
        txtSec.setText(CCC);
    }





}