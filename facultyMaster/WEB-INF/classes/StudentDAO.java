package com.sn.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import com.sn.model.Student;

public class StudentDAO implements StudentDAOI{
    public Student getStudentById(int sid){
        try{
            String sql = "select * from student where sid = "+sid+" ";

            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","sys as sysdba","admin");

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            Student s = new Student();
            while(rs.next()){
                s.setSid(rs.getInt(1));
                s.setFName(rs.getString(2));
                s.setLName(rs.getString(3));
                s.setCourse(rs.getString(4));
                s.setDept(rs.getString(5));
                s.setGender(rs.getString(6));
                s.setAddress(rs.getString(7));
                System.out.println(s.getFName());
            }
            return s;
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Exception occured");
        }
        return null;
    }
}