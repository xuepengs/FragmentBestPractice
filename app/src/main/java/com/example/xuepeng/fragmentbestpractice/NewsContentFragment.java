package com.example.xuepeng.fragmentbestpractice;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by xuepeng on 18/4/19.
 */

public class NewsContentFragment extends Fragment {
    private View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.fragment_news_content,container,false);
        return view;
    }

    public void refresh(String newsTitle,String newsContent){
        View visibilityLayout=view.findViewById(R.id.visibilityLayout);
        visibilityLayout.setVisibility(View.VISIBLE);
        TextView newsTitleText=view.findViewById(R.id.newsTitle);
        TextView newsContentText=view.findViewById(R.id.newsContent);
        newsTitleText.setText(newsTitle);
        newsContentText.setText(newsContent);

    }
}
