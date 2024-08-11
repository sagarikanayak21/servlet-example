package com.st.dao;

public class UserDAO implements UserDAOI{
    public boolean findUser(String password){
        //here we will connect with the DB 
        return password.equals("12345678");
    }
}
