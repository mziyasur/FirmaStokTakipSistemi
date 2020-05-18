package StokTemini;

import StokTemini.Handler;
import StokTemini.Personel;
import StokTemini.PersonelType;

public class SatinAlmaMuduruHandler extends PersonelHandler implements Handler {

    public SatinAlmaMuduruHandler(String handlerName) {
        super(handlerName);
    }

    public String[] process(Personel personel) {
        return super.process(PersonelType.SatinAlmaMuduru, personel);
    }

    
}
