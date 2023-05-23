package android.example.randomletter2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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
        Button startToTimer = (Button) findViewById(R.id.buttonStart);

    }

    public void startToTimer (View v) {
        Intent intent;
        intent = new Intent(categoryAnd2Letters.this, MyTimer.class);
        startActivity(intent);

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