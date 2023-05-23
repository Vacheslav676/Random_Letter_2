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
        Button buttonPauseTimer = (Button) findViewById(R.id.button_pause_timer);
        Button buttonResetTimer = (Button) findViewById(R.id.button_reset_timer);




                long seconds = Long.parseLong(txtSec.getText().toString());

                // Инициализация таймера
                CountDownTimer countDownTimer = new CountDownTimer(seconds * 1000, 1000) {
                    @Override
                    public void onTick(long millisUntilFinished) {

                        // обновление текста на экране (отображение в секундах а не милисекндах)
                        txtSec.setText(Long.toString(millisUntilFinished / 1000));
                    }

                    @Override
                    public void onFinish() {
                        // Выполнение действий по завершении таймера
                        txtSec.setText("Всё.");
                    }


                };


        // Обработка нажатия на кнопку старта
        buttonStartTimer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countDownTimer.start(); // Запуск таймера
            }
        });

// Обработка нажатия на кнопку паузы
        buttonPauseTimer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countDownTimer.cancel(); // Остановка таймера
            }
        });

        // Обработка нажатия на кнопку стоп
        buttonResetTimer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countDownTimer.cancel(); // Остановка таймера
                txtSec.setText("Заново"); // Обновление текста на экране
            }
        });




    }





    // Этот метод вызывается при нажатии кнопки20.
    public void submitOrder3(View view) {
        String type24 = "20";
        display3(String.valueOf(type24));
    }
    // Этот метод Заполняет окно
    public void display3(String CCC) {
        TextView txtSec2 = (TextView) findViewById(R.id.text_seconds_timer);
        txtSec2.setText(CCC);
    }


    // Этот метод вызывается при нажатии кнопки60.
    public void submitOrder4(View view) {
        String type25 = "60";
        display4(String.valueOf(type25));
    }
    // Этот метод Заполняет окно
    public void display4(String CCC) {
        TextView txtSec1 = (TextView) findViewById(R.id.text_seconds_timer);
        txtSec1.setText(CCC);
    }





}