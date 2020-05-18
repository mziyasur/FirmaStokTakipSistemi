package StokTemini;

import StokTemini.Personel;
import StokTemini.PersonelType;
import StokTemini.Handler;
import java.util.Arrays;

public class PersonelHandler {

    private Handler handler;

    private String handlerName;

    public PersonelHandler(String handlerName) {
        this.handlerName = handlerName;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    protected String[] process(PersonelType personelType, Personel personel) {
        if (personelType.equals(personel.getPersonelType())) {
            String[] x = new String[1];
            x[0] = String.format(Personel.İŞLEM_STOK_ALIMCIYA_ULAŞTI_STOK_ALINACAK, personel.getPersonelType(), handlerName );
            return x;

            //System.out.println(String.format(Personel.İŞLEM_STOK_ALIMCIYA_ULAŞTI_STOK_ALINACAK, personel.getPersonelType(), handlerName));
        } else if (handler != null) {
            String[] result = new String[2];
            result[0] = String.format(Personel.YETKİ_YETERLİ_DEĞİL_UST_MAKAMA_İLET, handlerName, handler.getHandlerName() + "\n");
            result[1] = Arrays.toString(handler.process(personel));

            return result;

            //return String.format(Personel.YETKİ_YETERLİ_DEĞİL_UST_MAKAMA_İLET, handlerName, handler.getHandlerName() + "\n") && handler.process(personel);
            //handler.process(personel);
            //System.out.println(String.format(Personel.YETKİ_YETERLİ_DEĞİL_UST_MAKAMA_İLET, handlerName, handler.getHandlerName()));
        } else {
            String[] resulta = new String[1];
            resulta[0] = Personel.GEREKLİ_YETKİ_SAGLANAMADI;

            return resulta;
        }
    }

    public String getHandlerName() {
        return this.handlerName;
    }
}
