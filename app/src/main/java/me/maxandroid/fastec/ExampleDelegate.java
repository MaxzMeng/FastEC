package me.maxandroid.fastec;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import me.maxandroid.core.delegates.LatteDelegate;
import me.maxandroid.core.net.RestClient;
import me.maxandroid.core.net.callback.IError;
import me.maxandroid.core.net.callback.IFailure;
import me.maxandroid.core.net.callback.ISuccess;

public class ExampleDelegate extends LatteDelegate {

    @Override
    public Object setLayout() {
        return R.layout.delegate_main;
    }

    @Override
    public void onBindView(@Nullable Bundle savedInstanceState, View rootView) {
        testRestClient();
    }

    private void testRestClient() {
        RestClient.builder()
                .url("http://127.0.0.1/index")
                .loader(getContext())
                .success(new ISuccess() {
                    @Override
                    public void onSuccess(String response) {
                        Log.d("", "onSuccess: " + response);
                        Toast.makeText(getActivity(), response, Toast.LENGTH_SHORT).show();
                    }
                })
                .failure(new IFailure() {
                    @Override
                    public void onFailure() {
                        Toast.makeText(getActivity(), "失败", Toast.LENGTH_SHORT).show();
                    }
                })
                .error(new IError() {
                    @Override
                    public void onError(int code, String msg) {
                        Toast.makeText(getActivity(), "错误", Toast.LENGTH_SHORT).show();
                    }
                })
                .build()
                .get();
    }
}
