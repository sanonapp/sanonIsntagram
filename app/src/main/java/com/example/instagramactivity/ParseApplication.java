package com.example.instagramactivity;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("8mSo934TCJajcBTNkRy9cPym17PlTkpFRoLSlZiH")
                .clientKey("iwzGaEoZIQGbgMB3u23jGsPm4GTxBQvdsBRuwZBK")
                .server("https://parseapi.back4app.com")
                .build()
        );

    }
}
