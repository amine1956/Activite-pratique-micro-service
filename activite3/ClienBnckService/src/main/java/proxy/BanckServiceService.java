
package proxy;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.Service;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceException;
import jakarta.xml.ws.WebServiceFeature;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.0
 * Generated source version: 3.0
 * 
 */
@WebServiceClient(name = "BanckServiceService", targetNamespace = "http://ws.example.org/", wsdlLocation = "http://localhost:8080/?wsdl")
public class BanckServiceService
    extends Service
{

    private final static URL BANCKSERVICESERVICE_WSDL_LOCATION;
    private final static WebServiceException BANCKSERVICESERVICE_EXCEPTION;
    private final static QName BANCKSERVICESERVICE_QNAME = new QName("http://ws.example.org/", "BanckServiceService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        BANCKSERVICESERVICE_WSDL_LOCATION = url;
        BANCKSERVICESERVICE_EXCEPTION = e;
    }

    public BanckServiceService() {
        super(__getWsdlLocation(), BANCKSERVICESERVICE_QNAME);
    }

    public BanckServiceService(WebServiceFeature... features) {
        super(__getWsdlLocation(), BANCKSERVICESERVICE_QNAME, features);
    }

    public BanckServiceService(URL wsdlLocation) {
        super(wsdlLocation, BANCKSERVICESERVICE_QNAME);
    }

    public BanckServiceService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, BANCKSERVICESERVICE_QNAME, features);
    }

    public BanckServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BanckServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns BanckWS
     */
    @WebEndpoint(name = "BanckWSPort")
    public BanckWS getBanckWSPort() {
        return super.getPort(new QName("http://ws.example.org/", "BanckWSPort"), BanckWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BanckWS
     */
    @WebEndpoint(name = "BanckWSPort")
    public BanckWS getBanckWSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.example.org/", "BanckWSPort"), BanckWS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (BANCKSERVICESERVICE_EXCEPTION!= null) {
            throw BANCKSERVICESERVICE_EXCEPTION;
        }
        return BANCKSERVICESERVICE_WSDL_LOCATION;
    }

}
