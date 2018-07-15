package me.maxandroid.fastec;

import android.app.Application;

import com.joanzapata.iconify.fonts.FontAwesomeModule;

import me.maxandroid.core.app.Latte;
import me.maxandroid.ec.icon.FontEcModule;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Latte.init(this)
                .withIcon(new FontAwesomeModule())
                .withIcon(new FontEcModule())
                .withApiHost("http:127.0.0.1/")
                .configure();
    }
}
