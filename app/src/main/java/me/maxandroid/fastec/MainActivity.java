package me.maxandroid.fastec;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import me.maxandroid.core.activities.ProxyActivity;
import me.maxandroid.core.app.Latte;
import me.maxandroid.core.delegates.LatteDelegate;

public class MainActivity extends ProxyActivity {

    @Override
    public LatteDelegate setRootDelegate() {
        return new ExampleDelegate();
    }

}
