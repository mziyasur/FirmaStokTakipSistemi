package StokTemini;

public class Personel {

    public static final String GEREKLİ_YETKİ_SAGLANAMADI = "Gerekli Yetki Sağlanamadı Stok Temin Edilemiyor.";

    public static final String İŞLEM_STOK_ALIMCIYA_ULAŞTI_STOK_ALINACAK = " İşlem Stok Alımcıya ulaştı > Stok %s tarafından temin edilecek.\n";

    public static final String YETKİ_YETERLİ_DEĞİL_UST_MAKAMA_İLET = "%s > Yetki Yeterli Değil Stok Alımı İşi Üst Makama İletildi. > %s";

    private String personelName;

    private PersonelType personelType;

    private String personelPath;

    public Personel(String personelName, PersonelType personelType, String personelPath) {
        this.personelName = personelName;
        this.personelType = personelType;
        this.personelPath = personelPath;
    }

    public String getPersonelName() {
        return personelName;
    }

    public PersonelType getPersonelType() {
        return personelType;
    }

    public String getPersonelPath() {
        return personelPath;
    }

}
