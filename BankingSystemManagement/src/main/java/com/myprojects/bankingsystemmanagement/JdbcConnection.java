/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myprojects.bankingsystemmanagement;


import java.sql.*;

/**
 *
 * @author admin
 */
public class JdbcConnection {
      Connection c;
    Statement s;
    public JdbcConnection(){  
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            c =DriverManager.getConnection("jdbc:mysql:///project2","root","");    
            s =c.createStatement();  
            
        }catch(ClassNotFoundException | SQLException e){ 
            System.out.println(e);
        }  
    }  
}
