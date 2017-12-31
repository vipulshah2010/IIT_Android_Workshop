package vipshah.com.objectanimatorsdemo;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.alphaButton)
    void playAlphaAnimation(View view) {
        ValueAnimator animator = ObjectAnimator
                .ofFloat(view, View.ALPHA, 1, 0);
        animator.setDuration(1000);
        animator.setRepeatCount(ValueAnimator.INFINITE);
        animator.setRepeatMode(ValueAnimator.REVERSE);
        animator.start();

    }

    @OnClick(R.id.rotateButton)
    void playRotateAnimation(View view) {
        ValueAnimator animator = ObjectAnimator
                .ofFloat(view, View.ROTATION, 0, 270);
        animator.setDuration(500);
        animator.setRepeatCount(ValueAnimator.INFINITE);
        animator.setRepeatMode(ValueAnimator.REVERSE);
        animator.start();
    }

    @OnClick(R.id.translateButton)
    void playTranslateAnimation(View view) {
        ValueAnimator animatorX = ObjectAnimator
                .ofFloat(view, View.TRANSLATION_X, 1, 200);
        animatorX.setDuration(500);
        animatorX.setRepeatCount(ValueAnimator.INFINITE);
        animatorX.setRepeatMode(ValueAnimator.REVERSE);

        ValueAnimator animatorY = ObjectAnimator
                .ofFloat(view, View.TRANSLATION_Y, 1, 200);
        animatorY.setDuration(500);
        animatorY.setRepeatCount(ValueAnimator.INFINITE);
        animatorY.setRepeatMode(ValueAnimator.REVERSE);

        AnimatorSet set = new AnimatorSet();
        set.playTogether(animatorX, animatorY);
        set.start();
    }

    @OnClick(R.id.scaleButton)
    void playScaleAnimation(View view) {
        ValueAnimator animatorX = ObjectAnimator
                .ofFloat(view, View.SCALE_X, 1, 2);
        animatorX.setDuration(500);
        animatorX.setRepeatCount(ValueAnimator.INFINITE);
        animatorX.setRepeatMode(ValueAnimator.REVERSE);

        ValueAnimator animatorY = ObjectAnimator
                .ofFloat(view, View.SCALE_Y, 1, 2);
        animatorY.setDuration(500);
        animatorY.setRepeatCount(ValueAnimator.INFINITE);
        animatorY.setRepeatMode(ValueAnimator.REVERSE);

        AnimatorSet set = new AnimatorSet();
        set.playTogether(animatorX, animatorY);
        set.start();
    }

    @OnClick(R.id.mixtureButton)
    void playMixtureAnimation(View view) {
        ValueAnimator animatorX = ObjectAnimator
                .ofFloat(view, View.TRANSLATION_X, 1, 200);
        animatorX.setDuration(500);
        animatorX.setRepeatCount(ValueAnimator.INFINITE);
        animatorX.setRepeatMode(ValueAnimator.REVERSE);

        ValueAnimator animatorY = ObjectAnimator
                .ofFloat(view, View.TRANSLATION_Y, 1, 200);
        animatorY.setDuration(500);
        animatorY.setRepeatCount(ValueAnimator.INFINITE);
        animatorY.setRepeatMode(ValueAnimator.REVERSE);

        ValueAnimator animatorScaleX = ObjectAnimator
                .ofFloat(view, View.SCALE_X, 1, 2);
        animatorScaleX.setDuration(500);
        animatorScaleX.setRepeatCount(ValueAnimator.INFINITE);
        animatorScaleX.setRepeatMode(ValueAnimator.REVERSE);

        ValueAnimator animatorScaleY = ObjectAnimator
                .ofFloat(view, View.SCALE_Y, 1, 2);
        animatorScaleY.setDuration(500);
        animatorScaleY.setRepeatCount(ValueAnimator.INFINITE);
        animatorScaleY.setRepeatMode(ValueAnimator.REVERSE);

        ValueAnimator rotateAnimator = ObjectAnimator
                .ofFloat(view, View.ROTATION, 0, 270);
        rotateAnimator.setDuration(500);
        rotateAnimator.setRepeatCount(ValueAnimator.INFINITE);
        rotateAnimator.setRepeatMode(ValueAnimator.REVERSE);
        rotateAnimator.start();


        AnimatorSet set = new AnimatorSet();
        set.playTogether(animatorX, animatorY, animatorScaleX, animatorScaleY, rotateAnimator);
        set.start();
    }
}
