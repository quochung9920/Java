package com.nqh.jdbcdemo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
        System.out.println("Server is running...");
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("Driver is loaded...");

        System.out.println("Connecting to database...");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/saledb", "root", "090900");
        System.out.println("Connected to database...");

        // String sql = "INSERT INTO category (name) VALUES ('PHU KIEN')";
        // Statement stm = conn.createStatement();
        // // executeUpdate() là định nghĩa dữ liệu (Thêm, sửa, xoá dữ liệu) trả về true/false
        // int kq = stm.executeUpdate(sql);
        // System.out.println("Inserted: " + kq);

        // String sql = "SELECT * FROM category";
        // Statement stm = conn.createStatement();
        // // executeQuery() là thao tác với dữ liệu (Lấy dữ liệu) trả về các dòng dữ liệu
        // ResultSet rs = stm.executeQuery(sql);
        // while (rs.next()) {
        //     // Tên chỉ số của cột trong bảng hoặc tên cột của bảng dưới cơ sở dữ liệu
        //     int id = rs.getInt("id");
        //     String name = rs.getString("name");
        //     System.out.println(id + "- " + name);
        // }
        
        // String sql = "SELECT * FROM product WHERE name like concat('%', ?,'%')";
        // PreparedStatement stm = conn.prepareStatement(sql);
        // stm.setString(1, "iPhone");
        // ResultSet rs = stm.executeQuery();
        // while (rs.next()) {
        //     System.out.printf("%d: %s - %.2f\n", 
        //         rs.getInt("id"), 
        //         rs.getString("name"), 
        //         rs.getDouble("price"));
        // }
        
        // CallableStatement stm = conn.prepareCall("{call countCategory(?)}");
        // stm.registerOutParameter(1, Types.INTEGER);
        // stm.execute();
        // System.out.printf("So luong category: %d", stm.getInt(1));
        
        // CallableStatement stm = conn.prepareCall("{call getCateById(?)}");
        // stm.setInt(1, 3);
        // ResultSet rs = stm.executeQuery();
        // while (rs.next()) {
        //     System.out.printf("%d: %s\n", 
        //         rs.getInt("id"), 
        //         rs.getString("name"));
        // }
        

        // Statement stm = conn.createStatement();

        // if(conn.getMetaData().supportsBatchUpdates()){
        //     try{

        //         conn.setAutoCommit(false);

        //         final long startTime = System.currentTimeMillis();
        //         for(int i = 11; i < 100001; i++){
        //             String sql = "INSERT INTO category (name) VALUES ('PHU KIEN" + i + "')";
        //             stm.addBatch(sql);
        //         }
        //         stm.executeBatch();

        //         final long endTime = System.currentTimeMillis();
        //         System.out.println("Thoi gian thuc hien: " + (endTime - startTime) + "ms");
                
        //         // int k = stm.executeUpdate("INSERT INTO category (name) VALUES ('PHU KIEN 1')");
        //         // stm.executeUpdate("INSERT INTO category (name) VALUES ('PHU KIEN 2')");
        //         // if(k > 0){
        //         //     System.out.println("Success");
        //         // }
                
    
        //         conn.commit();
        //     } catch (SQLException e) {
        //         System.err.println(e.getMessage());
        //         conn.rollback();
        //     }
    
        // }
       

        // stm.close();
        conn.close();
    }
}
