package com.stackroute.jdbcdemo;

import java.sql.*;

public class PreparedStatementDemo {
    public void getCourseByName(String courseName) throws SQLException,ClassNotFoundException{
        //Register Driver

        try(Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "Root@123");PreparedStatement preparedStatement=connection.prepareStatement("select * from course where name=?")) {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //obtain connection
//            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "Root@123");
//            String query="select * from course where name=?";
//            PreparedStatement preparedStatement =connection.prepareStatement("query");
            preparedStatement.setString(1,courseName);
//            preparedStatement.executeQuery();
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String name=resultSet.getString(2);
                int duration=resultSet.getInt(3);
                System.out.println(id+" "+ name+" "+ duration);
            }
        }
        catch(ClassNotFoundException cnfException){
            System.out.println("exception thrown"+ cnfException.getStackTrace());
        }

        catch (SQLException sqlException){
            System.out.println("exeception thrown"+ sqlException.getStackTrace());
        }

    }

}
