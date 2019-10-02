package com.hxf.Activity.userinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.hxf.R;
import com.hxf.Service.Islogin;
import com.hxf.bean.User;

public class my extends AppCompatActivity {
    private TextView myuname;
    private TextView myupass;
    private User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.my_a);

        myuname=this.findViewById(R.id.myuname);
        myupass=this.findViewById(R.id.myupass);

        user= Islogin.getIslogin().getUser();

        myuname.setText(user.getUname());
        myupass.setText(user.getUpass());

    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
        this.finish();
    }
}
