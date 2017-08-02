package com.sft.wisdom.activity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import com.sft.wisdom.R;
import com.sft.wisdom.base.BActivity;
import com.sft.wisdom.view.RangeSeekBar;

import org.androidannotations.annotations.CheckedChange;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

import cn.sft.util.Util;

import static java.lang.Float.NaN;

@EActivity(R.layout.activity_welcome)
public class WelcomeActivity extends BActivity implements RangeSeekBar.RangeSeekBarChangedListener {

    @ViewById
    ImageView welcome_logo_im;
    @ViewById
    TextView welcome_name_tv;
    @ViewById
    Button welcome_account_btn;
    @ViewById
    Button welcome_phone_btn;
    @ViewById
    CheckBox welcome_protocol_ck;

    @Override
    protected void afterViews() {

    }

    @Click(R.id.welcome_account_btn)
    void accountLogin() {
        AccountLoginActivity_.intent(this).start();
    }

    @Click(R.id.welcome_phone_btn)
    void phoneLogin() {
        // TODO 暂时不处理手机登录
    }

    @CheckedChange(R.id.welcome_protocol_ck)
    void checkedChange(boolean isChecked) {
        updateBtnEnableState(isChecked);
    }

    void updateBtnEnableState(boolean isEnable) {
        welcome_account_btn.setEnabled(isEnable);
        welcome_phone_btn.setEnabled(isEnable);
    }

    @Override
    protected void afterRestoreInstanceState(Bundle bundle) {
        updateBtnEnableState(welcome_protocol_ck.isChecked());
    }

    @Override
    public void rangeSeekBarValueChanged(float leftValue, float rightValue) {
        Util.print("leftValue=" + leftValue + " rightValue=" + rightValue);
        if (rightValue == NaN) {
            welcome_name_tv.setText(leftValue + "~" + "不限");
        } else {
            welcome_name_tv.setText(leftValue + "~" + rightValue);
        }
    }
}
