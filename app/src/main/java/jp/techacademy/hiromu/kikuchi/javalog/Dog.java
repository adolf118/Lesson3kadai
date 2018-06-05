package jp.techacademy.hiromu.kikuchi.javalog;

import android.util.Log;

 class Dog extends Animal implements Movable {
     String name; //名前
     int age; //年齢

     //コンストラクタ
     public Dog(String name, int age) {
         this.name = name;
         this.age = age;
     }

     //クラス関数
     public static void introduce() {
         Log.d("javatest", "これは犬クラスです。");
     }

     //メンバ関数

     @Override
     public void say() {
         Log.d("javatest, this.name + "(" + this.age + "歳)" + "「ワンワン」");
     }
 }

