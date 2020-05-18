/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decarator;

/**
 *
 * @author mehme
 */
public class CelikBataryaDecorator extends BataryaDecorator {

    public CelikBataryaDecorator(Batarya decoratedBatarya) {
        super(decoratedBatarya);

    }

    @Override
    public String calistir() {
        decoratedBatarya.calistir();
        return setCelik(decoratedBatarya);

    }

    private String setCelik(Batarya decoratedBatarya) {
        return "Çelik Kaplama Batarya";
    }

}
