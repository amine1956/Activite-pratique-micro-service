
package proxy;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the proxy package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Compt_QNAME = new QName("http://ws.example.org/", "compt");
    private final static QName _ConversionEuroToDh_QNAME = new QName("http://ws.example.org/", "conversionEuroToDh");
    private final static QName _ConversionEuroToDhResponse_QNAME = new QName("http://ws.example.org/", "conversionEuroToDhResponse");
    private final static QName _GetCompt_QNAME = new QName("http://ws.example.org/", "getCompt");
    private final static QName _GetComptResponse_QNAME = new QName("http://ws.example.org/", "getComptResponse");
    private final static QName _GetCompts_QNAME = new QName("http://ws.example.org/", "getCompts");
    private final static QName _GetComptsResponse_QNAME = new QName("http://ws.example.org/", "getComptsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: proxy
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Compt }
     * 
     * @return
     *     the new instance of {@link Compt }
     */
    public Compt createCompt() {
        return new Compt();
    }

    /**
     * Create an instance of {@link ConversionEuroToDh }
     * 
     * @return
     *     the new instance of {@link ConversionEuroToDh }
     */
    public ConversionEuroToDh createConversionEuroToDh() {
        return new ConversionEuroToDh();
    }

    /**
     * Create an instance of {@link ConversionEuroToDhResponse }
     * 
     * @return
     *     the new instance of {@link ConversionEuroToDhResponse }
     */
    public ConversionEuroToDhResponse createConversionEuroToDhResponse() {
        return new ConversionEuroToDhResponse();
    }

    /**
     * Create an instance of {@link GetCompt }
     * 
     * @return
     *     the new instance of {@link GetCompt }
     */
    public GetCompt createGetCompt() {
        return new GetCompt();
    }

    /**
     * Create an instance of {@link GetComptResponse }
     * 
     * @return
     *     the new instance of {@link GetComptResponse }
     */
    public GetComptResponse createGetComptResponse() {
        return new GetComptResponse();
    }

    /**
     * Create an instance of {@link GetCompts }
     * 
     * @return
     *     the new instance of {@link GetCompts }
     */
    public GetCompts createGetCompts() {
        return new GetCompts();
    }

    /**
     * Create an instance of {@link GetComptsResponse }
     * 
     * @return
     *     the new instance of {@link GetComptsResponse }
     */
    public GetComptsResponse createGetComptsResponse() {
        return new GetComptsResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Compt }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Compt }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.example.org/", name = "compt")
    public JAXBElement<Compt> createCompt(Compt value) {
        return new JAXBElement<>(_Compt_QNAME, Compt.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionEuroToDh }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConversionEuroToDh }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.example.org/", name = "conversionEuroToDh")
    public JAXBElement<ConversionEuroToDh> createConversionEuroToDh(ConversionEuroToDh value) {
        return new JAXBElement<>(_ConversionEuroToDh_QNAME, ConversionEuroToDh.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionEuroToDhResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConversionEuroToDhResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.example.org/", name = "conversionEuroToDhResponse")
    public JAXBElement<ConversionEuroToDhResponse> createConversionEuroToDhResponse(ConversionEuroToDhResponse value) {
        return new JAXBElement<>(_ConversionEuroToDhResponse_QNAME, ConversionEuroToDhResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompt }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCompt }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.example.org/", name = "getCompt")
    public JAXBElement<GetCompt> createGetCompt(GetCompt value) {
        return new JAXBElement<>(_GetCompt_QNAME, GetCompt.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetComptResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetComptResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.example.org/", name = "getComptResponse")
    public JAXBElement<GetComptResponse> createGetComptResponse(GetComptResponse value) {
        return new JAXBElement<>(_GetComptResponse_QNAME, GetComptResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompts }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCompts }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.example.org/", name = "getCompts")
    public JAXBElement<GetCompts> createGetCompts(GetCompts value) {
        return new JAXBElement<>(_GetCompts_QNAME, GetCompts.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetComptsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetComptsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.example.org/", name = "getComptsResponse")
    public JAXBElement<GetComptsResponse> createGetComptsResponse(GetComptsResponse value) {
        return new JAXBElement<>(_GetComptsResponse_QNAME, GetComptsResponse.class, null, value);
    }

}
