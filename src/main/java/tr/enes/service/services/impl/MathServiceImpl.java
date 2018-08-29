/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.enes.service.services.impl;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import tr.enes.service.services.MathService;

/**
 *
 * @author enes
 */
@Component(immediate = true , enabled = true)
public class MathServiceImpl implements MathService {

//    Ayar ayar;
    @Activate
    void activate() {
        print("activate");
    }

    @Deactivate
    void deactiave() {//Ayar ayar) {
        print("deactivate");
    }

    @Modified
    void modified() {//Ayar ayar) {
        print("modify");
    }

    public int sum(int a, int b) {
        return a + b;
    }

    private void print(String text) {
        System.out.println(MathServiceImpl.class.getSimpleName() + " : " + text);
    }

}
