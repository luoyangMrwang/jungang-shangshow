package com.shangshow.showlive.controller.liveshow.widget;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by taolong on 16/8/15.
 */
public class GiftViewPagerAdapter extends PagerAdapter {
    private List<String> mTitleList;
    private List<View> mViewList;

    public GiftViewPagerAdapter(List<View> mViewList, List<String> mTitleList) {
        this.mTitleList = mTitleList;
        this.mViewList = mViewList;
    }

    @Override
    public int getCount() {
        return mViewList.size();//页卡数
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;//官方推荐写法
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        container.addView(mViewList.get(position));//添加页卡
        return mViewList.get(position);
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView(mViewList.get(position));//删除页卡
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTitleList.get(position);//页卡标题
    }

}
