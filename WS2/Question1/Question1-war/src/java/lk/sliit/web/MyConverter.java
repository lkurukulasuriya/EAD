/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lk.sliit.web;

import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import lk.sliit.converter.ConverterSessionBeanLocal;

/**
 *
 * @author IT11001980
 */
@WebService(serviceName="MyConverter")
public class MyConverter {
    @EJB
    private ConverterSessionBeanLocal ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "convertCToF")
    public double convertCToF(@WebParam(name = "value")
    double value) {
        return ejbRef.convertCToF(value);
    }

}
