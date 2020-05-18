package StokTemini;

import StokTemini.Handler;
import StokTemini.Personel;
import StokTemini.PersonelType;

public class DepoPersoneliHandler extends PersonelHandler implements Handler {

    public DepoPersoneliHandler(String handlerName) {
        super(handlerName);
    }

    
    public String[] process(Personel personel) {
        return super.process(PersonelType.DepoPersoneli, personel);

    }

}
