package com.sft.wisdom.base;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EFragment;

import cn.sft.base.fragment.BaseFragment;
import cn.sft.listener.RecyclerOnScrollListener;

@EFragment
public class BFragment extends BaseFragment {

    @AfterViews
    public void afterViews() {

    }

    protected void initRecyclerView(RecyclerView mRecyclerView) {
        mRecyclerView.setLayoutManager(new StaggeredGridLayoutManager(1, 1));
        mRecyclerView.addOnScrollListener(new RecyclerOnScrollListener() {
            @Override
            public void onLoadNextPage(RecyclerView recyclerView) {
                BFragment.this.onLoadNextPage(recyclerView);
            }
        });
    }

    protected void onLoadNextPage(RecyclerView recyclerView) {

    }
}
