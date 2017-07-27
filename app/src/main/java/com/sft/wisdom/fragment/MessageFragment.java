package com.sft.wisdom.fragment;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.sft.wisdom.R;
import com.sft.wisdom.adapter.MessageAdapter;
import com.sft.wisdom.base.BFragment;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.ViewById;

import cn.sft.base.adapter.BaseAdapter;
import cn.sft.listener.RecyclerViewItemClickListener;

/**
 * Created by Administrator on 2017/2/27.
 */
@EFragment(R.layout.recyclerview)
public class MessageFragment extends BFragment implements RecyclerViewItemClickListener {

    @ViewById(R.id.recyclerview)
    RecyclerView recyclerView;

    MessageAdapter messageAdapter;

    @AfterViews
    public void afterViews() {
//        messageAdapter = new MessageAdapter(getActivity(), this, null);
//        initRecyclerView(recyclerView);
//        recyclerView.setAdapter(messageAdapter);
    }

    @Override
    public void onRecyclerViewItemClick(BaseAdapter baseAdapter, View view, int i) {

    }
}
