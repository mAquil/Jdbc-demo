package com.stackroute;

import com.stackroute.jdbcdemo.*;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException, ClassNotFoundException
    {
        //Data manager
        DataManager dataManager= new DataManager();
        dataManager.getAllStudents();
        System.out.println("-------------------------------------------------------------------------");

        //object of DatabaseMetaDataDemo class
        DatabaseMetaDataDemo databaseMetaDataDemo=new DatabaseMetaDataDemo();
        databaseMetaDataDemo.getDatabaseMetaData();
        System.out.println("-------------------------------------------------------------------------");

        //prepared statement
        PreparedStatementDemo preparedStatementDemo=new PreparedStatementDemo();
        preparedStatementDemo.getCourseByName("core java");
        System.out.println("-------------------------------------------------------------------------");

        //object of ResultSetMetaDataDemo class
        ResultSetMetaDataDemo resultSetMetaDataDemo=new ResultSetMetaDataDemo();
        System.out.println("-------------------------------------------------------------------------");
        resultSetMetaDataDemo.getResultSetMetaData();
        System.out.println("-------------------------------------------------------------------------");

            //JdbcBatchProcessingDemo
        JdbcBatchProcessingDemo jdbcBatchProcessingDemo = new JdbcBatchProcessingDemo();
        jdbcBatchProcessingDemo.getJdbcBatchProcessing();
        System.out.println("-------------------------------------------------------------------------");

        //JdbcTransactionDemo
        JdbcTransactionDemo jdbcTransactionDemo = new JdbcTransactionDemo();
        jdbcTransactionDemo.getJdbcTransaction();
        System.out.println("-------------------------------------------------------------------------");

        //RowSetDemo
        RowsetDemo rowsetDemo=new RowsetDemo();
        rowsetDemo.getAllStudents();
        rowsetDemo.getStudentsByName();
        rowsetDemo.getStudentsByNameAndDuration();
        System.out.println("-------------------------------------------------------------------------");
    }
}
