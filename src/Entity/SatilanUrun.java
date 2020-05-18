
import java.sql.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mehme
 */
public class SatilanUrun {

    private int siparis_id;
    private int musteri_id;
    private int urun_id;
    private String ad;
    private String soyad;
    private String urunadı;
    private int urunadet;
    private Date siparistarihi;

    public SatilanUrun() {
    }

    public SatilanUrun(int siparis_id, int musteri_id, int urun_id, String ad, String soyad, String urunadı, int urunadet, Date siparistarihi) {
        this.siparis_id = siparis_id;
        this.musteri_id = musteri_id;
        this.urun_id = urun_id;
        this.ad = ad;
        this.soyad = soyad;
        this.urunadı = urunadı;
        this.urunadet = urunadet;
        this.siparistarihi = siparistarihi;
    }

    public int getMusteri_id() {
        return musteri_id;
    }

    public void setMusteri_id(int musteri_id) {
        this.musteri_id = musteri_id;
    }

    public int getSiparis_id() {
        return siparis_id;
    }

    public void setSiparis_id(int siparis_id) {
        this.siparis_id = siparis_id;
    }

    public int getUrun_id() {
        return urun_id;
    }

    public void setUrun_id(int urun_id) {
        this.urun_id = urun_id;
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

    public String getUrunadı() {
        return urunadı;
    }

    public void setUrunadı(String urunadı) {
        this.urunadı = urunadı;
    }

    public int getUrunadet() {
        return urunadet;
    }

    public void setUrunadet(int urunadet) {
        this.urunadet = urunadet;
    }

    public Date getSiparistarihi() {
        return siparistarihi;
    }

    public void setSiparistarihi(Date siparistarihi) {
        this.siparistarihi = siparistarihi;
    }

}
