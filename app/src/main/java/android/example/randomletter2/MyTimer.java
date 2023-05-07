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
        Button buttonStartTimer = (Button) findViewById(R.id.button_start_timer);

        View.OnClickListener onClick = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                long seconds = Long.parseLong(txtSec.getText().toString());

                CountDownTimer myTimer = new CountDownTimer(seconds * 1000, 1000) {
                    @Override
                    public void onTick(long millisUntilFinished) {
                        txtSec.setText(Long.toString(millisUntilFinished / 1000));

                    }

                    @Override
                    public void onFinish() {
                        txtSec.setText("Время вышло");

                    }
                };
                myTimer.start();
            }
        };

        buttonStartTimer.setOnClickListener(onClick);

    }


}