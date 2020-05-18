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
public class GranitBataryaDecorator extends BataryaDecorator {

    public GranitBataryaDecorator(Batarya decoratedBatarya) {
        super(decoratedBatarya);
    }

    @Override
    public String calistir() {
        decoratedBatarya.calistir();
        return setGranit(decoratedBatarya);

    }

    private String setGranit(Batarya decoratedBatarya) {
        return "Granit Kaplama Batarya";
    }
}
