package day12.solved;

import java.sql.Connection;
import java.sql.PreparedStatement;

import day11.solved.ConnectionUtil;

public class TestUserUpdatePassword {
	 
    public static void main(String[] args) throws Exception {
 
        Connection connection = ConnectionUtil.getConnection();
 
        // Input
        String userName = "kingstonmessi";
        String email = "king@gmail.com";
        
       
        // DEPOSIT
        String query = "UPDATE students SET student_name=? WHERE email=?";
 
        PreparedStatement pst = connection.prepareStatement(query);
        pst.setString(1, userName);
        pst.setString(2, email);
 
        int rows = pst.executeUpdate();
        
        System.out.println("No of rows updated" + rows);
    }

}