package StokTemini;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mehme
 */
public interface Handler {

    void setHandler(Handler handler);

    String[] process(Personel personel);

    String getHandlerName();

}
