package com.bjw.fragmenttest;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.orhanobut.logger.Logger;

/**
 * Created by Administrator on 2016/7/2 0002.
 */
public class AnotherRightFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.another_right_fragment, container, false);
        Logger.d("hello");
        return view;

    }
    @Override
    public void onStart() {
        Logger.d("hello");
        super.onStart();
    }
    @Override
    public void onStop() {
        Logger.d("hello");
        super.onStop();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        Logger.d("hello");
        super.onCreate(savedInstanceState);
    }
}
