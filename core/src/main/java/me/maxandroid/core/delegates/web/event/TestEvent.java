package me.maxandroid.core.delegates.web.event;

import android.widget.Toast;

public class TestEvent extends Event{
    @Override
    public String execute(String params) {
        Toast.makeText(getContext(), getAction(), Toast.LENGTH_SHORT).show();
        if (getAction().equals("test")) {
            getWebView().post(new Runnable() {
                @Override
                public void run() {
                    mWebView.evaluateJavascript("nativeCall();", null);
                }
            });
        }
        return null;
    }
}
