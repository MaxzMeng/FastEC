package me.maxandroid.core.wechat.templates;


import me.maxandroid.core.activities.ProxyActivity;
import me.maxandroid.core.delegates.LatteDelegate;

public class WXEntryTemplate extends ProxyActivity {
    @Override
    public LatteDelegate setRootDelegate() {
        return null;
    }

//    @Override
//    protected void onResume() {
//        super.onResume();
//        finish();
//        overridePendingTransition(0, 0);
//    }
//
//    @Override
//    protected void onSignInSuccess(String userInfo) {
//        LatteWeChat.getInstance().getSignInCallback().onSignInSuccess(userInfo);
//    }
}
