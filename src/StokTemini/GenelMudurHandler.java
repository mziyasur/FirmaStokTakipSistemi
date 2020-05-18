package StokTemini;


import StokTemini.Handler;
import StokTemini.Personel;
import StokTemini.PersonelType;

public class GenelMudurHandler extends PersonelHandler implements Handler {

    public GenelMudurHandler(String handlerName) {
        super(handlerName);
    }


    public String[] process(Personel personel) {
        return super.process(PersonelType.GenelMudur, personel);
    }

    
}
