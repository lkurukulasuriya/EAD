/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lk.sliit.converter;

import javax.ejb.Stateless;

/**
 *
 * @author IT11001980
 */
@Stateless
public class ConverterSessionBean implements ConverterSessionBeanLocal {

    @Override   
    public double convertCToF(double value) {

        double result=(( 9.0*value )/5)+32;
        return result;
    }    
   
}
