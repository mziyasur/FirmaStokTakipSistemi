package StokTemini;

import StokTemini.Handler;
import StokTemini.Personel;
import StokTemini.PersonelType;

public class DepoMuduruHandler extends PersonelHandler implements Handler {

    public DepoMuduruHandler(String handlerName) {
        super(handlerName);
    }

    
    public String[] process(Personel personel) {
         return super.process(PersonelType.DepoMuduru, personel);
    }
}
