package com.hxf.Service;

import com.hxf.bean.User;

public class Slogin {
    private String uname;
    private String upass;


    public Slogin(String uname, String upass) {
        this.uname = uname;
        this.upass = upass;
    }

    public int login(String uname,String upass){

        if(uname.equals(this.uname)){
            if(upass.equals(this.upass)){
                Islogin islogin=Islogin.getIslogin();
                islogin.setTarget(true);
                User user=new User();
                user.setUname(uname);
                user.setUpass(upass);
                islogin.setUser(user);
                return 0;
            }
            return 1;
        }
        return 2;
    }


}
