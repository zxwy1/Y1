package com.swxy.controller;

import com.swxy.Dao.User;
import com.swxy.service.Usercheck;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
        private static final long serialVersionUID=1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String username=req.getParameter("username");
        String password=req.getParameter("password");
        String hello=req.getParameter("hello");
        String code=req.getParameter("code");
        System.out.println(username);
        System.out.println(password);

//
//        Usercheck usercheck=new Usercheck();
//
//       if (usercheck.validate(username,password)){
//           RequestDispatcher dispatcher = req.getRequestDispatcher("pages/user/login_success.jsp");
//           dispatcher.forward(req,resp);
//       } else {
//           resp.sendRedirect("pages/user/login.jsp");
//
//       }
//        Object key = req.getSession().getAttribute("KAPTCHA_SESSION_KEY");
//        System.out.println(key);
//
//        if (!code.equals(key)){
//            System.out.println("验证码错误");
//            req.getRequestDispatcher("pages/user/login.jsp").forward(req,resp);
//            return;
//        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
