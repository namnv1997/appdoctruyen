package com.t3h.demomanga.adapter;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.t3h.demomanga.R;
import com.t3h.demomanga.act.StoryActivity;
import com.t3h.demomanga.item.ItemStory;

/**
 * Created by NamNv on 02/04/2017.
 */

public class StoryAdapter extends BaseAdapter {
    private IFStrory mInterf;
    private int mPositionClick = -1;

    public StoryAdapter(IFStrory mInterf) {
        this.mInterf = mInterf;
    }



    @Override
    public int getCount() {
        return mInterf.getCount();
    }

    @Override
    public Object getItem(int position) {
        return mInterf.getItemStory(position);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        if(null == view){
            LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
            view = inflater.inflate(R.layout.item_story, viewGroup, false);
            view.setTag(position);
        }

        TextView tvStory = (TextView) view.findViewById(R.id.tv_story);
        ItemStory itemStory = mInterf.getItemStory(position);
        tvStory.setText(itemStory.getmTitle());

        if(mPositionClick == position){
            view.setBackgroundColor(Color.GREEN);

        }else {
            view.setBackgroundResource(000000);
        }
        return view;
    }

    public void setCurrentPosition(int position) {
        mPositionClick = position;
    }

    public interface IFStrory{
        int getCount();
        ItemStory getItemStory(int position);
    }
}
