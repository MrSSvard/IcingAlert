package se.standersson.digimon;

import android.app.Activity;
import android.content.SharedPreferences;
import java.util.HashMap;


class LoginStorage {
    private SharedPreferences loginDetails;
    LoginStorage(Activity activity){
        loginDetails = activity.getPreferences(Activity.MODE_PRIVATE);
    }

    // Save Login details
    void setLoginDetails(HashMap<String, String> prefs){
        loginDetails.edit().putString("serverString", prefs.get("serverString")).apply();
        loginDetails.edit().putString("username", prefs.get("username")).apply();
        loginDetails.edit().putString("password", prefs.get("password")).apply();

    }

    // Serve Login details
    HashMap<String, String> getLoginDetails(){
        HashMap<String, String> prefs = new HashMap<>();
        prefs.put("serverString", loginDetails.getString("serverString", "test"));
        prefs.put("username", loginDetails.getString("username", "weee"));
        prefs.put("password", loginDetails.getString("password", "woo"));
        return prefs;
    }
}
