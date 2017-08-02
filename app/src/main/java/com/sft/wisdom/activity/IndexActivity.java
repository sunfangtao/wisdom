package com.sft.wisdom.activity;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.sft.wisdom.R;
import com.sft.wisdom.base.BActivity;
import com.sft.wisdom.fragment.MessageFragment;
import com.sft.wisdom.fragment.MessageFragment_;
import com.sft.wisdom.fragment.MyFragment;
import com.sft.wisdom.fragment.MyFragment_;
import com.sft.wisdom.service.HelloService;

import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

import cn.sft.util.Util;

@EActivity(R.layout.activity_index)
public class IndexActivity extends BActivity implements RadioGroup.OnCheckedChangeListener {

    @ViewById(R.id.index_bottom_group)
    RadioGroup bottomGroup;
    @ViewById(R.id.index_bottom_message_rbtn)
    RadioButton messageRB;

    MessageFragment messageFragment;
    MyFragment myFragment;

    @Override
    protected void afterViews() {

        setRBDrawableSize(messageRB, 50, 50);
        initData(savedInstanceState);

        startService(new Intent(this, HelloService.class).putExtra("value", "sss"));
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        startService(new Intent(this, HelloService.class).putExtra("value", "aaa"));
    }

    private void initData(Bundle savedInstanceState) {

        bottomGroup.setOnCheckedChangeListener(this);

        if (savedInstanceState == null) {

            Bundle bundle = new Bundle();
            bundle.putString("key", "value");
            messageFragment = new MessageFragment_();
            myFragment = new MyFragment_();

            messageFragment.setArguments(bundle);
            myFragment.setArguments(bundle);

            FragmentManager fm = getFragmentManager();
            FragmentTransaction transaction = fm.beginTransaction();
            transaction.add(R.id.index_fragment_content, messageFragment, "messageFragment");
            transaction.add(R.id.index_fragment_content, myFragment, "myFragment");
            transaction.commit();

            messageRB.performClick();
        }
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {

        FragmentManager fm = getFragmentManager();
        // 开启Fragment事务
        FragmentTransaction transaction = fm.beginTransaction();
        transaction.hide(messageFragment);
        transaction.hide(myFragment);
        switch (checkedId) {
            case R.id.index_bottom_message_rbtn:
                transaction.show(messageFragment);
                break;
            // TODO 通讯录Fragment增加
            case R.id.index_bottom_my_btn:
                transaction.show(myFragment);
                break;
        }
        transaction.commit();
    }

    /**
     * @param rb
     * @param width  dp
     * @param height dp
     */
    void setRBDrawableSize(RadioButton rb, int width, int height) {
        Drawable drawableTop = rb.getCompoundDrawables()[1];
        drawableTop.setBounds(new Rect(drawableTop.getBounds().left, drawableTop.getBounds().top, Util.dp2px(this, width), Util.dp2px(this, height)));
        rb.setCompoundDrawables(null, drawableTop, null, null);
    }

    @Override
    protected void afterRestoreInstanceState(Bundle bundle) {
        Util.print("afterRestoreInstanceState");
        messageFragment = (MessageFragment) getFragmentManager().findFragmentByTag("messageFragment");
        myFragment = (MyFragment) getFragmentManager().findFragmentByTag("myFragment");
        // TODO 通讯录Fragment恢复
    }

}
