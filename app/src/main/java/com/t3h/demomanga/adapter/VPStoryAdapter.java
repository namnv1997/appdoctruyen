package com.t3h.demomanga.adapter;

import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.t3h.demomanga.R;
import com.t3h.demomanga.item.ItemStory;

/**
 * Created by NamNv on 13/04/2017.
 */

public class VPStoryAdapter extends PagerAdapter {
    private IFXStrory mInterf;

    public VPStoryAdapter(IFXStrory mInterf) {
        this.mInterf = mInterf;
    }

    @Override
    public int getCount() {
        return mInterf.getCountX();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        // quan trong, dung de tao view va do du lieu len view
        ItemStory itemFace = mInterf.getItemStoryX(position);
        LayoutInflater inflater = LayoutInflater.from(container.getContext());
        View contentView = inflater.inflate(R.layout.item_viewpager,container,false);

        TextView textViewTitle = (TextView) contentView.findViewById(R.id.tv_vp_title);
        TextView textViewContent = (TextView) contentView.findViewById(R.id.tv_vp_content_story);
        textViewTitle.setText(itemFace.getmTitle());
        textViewContent.setText(itemFace.getmContent());

        container.addView(contentView);
        return contentView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }

    public interface IFXStrory{
        int getCountX();
        ItemStory getItemStoryX(int position);
    }
}
