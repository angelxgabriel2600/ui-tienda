
package ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws package. 
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

    private final static QName _ActualizarOrden_QNAME = new QName("http://ws/", "actualizarOrden");
    private final static QName _ActualizarOrdenResponse_QNAME = new QName("http://ws/", "actualizarOrdenResponse");
    private final static QName _AgregarOrden_QNAME = new QName("http://ws/", "agregarOrden");
    private final static QName _AgregarOrdenResponse_QNAME = new QName("http://ws/", "agregarOrdenResponse");
    private final static QName _Cliente_QNAME = new QName("http://ws/", "cliente");
    private final static QName _EliminarOrden_QNAME = new QName("http://ws/", "eliminarOrden");
    private final static QName _EliminarOrdenResponse_QNAME = new QName("http://ws/", "eliminarOrdenResponse");
    private final static QName _MostrarCliente_QNAME = new QName("http://ws/", "mostrarCliente");
    private final static QName _MostrarClienteResponse_QNAME = new QName("http://ws/", "mostrarClienteResponse");
    private final static QName _MostrarOrden_QNAME = new QName("http://ws/", "mostrarOrden");
    private final static QName _MostrarOrdenPorId_QNAME = new QName("http://ws/", "mostrarOrdenPorId");
    private final static QName _MostrarOrdenPorIdResponse_QNAME = new QName("http://ws/", "mostrarOrdenPorIdResponse");
    private final static QName _MostrarOrdenResponse_QNAME = new QName("http://ws/", "mostrarOrdenResponse");
    private final static QName _MostrarProducto_QNAME = new QName("http://ws/", "mostrarProducto");
    private final static QName _MostrarProductoResponse_QNAME = new QName("http://ws/", "mostrarProductoResponse");
    private final static QName _Orden_QNAME = new QName("http://ws/", "orden");
    private final static QName _Producto_QNAME = new QName("http://ws/", "producto");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ActualizarOrden }
     * 
     */
    public ActualizarOrden createActualizarOrden() {
        return new ActualizarOrden();
    }

    /**
     * Create an instance of {@link ActualizarOrdenResponse }
     * 
     */
    public ActualizarOrdenResponse createActualizarOrdenResponse() {
        return new ActualizarOrdenResponse();
    }

    /**
     * Create an instance of {@link AgregarOrden }
     * 
     */
    public AgregarOrden createAgregarOrden() {
        return new AgregarOrden();
    }

    /**
     * Create an instance of {@link AgregarOrdenResponse }
     * 
     */
    public AgregarOrdenResponse createAgregarOrdenResponse() {
        return new AgregarOrdenResponse();
    }

    /**
     * Create an instance of {@link Cliente }
     * 
     */
    public Cliente createCliente() {
        return new Cliente();
    }

    /**
     * Create an instance of {@link EliminarOrden }
     * 
     */
    public EliminarOrden createEliminarOrden() {
        return new EliminarOrden();
    }

    /**
     * Create an instance of {@link EliminarOrdenResponse }
     * 
     */
    public EliminarOrdenResponse createEliminarOrdenResponse() {
        return new EliminarOrdenResponse();
    }

    /**
     * Create an instance of {@link MostrarCliente }
     * 
     */
    public MostrarCliente createMostrarCliente() {
        return new MostrarCliente();
    }

    /**
     * Create an instance of {@link MostrarClienteResponse }
     * 
     */
    public MostrarClienteResponse createMostrarClienteResponse() {
        return new MostrarClienteResponse();
    }

    /**
     * Create an instance of {@link MostrarOrden }
     * 
     */
    public MostrarOrden createMostrarOrden() {
        return new MostrarOrden();
    }

    /**
     * Create an instance of {@link MostrarOrdenPorId }
     * 
     */
    public MostrarOrdenPorId createMostrarOrdenPorId() {
        return new MostrarOrdenPorId();
    }

    /**
     * Create an instance of {@link MostrarOrdenPorIdResponse }
     * 
     */
    public MostrarOrdenPorIdResponse createMostrarOrdenPorIdResponse() {
        return new MostrarOrdenPorIdResponse();
    }

    /**
     * Create an instance of {@link MostrarOrdenResponse }
     * 
     */
    public MostrarOrdenResponse createMostrarOrdenResponse() {
        return new MostrarOrdenResponse();
    }

    /**
     * Create an instance of {@link MostrarProducto }
     * 
     */
    public MostrarProducto createMostrarProducto() {
        return new MostrarProducto();
    }

    /**
     * Create an instance of {@link MostrarProductoResponse }
     * 
     */
    public MostrarProductoResponse createMostrarProductoResponse() {
        return new MostrarProductoResponse();
    }

    /**
     * Create an instance of {@link Orden }
     * 
     */
    public Orden createOrden() {
        return new Orden();
    }

    /**
     * Create an instance of {@link Producto }
     * 
     */
    public Producto createProducto() {
        return new Producto();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarOrden }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "actualizarOrden")
    public JAXBElement<ActualizarOrden> createActualizarOrden(ActualizarOrden value) {
        return new JAXBElement<ActualizarOrden>(_ActualizarOrden_QNAME, ActualizarOrden.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarOrdenResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "actualizarOrdenResponse")
    public JAXBElement<ActualizarOrdenResponse> createActualizarOrdenResponse(ActualizarOrdenResponse value) {
        return new JAXBElement<ActualizarOrdenResponse>(_ActualizarOrdenResponse_QNAME, ActualizarOrdenResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarOrden }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "agregarOrden")
    public JAXBElement<AgregarOrden> createAgregarOrden(AgregarOrden value) {
        return new JAXBElement<AgregarOrden>(_AgregarOrden_QNAME, AgregarOrden.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarOrdenResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "agregarOrdenResponse")
    public JAXBElement<AgregarOrdenResponse> createAgregarOrdenResponse(AgregarOrdenResponse value) {
        return new JAXBElement<AgregarOrdenResponse>(_AgregarOrdenResponse_QNAME, AgregarOrdenResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Cliente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "cliente")
    public JAXBElement<Cliente> createCliente(Cliente value) {
        return new JAXBElement<Cliente>(_Cliente_QNAME, Cliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarOrden }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "eliminarOrden")
    public JAXBElement<EliminarOrden> createEliminarOrden(EliminarOrden value) {
        return new JAXBElement<EliminarOrden>(_EliminarOrden_QNAME, EliminarOrden.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarOrdenResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "eliminarOrdenResponse")
    public JAXBElement<EliminarOrdenResponse> createEliminarOrdenResponse(EliminarOrdenResponse value) {
        return new JAXBElement<EliminarOrdenResponse>(_EliminarOrdenResponse_QNAME, EliminarOrdenResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MostrarCliente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "mostrarCliente")
    public JAXBElement<MostrarCliente> createMostrarCliente(MostrarCliente value) {
        return new JAXBElement<MostrarCliente>(_MostrarCliente_QNAME, MostrarCliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MostrarClienteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "mostrarClienteResponse")
    public JAXBElement<MostrarClienteResponse> createMostrarClienteResponse(MostrarClienteResponse value) {
        return new JAXBElement<MostrarClienteResponse>(_MostrarClienteResponse_QNAME, MostrarClienteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MostrarOrden }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "mostrarOrden")
    public JAXBElement<MostrarOrden> createMostrarOrden(MostrarOrden value) {
        return new JAXBElement<MostrarOrden>(_MostrarOrden_QNAME, MostrarOrden.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MostrarOrdenPorId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "mostrarOrdenPorId")
    public JAXBElement<MostrarOrdenPorId> createMostrarOrdenPorId(MostrarOrdenPorId value) {
        return new JAXBElement<MostrarOrdenPorId>(_MostrarOrdenPorId_QNAME, MostrarOrdenPorId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MostrarOrdenPorIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "mostrarOrdenPorIdResponse")
    public JAXBElement<MostrarOrdenPorIdResponse> createMostrarOrdenPorIdResponse(MostrarOrdenPorIdResponse value) {
        return new JAXBElement<MostrarOrdenPorIdResponse>(_MostrarOrdenPorIdResponse_QNAME, MostrarOrdenPorIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MostrarOrdenResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "mostrarOrdenResponse")
    public JAXBElement<MostrarOrdenResponse> createMostrarOrdenResponse(MostrarOrdenResponse value) {
        return new JAXBElement<MostrarOrdenResponse>(_MostrarOrdenResponse_QNAME, MostrarOrdenResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MostrarProducto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "mostrarProducto")
    public JAXBElement<MostrarProducto> createMostrarProducto(MostrarProducto value) {
        return new JAXBElement<MostrarProducto>(_MostrarProducto_QNAME, MostrarProducto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MostrarProductoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "mostrarProductoResponse")
    public JAXBElement<MostrarProductoResponse> createMostrarProductoResponse(MostrarProductoResponse value) {
        return new JAXBElement<MostrarProductoResponse>(_MostrarProductoResponse_QNAME, MostrarProductoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Orden }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "orden")
    public JAXBElement<Orden> createOrden(Orden value) {
        return new JAXBElement<Orden>(_Orden_QNAME, Orden.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Producto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "producto")
    public JAXBElement<Producto> createProducto(Producto value) {
        return new JAXBElement<Producto>(_Producto_QNAME, Producto.class, null, value);
    }

}
