/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
public class UrunEkleDisplayIT {

    public UrunEkleDisplayIT() {
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
    public void testUrun() throws SQLException {
        int kategori_id = 10;
        int urun_id = 14;
        String urunadı = "PALMİRA-500";
        int urunadet = 100;
        int alısfiyat = 250;
        int satısfiyat = 350;
        String urunkodu = "EC-500-D";
        String yuzeycesit = "DEKORLU";
        int kalınlıkmm = 60;
        String sqlurunekle = "insert into urun(kategori_id,urun_id,urunadı,urunadet,alısfiyat,satısfiyat,urunkodu,yuzeycesit,kalınlıkmm)values(?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps = DBConnection.getConnection().prepareStatement(sqlurunekle);
        ps.setInt(1, kategori_id);
        ps.setInt(2, urun_id);
        ps.setString(3, urunadı);
        ps.setInt(4, urunadet);
        ps.setInt(5, alısfiyat);
        ps.setInt(6, satısfiyat);
        ps.setString(7, urunkodu);
        ps.setString(8, yuzeycesit);
        ps.setInt(9, kalınlıkmm);
        ps.execute();
        PreparedStatement pss;
        ResultSet rss;
        String sqlurun = "select * from urun where urun_id=" + urun_id;
        pss = DBConnection.getConnection().prepareStatement(sqlurun);
        rss = pss.executeQuery();
        while (rss.next()) {
            assertEquals(kategori_id, rss.getInt("kategori_id"));
            assertNotNull(rss.getInt("kategori_id"));
            assertEquals(urun_id, rss.getInt("urun_id"));
            assertNotNull(rss.getInt("urun_id"));
            assertEquals(urunadı, rss.getString("urunadı"));
            assertNotNull(rss.getString("urunadı"));
            assertEquals(urunadet, rss.getInt("urunadet"));
            assertNotNull(rss.getInt("urunadet"));
            assertEquals(alısfiyat, rss.getInt("alısfiyat"));
            assertNotNull(rss.getInt("alısfiyat"));
            assertEquals(satısfiyat, rss.getInt("satısfiyat"));
            assertNotNull(rss.getInt("satısfiyat"));
            assertEquals(urunkodu, rss.getString("urunkodu"));
            assertNotNull(rss.getString("urunkodu"));
            assertEquals(yuzeycesit, rss.getString("yuzeycesit"));
            assertNotNull(rss.getString("yuzeycesit"));
            assertEquals(kalınlıkmm, rss.getInt("kalınlıkmm"));
            assertNotNull(rss.getInt("kalınlıkmm"));
        }

    }

}
