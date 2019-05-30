package com.stackroute.jdbcdemo;

import java.sql.*;

public class DataManager {
    public void getAllStudents() {
        //Register Driver

        Connection connection = null;
        ResultSet resultSet = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //obtain connection
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "Root@123");
            Statement statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from course");
//            resultSet.afterLast();
//            resultSet.absolute(4);
            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                System.out.println(id);
            }
        }
        catch(ClassNotFoundException cnfException){
            System.out.println("exception thrown"+ cnfException.getStackTrace());
        }
        catch (SQLException sqlException){
            System.out.println("exeception thrown"+ sqlException.getStackTrace());
        }
        finally
        {
            try
            {
                connection.close();
                resultSet.close();
            }
            catch (Exception ex) {
            }
        }
    }
}
