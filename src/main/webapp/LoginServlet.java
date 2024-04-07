package com.Xiongyuxuan.week5.demo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

@WebServlet(name = "LoginServlet", value = "/login")
public class LoginServlet extends HttpServlet {

    Connection con =null;
    @Override
    public void init() {
        String driver1 = getServletContext().getInitParameter("driver1");
        String url1 = getServletContext().getInitParameter("url1");
        String username = getServletContext().getInitParameter("username");
        String password = getServletContext().getInitParameter("password");

        try {
            Class.forName(driver1);
            con = DriverManager.getConnection(url1, username, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String str = "select * from usertable where username= 'Xiongyuxuan' and password= '2022211001000423'";
        try {
            ResultSet rus=con.createStatement().executeQuery(str);
            PrintWriter writer=response.getWriter();
            if (rus.next()){
            writer.println("LOGIN SUCCESS !!!");
            writer.println("WELCOME,Xiongyuxuan");}
            else{
                writer.println("LOGIN ERROR!!!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out =response.getWriter();

        out.println("<HTML>");
        out.println("<HEAD><TITLE>Usingervlets</TITLE></HEAD>");
        out.println("<BODY BGCOLOR=#123123>");

    }
}
