/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CRUD;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.*;

import javax.swing.JOptionPane;

/**
 *
 * @author Hamdi
 */
public class ConnectDB 
{
   private static Connection con;
   public static Connection connectdb()
   { 
       
   try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost/sakila";
			con = (Connection) DriverManager.getConnection(url, "root", "root");
			//System.out.println("connected"); //savoir s'il y a une connection

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			JOptionPane.showMessageDialog( null, "warning");

		}
		return con;
   }
}
