package com.swxy.Dao;

import com.swxy.util.DbConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserDao {
    public List<User> getAll(String key) throws Exception{
        String sql;
        Connection connection= DbConnection.getConnection();
        PreparedStatement ps=null;
        if (null==key||key==""){
            sql="select * from t_user";
            ps=connection.prepareStatement(sql);
        } else {
            sql="select * from t_user where id like?";
            ps=connection.prepareStatement(sql);
            ps.setString(1,"%"+key+"%");
        }
        ResultSet rs=ps.executeQuery();
        List<User> list=new ArrayList<>();
        while (rs.next()){
            User user=new User();
            user.setId(rs.getInt("id"));
            user.setUsername(rs.getString("username"));
            user.setPassword(rs.getString("password"));
            user.setEmail(rs.getString("email"));
            list.add(user);
        }
        return list;
    }
    public boolean saveUser(User user) throws Exception {
        Connection connection= DbConnection.getConnection();
        String sql="insert into t_user(username,password,email) values(?,?,?)";
        PreparedStatement ps =connection.prepareStatement(sql);
        ps.setString(1,user.getUsername());
        ps.setString(2,user.getPassword());
        ps.setString(3,user.getEmail());
        int i=ps.executeUpdate();
        if (i>0){
            return  true;
        }else {
            return false;
        }
    }
}
