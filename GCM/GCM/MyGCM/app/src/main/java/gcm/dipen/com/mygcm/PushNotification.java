package gcm.dipen.com.mygcm;

import android.os.Bundle;

import com.google.android.gms.gcm.GcmListenerService;

/**
 * Created by Administrator on 1/25/2016.
 * src http://www.androidwarriors.com/2015/10/push-notification-using-gcm-in-android.html
 */
public class PushNotification extends GcmListenerService{

    @Override
    public void onMessageReceived(String from, Bundle data) {
        //super.onMessageReceived(from, data);
        String message = data.getString("message");

        //createNotification(mTilte, push_msg)
    }
}
