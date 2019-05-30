package com.stackroute.jdbcdemo;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.*;

public class RowsetDemo {
    public  void getAllStudents() {
        Connection con=null;
        Statement stmt=null;
        try {

            //register driver
            Class c=Class.forName("com.mysql.cj.jdbc.Driver");

            //Creating and Executing RowSet

            con = DriverManager.getConnection( "jdbc:mysql://localhost:3306/test","root","Root@123");
            // Creating statement
            stmt=con.createStatement();
            // Executing query
            ResultSet rs=stmt.executeQuery("select * from course");

            CachedRowSet rowSet = RowSetProvider.newFactory().createCachedRowSet();
            rowSet.populate(rs);
            while (rowSet.next()) {
                int id = rowSet.getInt(1);
                System.out.print(id);
                String s=rowSet.getString(2);
                System.out.print(" "+s);
                String s2=rowSet.getString(3);
                System.out.print(" "+s2);
                System.out.println("");
            }
        }
        catch(ClassNotFoundException classNotFound)
        {
            System.out.println("Exception thrown1:"+classNotFound.getStackTrace());
        }
        catch (SQLException sqlException)
        {
            System.out.println("Exception thrown2:"+sqlException.getStackTrace());
        }
        finally {
            try {
                if (stmt != null) stmt.close();
                if (con != null) con.close();
            }
            catch (Exception ex) {
            }
        }
    }
    public  void getStudentsByName() {
        Connection con=null;
        Statement stmt=null;
        try {

            //register driver
            Class c=Class.forName("com.mysql.cj.jdbc.Driver");

            //Creating and Executing RowSet

            con = DriverManager.getConnection( "jdbc:mysql://localhost:3306/test","root","Root@123");
            // Creating statement
            stmt=con.createStatement();
            // Executing query
            ResultSet rs=stmt.executeQuery("select * from course where name='Java'");

            CachedRowSet rowSet = RowSetProvider.newFactory().createCachedRowSet();
            rowSet.populate(rs);
            while (rowSet.next()) {
                int id = rowSet.getInt(1);
                System.out.print(id);
                String s=rowSet.getString(2);
                System.out.print(" "+s);
                String s2=rowSet.getString(3);
                System.out.print(" "+s2);
                System.out.println("");
            }
        }
        catch(ClassNotFoundException classNotFound)
        {
            System.out.println("Exception thrown1:"+classNotFound.getStackTrace());
        }
        catch (SQLException sqlException)
        {
            System.out.println("Exception thrown2:"+sqlException.getStackTrace());
        }
        finally {
            try {
                if (stmt != null) stmt.close();
                if (con != null) con.close();
            }
            catch (Exception ex) {
            }
        }
    }

    //third method
    public  void getStudentsByNameAndDuration() {
        Connection con=null;
        Statement stmt=null;
        try {

            //register driver
            Class c=Class.forName("com.mysql.cj.jdbc.Driver");

            //Creating and Executing RowSet

            con = DriverManager.getConnection( "jdbc:mysql://localhost:3306/test","root","Root@123");
            // Creating statement
            stmt=con.createStatement();
            // Executing query
            ResultSet rs=stmt.executeQuery("select * from course where name='Angular' and duration=6");

            CachedRowSet rowSet = RowSetProvider.newFactory().createCachedRowSet();
            rowSet.populate(rs);
            while (rowSet.next()) {
                int id = rowSet.getInt(1);
                System.out.print(id);
                String s=rowSet.getString(2);
                System.out.print(" "+s);
                String s2=rowSet.getString(3);
                System.out.print(" "+s2);
                System.out.println("");
            }
        }
        catch(ClassNotFoundException classNotFound)
        {
            System.out.println("Exception thrown1:"+classNotFound.getStackTrace());
        }
        catch (SQLException sqlException)
        {
            System.out.println("Exception thrown2:"+sqlException.getStackTrace());
        }
        finally {
            try {
                if (stmt != null) stmt.close();
                if (con != null) con.close();
            }
            catch (Exception ex) {
            }
        }
    }
}
