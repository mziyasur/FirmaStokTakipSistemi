/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;

import java.sql.Date;
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
public class SatilanUrunDisplayIT {

    public SatilanUrunDisplayIT() {
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
    public void testSatılanUrun() throws SQLException {

        int siparis_id = 5;
        int musteri_id = 3;
        int urun_id = 10;
        String siparistarihi = "2020-05-09";

        String sqlsatilanurun = "insert into musteri_urun(siparis_id,musteri_id,urun_id,siparistarihi)values(?,?,?,?)";

        PreparedStatement ps = DBConnection.getConnection().prepareStatement(sqlsatilanurun);
        ps.setInt(1, siparis_id);
        ps.setInt(2, musteri_id);
        ps.setInt(3, urun_id);
        ps.setDate(4, Date.valueOf(siparistarihi));
        //ps.execute();

        PreparedStatement pss;
        ResultSet rss;
        String sqlurun = "select * from musteri_urun where siparis_id=" + siparis_id;
        pss = DBConnection.getConnection().prepareStatement(sqlurun);
        rss = pss.executeQuery();
        while (rss.next()) {
            assertEquals(siparis_id, rss.getInt("siparis_id"));
            assertNotNull(rss.getInt("siparis_id"));
            assertEquals(musteri_id, rss.getInt("musteri_id"));
            assertNotNull(rss.getInt("musteri_id"));
            assertEquals(urun_id, rss.getInt("urun_id"));
            assertNotNull(rss.getInt("urun_id"));
            assertEquals(siparistarihi, rss.getString("siparistarihi"));
            assertNotNull(rss.getString("siparistarihi"));

        }

    }

}
