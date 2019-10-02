package com.hxf.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import com.hxf.Activity.login.login;
import com.hxf.Activity.userinfo.my;
import com.hxf.R;
import com.hxf.Service.Islogin;
import com.hxf.bean.Note;
import com.hxf.bean.Notecase;

public class Main extends AppCompatActivity {
    private TextView my;
    private TextView index;
    private TextView shop;
    private LinearLayout context;
    private static Islogin islogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_a);

        my=this.findViewById(R.id.my);
        shop=this.findViewById(R.id.shop);
        index=this.findViewById(R.id.index);




        TextView tt=new TextView(this);

        my.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                islogin=Islogin.getIslogin();
                Intent intent=new Intent();

                if(islogin.getTarget()){

                    intent.setClass(Main.this, com.hxf.Activity.userinfo.my.class);
                }else {
                    intent.setClass(Main.this, login.class);
                }

                startActivity(intent);
            }
        });

        shop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Main.this.exit();
            }
        });

        index.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context=Main.this.findViewById(R.id.context);
                Note note=new Note();
                note.setTitle("this is aa");
                note.setContext("我是内容");
                note.setDate("2019.9.30");

                Notecase notecase=new Notecase(note,Main.this);

                LinearLayout linearLayout=notecase.getNotecase();

                context.addView(linearLayout);

            }
        });


    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("finish", "onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("finish", "onDestroy");
    }

    private void exit(){
       // super.finish();
        this.finish();
    }

    @Override
    public void finish() {
        super.finish();

    }
}
