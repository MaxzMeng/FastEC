package me.maxandroid.core.delegates.web.client;

import android.graphics.Bitmap;
import android.os.Handler;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import me.maxandroid.core.app.Latte;
import me.maxandroid.core.delegates.web.WebDelegate;
import me.maxandroid.core.delegates.web.route.Router;
import me.maxandroid.core.ui.loader.LatteLoader;
import me.maxandroid.core.util.log.LatteLogger;

public class WebViewClientImpl extends WebViewClient {

    private final WebDelegate DELEGATE;
//    private IPageLoadListener mIPageLoadListener = null;
    private static final Handler HANDLER = Latte.getHandler();

//    public void setPageLoadListener(IPageLoadListener listener) {
//        this.mIPageLoadListener = listener;
//    }

    public WebViewClientImpl(WebDelegate delegate) {
        this.DELEGATE = delegate;
    }

    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        LatteLogger.d("shouldOverrideUrlLoading", url);
        return Router.getInstance().handleWebUrl(DELEGATE, url);
    }

    @Override
    public void onPageStarted(WebView view, String url, Bitmap favicon) {
        super.onPageStarted(view, url, favicon);
//        if (mIPageLoadListener != null) {
//            mIPageLoadListener.onLoadStart();
//        }
        LatteLoader.showLoading(view.getContext());
    }

    @Override
    public void onPageFinished(WebView view, String url) {
        super.onPageFinished(view, url);
//        if (mIPageLoadListener != null) {
//            mIPageLoadListener.onLoadEnd();
//        }
        HANDLER.postDelayed(new Runnable() {
            @Override
            public void run() {
                LatteLoader.stopLoading();
            }
        }, 1000);
    }
}
