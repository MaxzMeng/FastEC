package me.maxandroid.core.wechat.templates;

import me.maxandroid.core.activities.ProxyActivity;
import me.maxandroid.core.delegates.LatteDelegate;

/**
 * Created by 傅令杰 on 2017/1/2
 */

public class WXPayEntryTemplate extends ProxyActivity {
    @Override
    public LatteDelegate setRootDelegate() {
        return null;
    }

//    @Override
//    protected void onPaySuccess() {
//        Toast.makeText(this, "支付成功", Toast.LENGTH_SHORT).show();
//        finish();
//        overridePendingTransition(0, 0);
//    }
//
//    @Override
//    protected void onPayFail() {
//        Toast.makeText(this, "支付失败", Toast.LENGTH_SHORT).show();
//        finish();
//        overridePendingTransition(0, 0);
//    }
//
//    @Override
//    protected void onPayCancel() {
//        Toast.makeText(this, "支付取消", Toast.LENGTH_SHORT).show();
//        finish();
//        overridePendingTransition(0, 0);
//    }
//
//    @Override
//    public void onReq(BaseReq baseReq) {
//
//    }
}
