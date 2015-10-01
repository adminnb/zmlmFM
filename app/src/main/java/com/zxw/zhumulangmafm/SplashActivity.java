package com.zxw.zhumulangmafm;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

public class SplashActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        ImageView splash = (ImageView) findViewById(R.id.img_splash);

//        ImageLoadTask task = new ImageLoadTask(splash);
//        task.execute("http://fdfs.xmcdn.com/group13/M03/79/20/wKgDXVYGnzmhkc6iAAcGLwNMf3A549.jpg",
//                new Integer(1080).toString(),new Integer(1920).toString());
//                new Integer(1080).toString(),new Integer(1920).toString());
//
//        Thread thread = new Thread(this);
//        thread.start();
    }
    }

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        SharedPreferences sp = getSharedPreferences(Constants.SP_NAME_APP,MODE_PRIVATE);

        //获取上一次显示引导页的邦本信息
        String wsv = sp.getString(Constants.SP_KEY_WELOCOM_SHOW_VER, null);

        //使用Gradle模式获取版本信息 BuildConfig来获取

        Intent intent = new Intent(this, MainActivity.class);

        //如果版本不同，那么欢饮页启动
        if (!BuildConfig.VERSION_NAME.equals(wsv)){
            //显示欢迎页
//            intent = new Intent(this, WelcomeActivity.class);
        } else {
            //显示主界面
        }



        startActivity(intent);
        finish();
    }
}
