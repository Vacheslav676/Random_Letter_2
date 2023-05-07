package android.example.randomletter2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class categoryAnd2Letters extends AppCompatActivity {


    String[] alphabet = {"А", "Б", "В", "Г", "Д", "Е", "Ж", "З", "И", "К", "Л", "М", "Н", "О", "П", "Р", "С", "Т", "У", "Ф", "Х", "Ц", "Ч", "Ш", "Э", "Ю", "Я"};
    int oneLength = alphabet.length;

    String[] type1 = {"Овощи", "Фрукты", "Боевики", "Звери", "Птицы", "Оружие", "Посуда", "Блюда (еда)", "Книги", "Фильмы", "Футболисты", "Актёры", "Герои фильмов"};
    int twoLength = type1.length;

    String[] type2 = {"Книга", "Игра", "Кино", "Название песни", "Сказка"};
    int threeLength = type2.length;

    //================================================================
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_and2_letters);

        TextView txtSeconds = (TextView) findViewById(R.id.txtSeconds);
        Button btnStart = (Button) findViewById(R.id.buttonStart);

        View.OnClickListener oclbtnStart = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                long seconds = Long.parseLong(txtSeconds.getText().toString());

                CountDownTimer myTimer = new CountDownTimer(seconds*1000, 1000)
                {
                    @Override
                    public void onTick(long millisUntilFinished) {
                        //надо тип лонг перевести в текстовое поле
                        // делим на 1000 потому что что бы видеть не милисекунды а секунды
                        txtSeconds.setText(Long.toString(millisUntilFinished/1000));

                    }
                    @Override
                    public void onFinish() {
                        txtSeconds.setText("Время вышло");
                    }
                };
                myTimer.start();
            }
        };
        btnStart.setOnClickListener(oclbtnStart);
    }

    //==================================================================



    // Этот метод вызывается при нажатии кнопки3.
    public void submitOrder3(View view) {
        int rand21 = (int) (Math.random() * oneLength);
        int rand22 = (int) (Math.random() * oneLength);
        int rand23 = (int) (Math.random() * threeLength);
        String type22 = alphabet[rand21];
        String type23 = alphabet[rand22];
        String type24 = type2[rand23];
        String type25 = (type22+ " " + type23+ " - " + type24);

        display3(String.valueOf(type25));
    }

    // Этот метод Заполняет окно две буквы и тип
    private void display3(String CCC) {
        TextView quantityTextView = (TextView) findViewById(R.id.type2_text_view);
        quantityTextView.setText(CCC);
    }
}