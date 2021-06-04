/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dabar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author acer
 */
public class Koneksi {
    private static Connection databasekoneksi;
    public static Connection koneksiDB() throws SQLException {
        if (databasekoneksi == null){
           try{
            String DB   = "jdbc:mysql://localhost:3306/apdabar";
            String user = "root";
            String pass = "";
            
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            databasekoneksi = (Connection) DriverManager.getConnection(DB, user, pass);
        }catch (SQLException e){
                JOptionPane.showMessageDialog(null, "KONEKSI GAGAL");
                }
    } return databasekoneksi;
   }
}
