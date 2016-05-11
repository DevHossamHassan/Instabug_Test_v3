package net.smartinnovationtechnology.instabug_test_v3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.instabug.library.IBGInvocationMode;
import com.instabug.library.Instabug;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @OnClick(R.id.btnFeedback)void onFeedBackClicked()
    {
        startActivity(new Intent(this,SecondActivity.class));
    }
    @OnClick(R.id.btnReport)void onReportClicked()
    {
        Instabug.invoke(IBGInvocationMode.IBGInvocationModeFeedbackSender);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);




                //throw new NullPointerException("This is a test crash");

         //Instabug.showIntroMessage();
         //Instabug.invoke(IBGInvocationMode.IBGInvocationModeFeedbackSender);

    }
}
