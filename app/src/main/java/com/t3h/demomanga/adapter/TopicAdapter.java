package com.t3h.demomanga.adapter;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.t3h.demomanga.item.ItemTopic;
import com.t3h.demomanga.R;

/**
 * Created by NamNv on 31/03/2017.
 */

public class TopicAdapter extends BaseAdapter {
    private ITopicAdapter mInterf;
    private int mPositionClick = -1;

    public TopicAdapter(ITopicAdapter mInterf) {
        this.mInterf = mInterf;
    }

    @Override
    public int getCount() {
        return mInterf.getCount();
    }

    @Override
    public Object getItem(int position) {
        return mInterf.getItemTopic(position);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        if (null == view){
            LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
            view = inflater.inflate(R.layout.item_topic, viewGroup, false);
            view.setTag(position);
        }

        TextView tvTopic = (TextView) view.findViewById(R.id.tv_topic);
        ImageView ivTopic = (ImageView) view.findViewById(R.id.iv_topic);

        ItemTopic itemTopic = mInterf.getItemTopic(position);
        tvTopic.setText(itemTopic.getmTopic());
        ivTopic.setImageResource(itemTopic.getmIdImage());

        if(mPositionClick == position){
            view.setBackgroundColor(Color.GREEN);

        }else {
            view.setBackgroundResource(000000);
        }

        return view;

    }


    public void setCurrentPosition(int position){
        mPositionClick = position;
    }
    public interface ITopicAdapter{
        int getCount();
        ItemTopic getItemTopic(int position);
    }


}
