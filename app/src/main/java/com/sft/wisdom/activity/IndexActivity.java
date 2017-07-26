package com.sft.wisdom.activity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;

import com.sft.wisdom.R;
import com.sft.wisdom.base.BActivity;

import org.androidannotations.annotations.EActivity;

@EActivity(R.layout.activity_index)
public class IndexActivity extends BActivity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
    }
}
