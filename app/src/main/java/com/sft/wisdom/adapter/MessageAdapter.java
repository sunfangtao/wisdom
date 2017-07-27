package com.sft.wisdom.adapter;

import android.content.Context;
import android.view.View;

import com.sft.wisdom.R;

import java.util.List;

import cn.sft.base.adapter.BaseAdapter;
import cn.sft.base.fragment.BaseFragment;

public class MessageAdapter extends BaseAdapter {

    public MessageAdapter(Context context, BaseFragment baseFragment, List<?> list) {
        super(context, baseFragment, list);
    }

    @Override
    public int onCreateViewLayoutID(int i) {
        return R.layout.recyclerview;
    }

    @Override
    public void onBindViewHolder(int viewType, View view, int position) {

    }
}
