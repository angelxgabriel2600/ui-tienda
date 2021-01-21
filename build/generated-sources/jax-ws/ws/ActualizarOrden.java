
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para actualizarOrden complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="actualizarOrden"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idOrden" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="idProducto" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="idCliente" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="cantidad" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "actualizarOrden", propOrder = {
    "idOrden",
    "idProducto",
    "idCliente",
    "cantidad"
})
public class ActualizarOrden {

    protected int idOrden;
    protected int idProducto;
    protected int idCliente;
    protected int cantidad;

    /**
     * Obtiene el valor de la propiedad idOrden.
     * 
     */
    public int getIdOrden() {
        return idOrden;
    }

    /**
     * Define el valor de la propiedad idOrden.
     * 
     */
    public void setIdOrden(int value) {
        this.idOrden = value;
    }

    /**
     * Obtiene el valor de la propiedad idProducto.
     * 
     */
    public int getIdProducto() {
        return idProducto;
    }

    /**
     * Define el valor de la propiedad idProducto.
     * 
     */
    public void setIdProducto(int value) {
        this.idProducto = value;
    }

    /**
     * Obtiene el valor de la propiedad idCliente.
     * 
     */
    public int getIdCliente() {
        return idCliente;
    }

    /**
     * Define el valor de la propiedad idCliente.
     * 
     */
    public void setIdCliente(int value) {
        this.idCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad cantidad.
     * 
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Define el valor de la propiedad cantidad.
     * 
     */
    public void setCantidad(int value) {
        this.cantidad = value;
    }

}
