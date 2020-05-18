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
public class AltınBataryaDecorator extends BataryaDecorator {

    public AltınBataryaDecorator(Batarya decoratedBatarya) {
        super(decoratedBatarya);

    }

    @Override
    public String calistir() {
        decoratedBatarya.calistir();
        return setAltın(decoratedBatarya);

    }

    private String setAltın(Batarya decoratedBatarya) {
        return "Altın Kaplama Batarya";
    }

}
