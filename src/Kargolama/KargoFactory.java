package Kargolama;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mehme
 */
public class KargoFactory {

    public static Kargo createKargo(String kargoAd) {
        Kargo kargo = null;

        if ("Aras".equalsIgnoreCase(kargoAd)) {
            kargo = new Aras();
        } else if ("MNG".equalsIgnoreCase(kargoAd)) {
            kargo = new MNG();
        } else if ("PTT".equalsIgnoreCase(kargoAd)) {
            kargo = new PTT();
        } else if ("UPS".equalsIgnoreCase(kargoAd)) {
            kargo = new UPS();
        } else if ("Yurtiçi".equalsIgnoreCase(kargoAd)) {
            kargo = new Yurtiçi();
        }

        return kargo;
    }

}
