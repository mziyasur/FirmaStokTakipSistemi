/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;

import Kargolama.Kargo;
import Kargolama.KargoFactory;
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
public class KargoTeslimIT extends KargoTeslim {

    public KargoTeslimIT() {
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
     * Test of main method, of class KargoTeslim.
     */
    @Test
    public void testaraskargola() {
        Kargo kargo1 = KargoFactory.createKargo("Aras");
        assertEquals("Siparişler Aras Kargo İle Teslim Edilecek.", kargo1.kargoYazdir());
        assertNotNull(kargo1.kargoYazdir());
    }
    @Test
    public void testMngkargola() {
        Kargo kargo2 = KargoFactory.createKargo("MNG");
        assertEquals("Siparişler MNG Kargo İle Teslim Edilecek.", kargo2.kargoYazdir());
        assertNotNull(kargo2.kargoYazdir());
    }
    @Test
    public void testPttkargola() {
        Kargo kargo3 = KargoFactory.createKargo("PTT");
        assertEquals("Siparişler PTT Kargo İle Teslim Edilecek.", kargo3.kargoYazdir());
        assertNotNull(kargo3.kargoYazdir());
    }
    @Test
    public void testUpskargola() {
        Kargo kargo4 = KargoFactory.createKargo("UPS");
        assertEquals("Siparişler UPS Kargo İle Teslim Edilecek.", kargo4.kargoYazdir());
        assertNotNull(kargo4.kargoYazdir());
    }
    @Test
    public void testYurtiçikargola() {
        Kargo kargo5 = KargoFactory.createKargo("Yurtiçi");
        assertEquals("Siparişler Yurtiçi Kargo İle Teslim Edilecek.", kargo5.kargoYazdir());
        assertNotNull(kargo5.kargoYazdir());

    }

}
