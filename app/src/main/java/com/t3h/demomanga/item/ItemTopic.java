package com.t3h.demomanga.item;

import java.util.List;

/**
 * Created by NamNv on 31/03/2017.
 */

public class ItemTopic {
    private int mIdImage;
    private String mTopic;

    public int getmIdImage() {
        return mIdImage;
    }

    public String getmTopic() {
        return mTopic;
    }

    public ItemTopic(int mIdImage, String mTopic) {
        this.mIdImage = mIdImage;
        this.mTopic = mTopic;
    }
}
