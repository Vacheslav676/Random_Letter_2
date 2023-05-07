package android.example.randomletter2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MyTimer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_timer);
    }

    //Создаем слушателя кнопки, или обработчик события
    View.OnClickListener onClickMyTimer = new View.OnClickListener() {
        @Override
        public void onClick(View v) {


        }
    }


}