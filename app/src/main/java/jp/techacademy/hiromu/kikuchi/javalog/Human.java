package jp.techacademy.hiromu.kikuchi.javalog;

import android.util.Log;

class Human extends Animal {

    //メンバ変数
    String hobby;

    //クラス関数
    static String to_jp = "hobby";

    //コンストラクタ
    public Human(String name, int age, String hobby) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }

    @Override
    public void say() {
        Log.d("homework", "私の名前は" + this.name + "です。" + "年は" + this.age + "です。");
    }

    public void think() {
        Log.d("homework", "私は" + this.hobby + "について考える");
    }
}