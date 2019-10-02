package com.hxf.Service;

import com.hxf.bean.User;

public class Islogin {
    private boolean target;//保存登录信息
    private User user;//保存用户信息
    private static Islogin islogin;
    private Islogin() {
    }
    public static Islogin getIslogin(){
        if(islogin==null){
            islogin=new Islogin();
            islogin.setTarget(false);//初始化
            islogin.setUser(null);//初始化
            return islogin;
        }
        return islogin;
    }
    public void setUser(User user){
        this.user=user;
    }
    public User getUser(){
        return this.user;
    }

    public void setTarget(boolean target){
      this.target=target;
    }

    public boolean getTarget(){
        return this.target;
    }
}
