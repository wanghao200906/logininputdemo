package wang.com.logininputdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;

public class FirstActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    InputMethodLayout rl;
    LinearLayout ll;

    int scrollViewHeight;
    private ImageView iv;
    private ScrollView scrollView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.firstactivity);

        init();
    }


    private void init() {
        rl = (InputMethodLayout) findViewById(R.id.rl);
        scrollView = (ScrollView) findViewById(R.id.scrollView);

        rl.setOnkeyboarddStateListener(new InputMethodLayout.onKeyboardsChangeListener() {
            @Override
            public void onKeyBoardStateChange(int state) {
                switch (state) {
                    case InputMethodLayout.KEYBOARD_STATE_HIDE:

                        break;
                    case InputMethodLayout.KEYBOARD_STATE_SHOW:

                        scrollView.post(new Runnable() {
                            @Override
                            public void run() {
                                scrollViewHeight = scrollView.getMeasuredWidth();
                                scrollView.scrollTo(0, 65535);
                            }
                        });

                        break;

                    default:
                        break;
                }
            }
        });


    }


}
