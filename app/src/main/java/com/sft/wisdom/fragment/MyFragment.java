package com.sft.wisdom.fragment;

import android.widget.TextView;

import com.sft.wisdom.R;
import com.sft.wisdom.activity.SettingActivity_;
import com.sft.wisdom.base.BFragment;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.ViewById;

import cn.sft.util.MyHandler;

import static com.sft.wisdom.R.id.fragment_my_setting_tv;

@EFragment(R.layout.fragment_my)
public class MyFragment extends BFragment {

    @ViewById(R.id.fragment_my_setting_tv)
    TextView settingTV;

    private int qqqq = 10;

    @Override
    public void afterViews() {
        new MyHandler(2000) {
            @Override
            public void run() {
                qqqq = 100;
                settingTV.setText("Setting");
            }
        };
    }

    public int getI() {
        return qqqq;
    }

    @Click(fragment_my_setting_tv)
    void settingClick() {
        SettingActivity_.intent(this).start();
    }
}
