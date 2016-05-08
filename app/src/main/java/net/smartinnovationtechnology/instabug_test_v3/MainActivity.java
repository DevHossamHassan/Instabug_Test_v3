package net.smartinnovationtechnology.instabug_test_v3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.instabug.library.IBGInvocationMode;
import com.instabug.library.Instabug;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




                //throw new NullPointerException("This is a test crash");

         Instabug.showIntroMessage();

         Instabug.invoke(IBGInvocationMode.IBGInvocationModeFeedbackSender);

    }
}
