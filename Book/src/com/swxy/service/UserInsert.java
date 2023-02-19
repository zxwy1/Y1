package com.swxy.service;

import com.swxy.Dao.User;
import com.swxy.util.DbConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UserInsert {
    public boolean insert(User user) throws Exception{
        Connection conn= DbConnection.getConnection();
        String sql="insert into t_user(username,password,email) values(?,?,?)";
        PreparedStatement ps=conn.prepareStatement(sql);
        ps.setString(1,user.getUsername());
        ps.setString(2,user.getPassword());
        ps.setString(3,user.getEmail());
        int i=ps.executeUpdate();
        if (i>0){
            return true;
        } else {
            return false;
        }
    }
}
