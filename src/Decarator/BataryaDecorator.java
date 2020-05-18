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
public abstract class BataryaDecorator implements Batarya {

    protected Batarya decoratedBatarya;

    public BataryaDecorator(Batarya decoratedBatarya) {
        this.decoratedBatarya = decoratedBatarya;

    }

    @Override
    public String calistir() {

        return decoratedBatarya.calistir();
    }
}
