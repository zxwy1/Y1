package com.swxy.controller;

import com.swxy.Dao.User;
import com.swxy.Dao.UserDao;
import com.swxy.service.UserInsert;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/RegistServlet")
public class RegistServlet extends HttpServlet {
    private static final long serialVersionUID=1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String username=req.getParameter("username");
        String password=req.getParameter("password");
        String repwd=req.getParameter("repwd");
        String email=req.getParameter("email");
        String yanzhengma=req.getParameter("yanzhengma");
        System.out.println(username);
        System.out.println(password);
        System.out.println(repwd);
        User user=new User();
//        UserDao dao=new UserDao();
//        List<User> all=null;
//        try {
//            all=dao.getAll("");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        for (User user1 : all) {
//            System.out.println(user1.getUsername());
//            if (user1.equals(username)){
//                JOptionPane.showMessageDialog(null,"该名称已被注册！");
//                return;
//            }
//        }

        if (username==null||username.equals("")){
            JOptionPane.showMessageDialog(null,"名称不能为空！");
            return;
        }
            if (password==null||password.equals("")){
                JOptionPane.showMessageDialog(null,"密码不能为空！");
                return;
            }
//            if (yanzhengma.contains("123")) {
//                JOptionPane.showMessageDialog(null,"验证码错误！");
//                return;
//            }
            if (repwd.equals(password)){
                    User user1=new User();
                    user1.setUsername(username);
                    user1.setPassword(password);
                    user1.setEmail(email);
                    UserInsert userInsert=new UserInsert();
                    try {



                            boolean b = userInsert.insert(user1);
                            if (b) {
                                JOptionPane.showMessageDialog(null, "注册成功1");
                                RequestDispatcher dispatcher = req.getRequestDispatcher("pages/user/login.jsp");
                                dispatcher.forward(req, resp);
                            } else {
                                JOptionPane.showMessageDialog(null, "注册失败！");

                        }
                    } catch (Exception e){
                    e.printStackTrace();
                }
                }
                else {
                    JOptionPane.showMessageDialog(null,"密码与上次不一样，请重新输入！");
                    return;
    }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }
}
