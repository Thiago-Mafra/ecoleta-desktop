
package utils;

import java.sql.Connection;
import java.sql.DriverManager;


public class Conexao {
    
    public static Connection getConexao(){
        
        try {
             return DriverManager.getConnection("jdbc:postgresql://localhost:5432/ecoleta", "postgres", "senai");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Não conectou");
        
        }
        
        
        
        return null;
        
    }
    
    
    
}
