package net.smartinnovationtechnology.instabug_test_v3;

import android.app.Application;

import com.instabug.library.IBGInvocationEvent;
import com.instabug.library.Instabug;

/**
 * Created by Hossam on 5/8/2016.
 */
public class InstabugTestApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        new Instabug.Builder(this, "d0d625de1e15113b603db49890fd023a")
                .setInvocationEvent(IBGInvocationEvent.IBGInvocationEventShake)
                .build();
    }
}
