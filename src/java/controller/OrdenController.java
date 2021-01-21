/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.annotation.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import ws.Cliente;
import ws.Orden;
import ws.Producto;

/**
 *
 * @author user
 */
@ManagedBean("ordenBean")
@RequestScoped
public class OrdenController implements Serializable {

    private int idOrden;
    private int idProducto;
    private int idCliente;
    private int cantidad;
    private int bandera;

    public String guardar() {
        return "guardarOrden";
    }

    public String modificar() {
        Orden orden = new Orden();
        FacesContext facesContext = FacesContext.getCurrentInstance();
        Map<String, String> params = null;
        params = facesContext.getExternalContext().getRequestParameterMap();
        String ordenId = (String) params.get("idOrden");
        try {
            if (ordenId == null) {
                ordenId = "0";
            }
            orden = this.mostrarOrdenPorId(Integer.parseInt(ordenId));
            this.idOrden = orden.getId();
            this.idProducto = orden.getIdProducto();
            this.idCliente = orden.getIdCliente();
            this.cantidad = orden.getCantidad();
            return "lista";
        } catch (Exception e) {
            e.printStackTrace();
            return "guardarOrden";
        }

    }

    public String eliminar() {
        return "eliminarOrden";
    }

    public String mostrarLista() {
        return "lista";
    }

    public String guardarOrden() {
        Orden orden = new Orden();
        ws.OrdenWebService_Service service = new ws.OrdenWebService_Service();
        ws.OrdenWebService port = service.getOrdenWebServicePort();
        if (idOrden > 0) {
            port.actualizarOrden(idOrden, idProducto, idCliente, cantidad);
        } else {
            port.agregarOrden(idOrden, idProducto, idCliente, cantidad);
        }
        return "lista";
    }

    public String eliminarOrden() {
        int idOrden = 0;
        FacesContext facesContext = FacesContext.getCurrentInstance();
        Map<String, String> params = null;
        params = facesContext.getExternalContext().getRequestParameterMap();
        String ordenId = (String) params.get("idOrden");
        idOrden = Integer.parseInt(ordenId);
        ws.OrdenWebService_Service service = new ws.OrdenWebService_Service();
        ws.OrdenWebService port = service.getOrdenWebServicePort();
        port.eliminarOrden(idOrden);
        return "lista";
    }

    public List<Orden> mostrarOrden() {
        ws.OrdenWebService_Service service = new ws.OrdenWebService_Service();
        ws.OrdenWebService port = service.getOrdenWebServicePort();
        try {
            return port.mostrarOrden();
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList<Orden>();
        }

    }

    public Orden mostrarOrdenPorId(int idOrden) {
        ws.OrdenWebService_Service service = new ws.OrdenWebService_Service();
        ws.OrdenWebService port = service.getOrdenWebServicePort();;
        return port.mostrarOrdenPorId(idOrden);
    }

    public List<Cliente> mostrarCliente() {
        ws.OrdenWebService_Service service = new ws.OrdenWebService_Service();
        ws.OrdenWebService port = service.getOrdenWebServicePort();
        try {
            return port.mostrarCliente();
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList<Cliente>();
        }
    }

    public List<Producto> mostrarProducto() {
        ws.OrdenWebService_Service service = new ws.OrdenWebService_Service();
        ws.OrdenWebService port = service.getOrdenWebServicePort();
        try {
            return port.mostrarProducto();
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList<Producto>();
        }
    }

    /**
     * @return the idOrden
     */
    public int getIdOrden() {
        return idOrden;
    }

    /**
     * @param idOrden the idOrden to set
     */
    public void setIdOrden(int idOrden) {
        this.idOrden = idOrden;
    }

    /**
     * @return the idProducto
     */
    public int getIdProducto() {
        return idProducto;
    }

    /**
     * @param idProducto the idProducto to set
     */
    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    /**
     * @return the idCliente
     */
    public int getIdCliente() {
        return idCliente;
    }

    /**
     * @param idCliente the idCliente to set
     */
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the bandera
     */
    public int getBandera() {
        return bandera;
    }

    /**
     * @param bandera the bandera to set
     */
    public void setBandera(int bandera) {
        this.bandera = bandera;
    }
}
