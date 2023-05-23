package android.example.randomletter2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class words20seconds extends AppCompatActivity {

    String[] alphabet = {"А", "Б", "В", "Г", "Д", "Е", "Ж", "З", "И", "К", "Л", "М", "Н", "О", "П", "Р", "С", "Т", "У", "Ф", "Х", "Ц", "Ч", "Ш", "Э", "Ю", "Я"};
    // 27 букв в массиве
    int oneLength = alphabet.length;

    String[] type1 = {"Овощи", "Фрукты", "Боевики", "Звери", "Птицы", "Оружие", "Посуда", "Блюда (еда)", "Книги", "Фильмы", "Футболисты", "Актёры", "Герои фильмов"};
    // 10 букв в массиве
    int twoLength = type1.length;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_words20seconds);


        Button startToTimer = (Button) findViewById(R.id.buttonStart);


    }

    public void startToTimer (View v) {
        Intent intent;
        intent = new Intent(words20seconds.this, MyTimer.class);
        startActivity(intent);

    }

    // Этот метод вызывается при нажатии кнопки1.
    // ссылка на метод находится во вьюшке
    public void submitOrder(View view) {
        int rand = (int) (Math.random() * 27);
        String letter = alphabet[rand];

        display(String.valueOf(letter));
    }
    // Этот метод Заполняет окно рандомной буквы
    private void display(String AAA) {
        TextView quantityTextView = (TextView) findViewById(R.id.letter_text_view);
        quantityTextView.setText(getString(R.string.letter)+ " " + AAA);
    }




    // Этот метод вызывается при нажатии кнопки2.
    public void submitOrder2(View view) {
        int rand = (int) (Math.random() * twoLength);
        String type11 = type1[rand];

        display2(String.valueOf(type11));
    }
    // Этот метод Заполняет окно рандомного типа
    private void display2(String BBB) {
        TextView quantityTextView = (TextView) findViewById(R.id.type1_text_view);
        quantityTextView.setText(BBB);
    }


    // Таймер (просто теоритический таймер)
    // не используется в данном приложении

    public class MyTimerTask extends TimerTask {
        public void run () {
            System.out.println("Задание по таймеру выполняется");
        }

    }

    class Ttest {
        public void main(String args[]) {
            MyTimerTask myTask = new MyTimerTask();
            Timer myTimer = new Timer();
            // Установить первоначальную паузу в течении одной
            // секунды, а затем повторять задание каждые полсекунды
            myTimer.schedule(myTask, 1000, 1200);

            try {
                Thread.sleep(10000);
            } catch (InterruptedException exc) {
            }

            myTimer.cancel();

        }
    }







}