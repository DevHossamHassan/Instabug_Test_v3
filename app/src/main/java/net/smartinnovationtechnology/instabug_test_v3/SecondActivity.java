package net.smartinnovationtechnology.instabug_test_v3;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import java.util.HashMap;

import butterknife.Bind;
import butterknife.ButterKnife;
import me.branded.hossamhassan.instamonitor.InstaMonitor;

public class SecondActivity extends AppCompatActivity {
    HashMap<String,String>appData;
    @Bind(R.id.tvDataMap)TextView tvData;
    InstaMonitor instaMonitor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ButterKnife.bind(this);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();*/
                try {
                    instaMonitor = InstaMonitor.getInstance();
                    appData = instaMonitor.getMonitorData();
                    tvData.setText(appData.toString());
                }catch (Exception e)
                {

                }
            }
        });
    }

}
