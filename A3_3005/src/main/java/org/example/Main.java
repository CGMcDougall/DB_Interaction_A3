package org.example;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/A3";
        String user = "postgres";
        String pass = "admin";

        try{
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection(url,user,pass);

            Statement state = con.createStatement();


            //addStudent(state,"Phony", "McLiar","example@fake.com",("2000-11-11"));
            //updateStudentEmail(state,"11","real@email.com");
            deleteStudent(state,"11");
            getAllStudents(state);


            // deleteStudent(state,"10");

//            getAllStudents(state);
//            System.out.println("");
//            addStudent(state,"Phony", "McLiar","example@fake.com",("2000-11-11"));
//
//            deleteStudent(state,"3");
//            System.out.println("");
//            getAllStudents(state);



//           if(updateStudentEmail(state,"4","real@email.com"))getAllStudents(state);
//           deleteStudent(state,"4");
//           getAllStudents(state);
//
//            state.executeQuery("SELECT * FROM students");
//            ResultSet rs = state.getResultSet();
//            while(rs.next()){
//                System.out.println(rs.getString("first_name"));
//            }



        }
        catch(Exception e){
            System.out.println("ERROR");
        }
    }



    static boolean deleteStudent(Statement s, String s_id){
        try{
            String sql = String.format("DELETE FROM students WHERE '%s' = student_id",s_id);
            s.executeUpdate(sql);
            System.out.println("DELETING STUDENT WITH ID "+ s_id);
            return true;
        }
        catch (Exception e){return false;}
    }

    static boolean updateStudentEmail(Statement s, String s_id, String new_email){
        try{
            String sql = String.format("UPDATE students SET email = '%s' WHERE '%s' = student_id",new_email,s_id);
            s.executeUpdate(sql);
            System.out.println(String.format("UPDATING STUDENT %s TO HAVE %s AS THEIR EMAIL",s_id,new_email));
            return true;
        }
        catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    static boolean addStudent(Statement s, String fn, String ln, String e, String en_date){
        try{
            String sql =String.format("INSERT INTO students (first_name,last_name,email,enrollment_date) VALUES('%s','%s','%s','%s')", fn,ln,e,en_date);
            s.executeUpdate(sql);
            System.out.println("ADDING NEW STUDENT: " +fn);
            return true;
        }
        catch (Exception error) {
            System.out.println("Problem " + error);
            return false;
        }

    }
    static void getAllStudents(Statement s){
        try{
            s.executeQuery("SELECT * FROM students");
            ResultSet rs = s.getResultSet();
            while(rs.next()){
                System.out.print(rs.getInt("student_id") + "\t");
                System.out.print(rs.getString("first_name") + "\t" + rs.getString("last_name") + "\t");
                System.out.print(rs.getString("email") + "\t" + rs.getString("enrollment_date") + "\n");
            }
        }
        catch (Exception e) {}

    }

}