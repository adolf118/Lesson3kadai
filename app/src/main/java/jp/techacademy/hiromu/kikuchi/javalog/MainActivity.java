package jp.techacademy.hiromu.kikuchi.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Human human = new Human("菊地大夢", 18, "読書");

        human.say();
        Log.d("homework", "私の名前は" + human.name + "です。");
        Log.d("homework", "年は" + human.age + "歳です。");

        human.think();


    }
}
