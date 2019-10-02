package com.hxf.bean;

import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Notecase {
    private LinearLayout notecase;
    private Context thisview;

    private TextView title;
    private TextView context;
    private TextView date;

    LinearLayout.LayoutParams layoutParams;
    //接收note生成case
    private Note note;

    public Notecase(Note note,Context thisview) {
        super();
        this.note=note;
        this.thisview=thisview;

        //新建对象成组
        getContext();
        //设置容器属性
        setProp();
        //设置内容
        setContext();
        //添加到容器
        setNotecase();
    }

    private void getContext() {//新建对象
        this.title=new TextView(thisview);
        this.context=new TextView(thisview);
        this.date=new TextView(thisview);

        this.notecase=new LinearLayout(thisview);
    }

    private void setProp(){//设置容器属性
        layoutParams=new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.WRAP_CONTENT);
        layoutParams.height=300;
        layoutParams.gravity= Gravity.CENTER;//居中


        notecase.setVerticalGravity(LinearLayout.VERTICAL);
        notecase.setBackgroundColor(Color.GREEN);

        layoutParams.height=20;
        layoutParams.gravity=0x11;//居中

        title.setLayoutParams(layoutParams);
        title.setBackgroundColor(Color.RED);
        date.setBackgroundColor(Color.RED);
        date.setLayoutParams(layoutParams);

        layoutParams.height=40;
        context.setLayoutParams(layoutParams);

    }

    private void setContext(){//设置内容
        title.setText(note.getTitle());
        context.setText(note.getContext());
        date.setText(note.getDate());

    }

    private void setNotecase(){
//添加组件
        notecase.addView(title);
        notecase.addView(context);
        notecase.addView(date);
    }

    public LinearLayout getNotecase(){//获取case
        return this.notecase;
    }

}
