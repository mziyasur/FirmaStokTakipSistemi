/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author mehme
 */
public class MusteriDisplayIT {

    public MusteriDisplayIT() {
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

    @Test
    public void testMusteri() throws SQLException {
        int musteri_id = 4;
        int adres_id = 4;
        String ad = "TestMusteriAd";
        String soyad = "TestSoyad";
        int telefon = 05553334235;
        int yas = 35;
        String sqlmusteriekle = "insert into musteri(musteri_id,adres_id,ad,soyad,telefon,yas)values(?,?,?,?,?,?)";
        PreparedStatement ps = DBConnection.getConnection().prepareStatement(sqlmusteriekle);
        ps.setInt(1, musteri_id);
        ps.setInt(2, adres_id);
        ps.setString(3, ad);
        ps.setString(4, soyad);
        ps.setInt(5, telefon);
        ps.setInt(6, yas);
        //ps.execute();
        PreparedStatement pss;
        ResultSet rss;
        String sqlurun = "select * from musteri where musteri_id=" + musteri_id;
        pss = DBConnection.getConnection().prepareStatement(sqlurun);
        rss = pss.executeQuery();
        while (rss.next()) {
            assertEquals(musteri_id, rss.getInt("musteri_id"));
            assertNotNull(rss.getInt("musteri_id"));
            assertEquals(adres_id, rss.getInt("adres_id"));
            assertNotNull(rss.getInt("adres_id"));
            assertEquals(ad, rss.getString("ad"));
            assertNotNull(rss.getString("ad"));
            assertEquals(soyad, rss.getString("soyad"));
            assertNotNull(rss.getString("soyad"));
            assertEquals(telefon, rss.getInt("telefon"));
            assertNotNull(rss.getInt("telefon"));
            assertEquals(yas, rss.getInt("yas"));
            assertNotNull(rss.getInt("yas"));     
        }
    }
}
