/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lk.sliit.converter;

import javax.ejb.Local;

/**
 *
 * @author IT11001980
 */
@Local
public interface ConverterSessionBeanLocal {

    double convertCToF(double value);
    
}
