package Frame;




import util.*;
import java.sql.Connection;
import java.sql.DriverManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mehme
 */
public class DBConnection {

    public static Connection getConnection() {

        Connection con = null;
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "123");

            //System.out.println("Bağlantı başarılı..");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());

        }
        return con;
    }

}
