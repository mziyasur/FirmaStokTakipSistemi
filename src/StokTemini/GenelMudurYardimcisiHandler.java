package StokTemini;


import StokTemini.Handler;
import StokTemini.Personel;
import StokTemini.PersonelType;

public class GenelMudurYardimcisiHandler extends PersonelHandler implements Handler {

    public GenelMudurYardimcisiHandler(String handlerName) {
        super(handlerName);
    }

    
    public String[] process(Personel personel) {
        return super.process(PersonelType.GenelMudurYardimcisi, personel);
    }

    
}
