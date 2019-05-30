package com.stackroute.jdbcdemo;

import java.sql.*;

public class ResultSetMetaDataDemo {

    public void getResultSetMetaData() {
        try {

            //register driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //obtain connection
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "Root@123");
            PreparedStatement stmt = connection.prepareStatement("select * from course where name='angular' and duration=4");
            ResultSetMetaData rsmd = stmt.getMetaData();

            System.out.println("Total columns: " + rsmd.getColumnCount());
            System.out.println("Column Name of 1st column: " + rsmd.getColumnName(1));
            System.out.println("Column Type Name of 1st column: " + rsmd.getColumnTypeName(1));
            System.out.println("Column Type Name of last column: " + rsmd.getColumnName(3));
            System.out.println("Name of catalog is: " + rsmd.getCatalogName(3));
            System.out.println("Name of table is: " + rsmd.getTableName(1));

            connection.close();
        }
        catch (ClassNotFoundException classNotFound) {
            System.out.println("Exception thrown:" + classNotFound.getStackTrace());
        } catch (SQLException sqlException) {
            System.out.println("Exception thrown1:" + sqlException.getStackTrace());
        }
    }
}
