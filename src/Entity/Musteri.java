/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mehme
 */
public class Musteri {

    private int musteri_id;
    private int adres_id;
    private String ad;
    private String soyad;
    private int telefon;
    private int yas;

    public Musteri() {
    }

    public Musteri(int musteri_id, int adres_id, String ad, String soyad, int telefon, int yas) {
        this.musteri_id = musteri_id;
        this.adres_id = adres_id;
        this.ad = ad;
        this.soyad = soyad;
        this.telefon = telefon;
        this.yas = yas;
    }

    public int getMusteri_id() {
        return musteri_id;
    }

    public void setMusteri_id(int musteri_id) {
        this.musteri_id = musteri_id;
    }

    public int getAdres_id() {
        return adres_id;
    }

    public void setAdres_id(int adres_id) {
        this.adres_id = adres_id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getTelefon() {
        return telefon;
    }

    public void setTelefon(int telefon) {
        this.telefon = telefon;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

}
