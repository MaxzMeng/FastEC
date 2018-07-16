package me.maxandroid.core.ui.launcher;

import android.content.Context;
import android.support.v7.widget.AppCompatImageView;
import android.view.View;

import com.bigkoo.convenientbanner.holder.Holder;

public class LauncherHolder implements Holder<Integer> {
    private AppCompatImageView mImageVIew = null;
    @Override
    public View createView(Context context) {
        mImageVIew = new AppCompatImageView(context);
        return mImageVIew;
    }

    @Override
    public void UpdateUI(Context context, int position, Integer data) {
        mImageVIew.setBackgroundResource(data);
    }
}
