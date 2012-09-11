package com.dozuki.ifixit.view.ui;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.dozuki.ifixit.R;
import com.dozuki.ifixit.view.model.TopicNode;

public class TopicListRowView extends LinearLayout {
   private TextView mTopicName;
   private TopicNode mTopic;
  // private ImageView mNextIcon;
   
   public TopicListRowView(Context context) {
      super(context);

      LayoutInflater inflater = (LayoutInflater)context.getSystemService(
       Context.LAYOUT_INFLATER_SERVICE);
      inflater.inflate(R.layout.topic_list_row, this, true);

      mTopicName = (TextView)findViewById(R.id.topic_title);
      //mNextIcon = (ImageView)findViewById(R.id.next_icon);
   }

   public void setTopic(TopicNode topic) {
      mTopic = topic;
      mTopicName.setText(mTopic.getName());
      
    /*  if (!mTopic.isLeaf()) {
         mNextIcon.setVisibility(VISIBLE);
      } else {
    	 mNextIcon.setVisibility(GONE);
      }*/
   }
   
   public void setCurrentTopicStyle() {
      if (mTopic.isLeaf()) {
         setBackgroundColor(Color.parseColor("#CCCCCC"));
      }
   }

   public void clearCurrentTopicStyle() {
      setBackgroundColor(Color.WHITE);
   }
}