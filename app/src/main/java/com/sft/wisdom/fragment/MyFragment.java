package com.sft.wisdom.fragment;

import com.sft.wisdom.R;
import com.sft.wisdom.activity.SettingActivity_;
import com.sft.wisdom.base.BFragment;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EFragment;

@EFragment(R.layout.fragment_my)
public class MyFragment extends BFragment {

    @Click(R.id.fragment_my_setting_tv)
    void settingClick() {
        SettingActivity_.intent(this).start();
    }
}
