package com.t3h.demomanga.item;

/**
 * Created by NamNv on 31/03/2017.
 */

public class ItemStory {
    private String mTitle;
    private String mContent;

    public ItemStory(String mName, String mContent) {
        this.mTitle = mName;
        this.mContent = mContent;
    }

    public String getmTitle() {
        return mTitle;
    }

    public String getmContent() {
        return mContent;
    }
}
