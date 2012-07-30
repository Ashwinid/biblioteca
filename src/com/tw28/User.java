package com.tw28;


public class User {
   private int user_id;
   private String user_name;
   private String password;
   private int contact;
   private String address;

    public void add(int user_id,String user_name,String password, String address,int contact) {

        this.user_id= user_id;
        this.user_name=user_name;
        this.password=password;
        this.contact=contact;
        this.address=address;

    }

    public boolean checkUserId(int uid) {
        for(int i=1;i<=3;i++)
            if( this.user_id== uid)
            {
                return true;

            }
        return false;
    }


    public boolean checkPassword(String entered_password) {
        for(int i=1;i<=3;i++)
            if( this.password== entered_password)
            {
                return true;

            }
        return false;
    }

}
