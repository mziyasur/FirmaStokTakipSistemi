/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mehme
 */
class Urun {
    private int kategori_id;
    private int urun_id;
    private String urunadı;
    private int urunadet;
    private int alısfiyat;
    private int satisfiyat;
    private String urunkodu;
    private String yuzeycesit;
    private int kalınlıkmm;
    public Urun() {
    }
    public Urun(int kategori_id, int urun_id, String urunadı, int urunadet, int alısfiyat, int satisfiyat, String urunkodu, String yuzeycesit, int kalınlıkmm) {
        this.kategori_id = kategori_id;
        this.urun_id = urun_id;
        this.urunadı = urunadı;
        this.urunadet = urunadet;
        this.alısfiyat = alısfiyat;
        this.satisfiyat = satisfiyat;
        this.urunkodu = urunkodu;
        this.yuzeycesit = yuzeycesit;
        this.kalınlıkmm = kalınlıkmm;
    }

    public int getKategori_id() {
        return kategori_id;
    }

    public void setKategori_id(int kategori_id) {
        this.kategori_id = kategori_id;
    }

    public int getUrun_id() {
        return urun_id;
    }

    public void setUrun_id(int urun_id) {
        this.urun_id = urun_id;
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

    public int getAlısfiyat() {
        return alısfiyat;
    }

    public void setAlısfiyat(int alısfiyat) {
        this.alısfiyat = alısfiyat;
    }

    public int getSatisfiyat() {
        return satisfiyat;
    }

    public void setSatisfiyat(int satisfiyat) {
        this.satisfiyat = satisfiyat;
    }

    public String getUrunkodu() {
        return urunkodu;
    }

    public void setUrunkodu(String urunkodu) {
        this.urunkodu = urunkodu;
    }

    public String getYuzeycesit() {
        return yuzeycesit;
    }

    public void setYuzeycesit(String yuzeycesit) {
        this.yuzeycesit = yuzeycesit;
    }

    public int getKalınlıkmm() {
        return kalınlıkmm;
    }

    public void setKalınlıkmm(int kalınlıkmm) {
        this.kalınlıkmm = kalınlıkmm;
    }

}
