package me.maxandroid.fastec;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.widget.Toast;

import me.maxandroid.core.activities.ProxyActivity;
import me.maxandroid.core.app.Latte;
import me.maxandroid.core.delegates.LatteDelegate;
import me.maxandroid.core.ui.launcher.ILauncherListener;
import me.maxandroid.core.ui.launcher.OnLauncherFinishTag;
import me.maxandroid.ec.launcher.LauncherDelegate;
import me.maxandroid.ec.main.EcBottomDelegate;
import me.maxandroid.ec.sign.ISignListener;
import me.maxandroid.ec.sign.SignInDelegate;
import qiu.niorgai.StatusBarCompat;

public class MainActivity extends ProxyActivity implements ISignListener, ILauncherListener {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
        Latte.getConfigurator().withActivity(this);
        StatusBarCompat.translucentStatusBar(this, true);
    }

    @Override
    public LatteDelegate setRootDelegate() {
        return new LauncherDelegate();
    }

    @Override
    public void onSignInSuccess() {
        Toast.makeText(this, "登录成功", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onSignUpSuccess() {
        Toast.makeText(this, "注册成功", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onLauncherFinish(OnLauncherFinishTag tag) {
        switch (tag) {
            case SINGED:
//                Toast.makeText(this, "登陆了", Toast.LENGTH_SHORT).show();
                startWithPop(new EcBottomDelegate());
                break;
            case NOT_SINGNED:
//                Toast.makeText(this, "没登录", Toast.LENGTH_SHORT).show();
                startWithPop(new SignInDelegate());
                break;
            default:
                break;
        }
    }
}
