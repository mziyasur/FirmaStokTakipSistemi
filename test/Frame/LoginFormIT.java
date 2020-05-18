/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;

import Entity.Kullanici;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mehme
 */
public class LoginFormIT {

    public LoginFormIT() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class LoginForm.
     */
    @Test
    public void testusernamepassword() throws SQLException {

        String username = "admin";
        String password = "123";
        PreparedStatement ps;
        ResultSet rs;
        String kullaniciad = "select kullaniciad,kullanicisifre from kullanici";
        ps = DBConnection.getConnection().prepareStatement(kullaniciad);
        rs = ps.executeQuery();
        rs.next();
        assertEquals(username, rs.getString("kullaniciad"));
        assertEquals(password, rs.getString("kullanicisifre"));
        assertNotNull(rs.getString("kullaniciad"), rs.getString("kullanicisifre"));
    }

}
