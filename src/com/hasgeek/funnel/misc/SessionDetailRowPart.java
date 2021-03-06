package com.hasgeek.funnel.misc;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.hasgeek.funnel.R;


public class SessionDetailRowPart extends LinearLayout {

    public SessionDetailRowPart(Context context, String _title, String _speaker, int _roomcolor) {
        super(context);
        View v = LayoutInflater.from(context).inflate(R.layout.row_session_right_part, this, true);

        TextView title = (TextView) v.findViewById(R.id.tv_session_title);
        title.setText(_title);

        TextView speaker = (TextView) v.findViewById(R.id.tv_session_speaker);
        if (_speaker.equalsIgnoreCase("null")) {
            speaker.setVisibility(View.GONE);
        } else {
            speaker.setText(_speaker);
            speaker.setVisibility(View.VISIBLE);
        }

        View roomcolor = v.findViewById(R.id.iv_session_roomcolor);
        roomcolor.setBackgroundColor(_roomcolor);
    }

}
