package com.zxx.jdbc;

import java.sql.*;

/**
 * TODO
 *
 * @author Administrator
 * @date 2020/11/19
 */
public class JdbcDemo {
    public static void main(String[] args) {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql:///stus","root","abc@123");
            st = conn.createStatement();
            String sql = "insert into account values(null,'test',1000)";
            int count = st.executeUpdate(sql);
            if(count > 0 ){
                System.out.println("成功");
            }else {
                System.out.println("失败");
            }
            sql = "select * from account";
            rs = st.executeQuery(sql);
            while(rs.next()){
                System.out.println(rs.getString("name") + " " + rs.getDouble("money"));
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(st != null){
                try {
                    st.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(conn != null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
