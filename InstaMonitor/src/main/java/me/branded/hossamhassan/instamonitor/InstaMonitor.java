package me.branded.hossamhassan.instamonitor;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by HossamHassan on 5/10/2016.
 * InstaMonitor  is a singleton using lazy instantiation technique
 */
public class InstaMonitor {
    private String TAG = "INSTA_MONITOR";
    private Application application;
    private long startTime, endTime;
    
    private static InstaMonitor instaMonitor = null;

    private InstaMonitor() {
    }

    public static InstaMonitor getInstance() {
        return (instaMonitor == null) ? new InstaMonitor() : instaMonitor;
    }

    /**
     * init for initialize InstaMonitor
     *
     * @param application
     */
    public void init(Application application) {
        this.application = application;
        setStartTime();
        registerCallbacks();
        startWatcherService();
    }
    void startWatcherService(){
        Log.i(TAG, "startWatcherService: ");
        application.startService(new Intent(application, OnClearFromRecentService.class));
    }

    /**
     * init application start time
     */
    private void setStartTime() {
        startTime = System.currentTimeMillis();
        Log.i(TAG, "setStartTime: " + startTime);
    }



    /**
     * register activity lifecycle callbacks
     */
    private void registerCallbacks() {
        application.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() {
            @Override
            public void onActivityCreated(Activity activity, Bundle bundle) {
                Log.i(TAG, "onActivityCreated: " + activity.getClass().getSimpleName());


            }

            @Override
            public void onActivityStarted(Activity activity) {
                Log.i(TAG, "onActivityStarted: " + activity.getClass().getSimpleName());

            }

            @Override
            public void onActivityResumed(Activity activity) {
                Log.i(TAG, "onActivityResumed: " + activity.getClass().getSimpleName());

            }

            @Override
            public void onActivityPaused(Activity activity) {
                Log.i(TAG, "onActivityPaused: " + activity.getClass().getSimpleName());

            }

            @Override
            public void onActivityStopped(Activity activity) {
                Log.i(TAG, "onActivityStopped: " + activity.getClass().getSimpleName());


            }

            @Override
            public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                Log.i(TAG, "onActivitySaveInstanceState: " + activity.getClass().getSimpleName());

            }

            @Override
            public void onActivityDestroyed(Activity activity) {
                Log.i(TAG, "onActivityDestroyed: " + activity.getClass().getSimpleName());

            }
        });
    }
    public long getStartTime()
    {
        return startTime;
    }

}
