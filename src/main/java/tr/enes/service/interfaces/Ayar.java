/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.enes.service.interfaces;

import org.osgi.service.metatype.annotations.AttributeDefinition;

/**
 *
 * @author enes
 */
public @interface Ayar {

    @AttributeDefinition(name = "extra", description = "Add extra value to math operation", min = "0", max = "100", required = false, cardinality = 0)
    int extra() default 0;
}
