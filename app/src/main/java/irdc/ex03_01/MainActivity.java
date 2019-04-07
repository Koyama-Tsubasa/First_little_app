package irdc.ex03_01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mTextView01,mTextView02;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextView01 = (TextView) findViewById(R.id.myTextView01);
        mTextView02 = (TextView) findViewById(R.id.myTextView02);
        String str_2 = "test 測試 Android TextView";
        mTextView02.setText(str_2);
    }
}
