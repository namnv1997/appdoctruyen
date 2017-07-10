package com.t3h.demomanga.act;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.t3h.demomanga.item.ItemTopic;
import com.t3h.demomanga.R;
import com.t3h.demomanga.adapter.TopicAdapter;

import java.util.ArrayList;
import java.util.List;

public class TopicActivity extends AppCompatActivity implements AdapterView.OnItemClickListener, TopicAdapter.ITopicAdapter {
    private ListView mlvTopic;
    private List<ItemTopic> mItemTopics;
    private TopicAdapter mAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.topic_main);

        initComponents();
    }

    private void initComponents() {
        mlvTopic = (ListView) findViewById(R.id.lv_topic);
        mlvTopic.setOnItemClickListener(this);
        mAdapter = new TopicAdapter(this);
        mlvTopic.setAdapter(mAdapter);
        initListTopic();
    }

    private void initListTopic() {
        mItemTopics = new ArrayList<>();
        mItemTopics.add(new ItemTopic(R.drawable.topic_vova, "VoVa"));
        mItemTopics.add(new ItemTopic(R.drawable.topic_tinhyeu, "Tinh Yeu"));
        mItemTopics.add(new ItemTopic(R.drawable.topic_game, "Game"));
        mItemTopics.add(new ItemTopic(R.drawable.topic_contrai, "Con Trai"));
        mItemTopics.add(new ItemTopic(R.drawable.topic_congai, "Con Gai"));
        mItemTopics.add(new ItemTopic(R.drawable.topic_dangian, "Dan Gian"));
        mItemTopics.add(new ItemTopic(R.drawable.topic_giadinh, "Gia Dinh"));
        mItemTopics.add(new ItemTopic(R.drawable.topic_tieulam, "Tieu Lam"));
    }


    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
        mAdapter.setCurrentPosition(position);
        mAdapter.notifyDataSetChanged();

        int topic = position;

        Intent intent = new Intent();
        intent.setClass(this, StoryActivity.class);
        intent.putExtra("TOPIC", topic);
        startActivity(intent);
    }


    @Override
    public int getCount() {
        if (null == mItemTopics) {
            return 0;
        }
        return mItemTopics.size();
    }

    @Override
    public ItemTopic getItemTopic(int position) {
        return mItemTopics.get(position);
    }
}
