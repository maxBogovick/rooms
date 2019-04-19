package model.dao.impl;

import org.apache.commons.dbcp.BasicDataSource;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.naming.NoInitialContextException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionPoolHolder {
    private static ConnectionPoolHolder instance;
    private static volatile DataSource dataSource;

    private ConnectionPoolHolder(){
        getDataSource();
    }

    public static synchronized ConnectionPoolHolder getInstance(){
        if(instance == null){
            synchronized (ConnectionPoolHolder.class){
                if(instance == null){
                    instance = new ConnectionPoolHolder();
                }
            }
        }
        return instance;
    }


    public static DataSource getDataSource(){

        if (dataSource == null){
            synchronized (ConnectionPoolHolder.class) {
                if (dataSource == null) {
                    InitialContext initContext= null;
                    try {
                        initContext = new InitialContext();
                        dataSource = (DataSource) initContext.lookup("java:comp/env/jdbc/TestDB");
                    } catch (NamingException e) {
                        throw new RuntimeException("Error occur during configured datasource, cause: " + e.getMessage()); 
                    }
                }
            }
        }
        return dataSource;

    }

    public static Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }


}
