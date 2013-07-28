/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sna.connection;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Danilo
 */
public class ConnectionFactoryHSQL {
     private Connection conn;
    private static ConnectionFactoryHSQL singleton;
    
    
    public ConnectionFactoryHSQL() throws Exception{
        String path = System.getProperty("user.dir") + "\\connectionfactory";
        conn = DriverManager.getConnection("jdbc:hsqldb:file:"+path, "sa", "");
    }
    
    public static ConnectionFactoryHSQL getInstance()throws Exception{
        if(singleton == null){
            singleton = new ConnectionFactoryHSQL();
        }
        return singleton;
    }
    
    public Connection getConnectionFactory(){
        return conn;
    }
    
    
}
