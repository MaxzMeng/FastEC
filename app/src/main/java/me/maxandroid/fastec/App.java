package me.maxandroid.fastec;

import android.app.Application;

import com.joanzapata.iconify.fonts.FontAwesomeModule;

import me.maxandroid.core.app.Latte;
import me.maxandroid.core.net.interceptor.DebugInterceptor;
import me.maxandroid.ec.icon.FontEcModule;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Latte.init(this)
                .withIcon(new FontAwesomeModule())
                .withIcon(new FontEcModule())
                .withLoaderDelayed(1000)
                .withApiHost("http:127.0.0.1/")
                .withInterceptor(new DebugInterceptor("index", R.raw.test))
                .configure();
    }
}
