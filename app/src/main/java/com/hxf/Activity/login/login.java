package com.hxf.Activity.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.hxf.Activity.Main;
import com.hxf.R;
import com.hxf.Service.Slogin;
import com.hxf.bean.User;

public class login extends AppCompatActivity {
    private Button loginbut;
    private Button createbut;
    private EditText unamet;
    private EditText upasst;

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
        this.finish();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.login);
        //按钮
        loginbut=this.findViewById(R.id.login);
        createbut=this.findViewById(R.id.create);
        //文本
        unamet=this.findViewById(R.id.uname);
        upasst=this.findViewById(R.id.upass);

        loginbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String uname=unamet.getText().toString();
                String upass=upasst.getText().toString();

                Slogin slogin=new Slogin("user","pass");
                int testlogin=slogin.login(uname,upass);
                Toast toast;
                if(testlogin==0){
                    Intent intent=new Intent();

                    intent.putExtra("uname",uname);
                    intent.putExtra("upass",upass);
                    //intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                    intent.setClass(login.this, Main.class);

                    startActivity(intent);
                }else if(testlogin==1){
                    toast=Toast.makeText(login.this,"密码错误",Toast.LENGTH_LONG);
                    toast.show();
                }else if(testlogin==2){
                    toast=Toast.makeText(login.this,"用户不存在",Toast.LENGTH_LONG);
                    toast.show();
                }

            }
        });

    }
}
