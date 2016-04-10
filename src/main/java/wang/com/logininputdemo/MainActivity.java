package wang.com.logininputdemo;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    InputMethodLayout rl;
    LinearLayout ll;
    int heightDifference;
    private Button btn_ok;
    int btn_height;
    private ImageView iv;
    //    private ScrollView scrollView;
    Handler mHandler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainlayout);

       findViewById(R.id.btn_firstactivity).setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               startActivity(new Intent(MainActivity.this,FirstActivity.class));
           }
       });
        findViewById(R.id.btn_secondactivity).setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               startActivity(new Intent(MainActivity.this,SecondActivity.class));
           }
       });


    }

}
