package android.example.randomletter2;

import androidx.appcompat.app.AppCompatActivity;

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


        // Делаем таймер

        //Создаем переменную и привязываем ее к текст вью
        // Внимание!: тут название переменной и название текствью совпадают
        TextView txtSeconds = (TextView) findViewById(R.id.txtSeconds);
        //И по аналогии создаем переменную и привязываем кнопку-вью
        Button btnStart = (Button) findViewById(R.id.buttonStart);



        // Создаем слушателя кнопки, или обработчик события
        View.OnClickListener oclbtnStart = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Создадим переменную что бы задавать длину таймера считанную из текстового поля
                // но нужно преобразовать из текста в число из текст вью txtSeconds
                long seconds = Long.parseLong(txtSeconds.getText().toString());


                // Тут Создаем таймер

                // В скобочках задаем два параметра, от скольки мы скитаем
                // и через сколько. От 10000(переменная seconds) милисекунд, и через 1000
                // то есть грубо говоря вниз от 10 до 0 секунд через одну секунду
                // умножить на 1000 потомучто 1000 милисекунд в одной секунде
                CountDownTimer myTimer = new CountDownTimer(seconds*1000, 1000)
                {
                    @Override
                    // millisUntilFinished - переменная отображающая оставшееся количесво секунд до конца
                    // тип переменной лонг
                    public void onTick(long millisUntilFinished) {
                        //надо тип лонг перевести в текстовое поле
                        // делим на 1000 потому что что бы видеть не милисекунды а секунды
                        txtSeconds.setText(Long.toString(millisUntilFinished/1000));

                    }

                    @Override
                    public void onFinish() {
                        // Когда у нас будет завершение мы обратимся к похожей команде
                        txtSeconds.setText("Время вышло");

                    }
                    // После следующей кнопки добавь точку с запетой, автоматом она не добавится
                };

                // НО Нужно запустить таймер:
                myTimer.start();
            }
        };

        // После создания слушателя мы обращаемся к нашей кнопке бтнСтарт
        // И в скобки вписываем метод который мы хотим получить в качестве обработчика
        btnStart.setOnClickListener(oclbtnStart);


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
        quantityTextView.setText("Буква " + AAA);
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