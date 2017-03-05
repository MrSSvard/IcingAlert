package se.standersson.icingalert;

import android.util.Log;
import android.widget.Toast;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class FirebaseCommunication extends FirebaseMessagingService {
    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        // TODO: Handle FCM messages here.
        // If the application is in the foreground handle both data and notification messages here.
        // Also if you intend on generating your own notifications as a result of a received FCM
        // message, here is where that should be initiated.
        Log.d("FCM", "From: " + remoteMessage.getFrom());
        Log.d("FCM", "Notification Message Body: " + remoteMessage.getNotification().getBody());
        Toast.makeText(this, remoteMessage.getNotification().getTitle(), Toast.LENGTH_LONG).show();
    }
}