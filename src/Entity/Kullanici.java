/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author mehme
 */
public class Kullanici {

    private int kullanici_id;
    private String kullaniciad;
    private String kullaniciSifre;

    public Kullanici() {
    }

    public Kullanici(int kullanici_id, String kullaniciad, String kullaniciSifre) {
        this.kullanici_id = kullanici_id;
        this.kullaniciad = kullaniciad;
        this.kullaniciSifre = kullaniciSifre;
    }

    public int getKullanici_id() {
        return kullanici_id;
    }

    public void setKullanici_id(int kullanici_id) {
        this.kullanici_id = kullanici_id;
    }

    public String getKullaniciad() {
        return kullaniciad;
    }

    public void setKullaniciad(String kullaniciad) {
        this.kullaniciad = kullaniciad;
    }

    public String getKullaniciSifre() {
        return kullaniciSifre;
    }

    public void setKullaniciSifre(String kullaniciSifre) {
        this.kullaniciSifre = kullaniciSifre;
    }

}
