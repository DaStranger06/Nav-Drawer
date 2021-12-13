package com.siamsoft.nav_drawwer.ui;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;
import com.siamsoft.nav_drawwer.R;

public class Splash extends Fragment {
    ImageView bk;
    TextView tv;
    LottieAnimationView lotv;

    private SplashViewModel mViewModel;

    public static Splash newInstance() {
        return new Splash();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.splash_fragment, container, false);

        bk = view.findViewById(R.id.backg);
        lotv = view.findViewById(R.id.lottie);
        tv = view.findViewById(R.id.tx);

        bk.animate().translationY(-1600).setDuration(1000).setStartDelay(4000);
        tv.animate().translationY(1200).setDuration(1000).setStartDelay(4000);
        lotv.animate().translationY(1200).setDuration(1000).setStartDelay(4000);


    return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(SplashViewModel.class);
        // TODO: Use the ViewModel
    }

}