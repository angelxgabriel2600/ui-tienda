/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import ws.Cliente;
import ws.Orden;
import ws.Producto;

/**
 *
 * @author user
 */

public class OrdenController {
    public String guardar(){
        Orden orden=new Orden();
        ws.OrdenWebService_Service service=new ws.OrdenWebService_Service();
        ws.OrdenWebService port=service.getOrdenWebServicePort();
        port.agregarOrden(orden);
        return "lista";
    }
    public String modificar(){
        Orden orden=new Orden();
        ws.OrdenWebService_Service service=new ws.OrdenWebService_Service();
        ws.OrdenWebService port=service.getOrdenWebServicePort();
        port.agregarOrden(orden);
        return "lista";
    }
    public String eliminar(){
        int idOrden=0;
        ws.OrdenWebService_Service service=new ws.OrdenWebService_Service();
        ws.OrdenWebService port=service.getOrdenWebServicePort();
        port.eliminarOrden(idOrden);
        return "lista";
    }
    
    public List<Orden> mostrarOrden() {
        ws.OrdenWebService_Service service=new ws.OrdenWebService_Service();
        ws.OrdenWebService port=service.getOrdenWebServicePort();;
        return port.mostrarOrden();
    }

    public Orden mostrarOrdenPorId(int idOrden) {
        ws.OrdenWebService_Service service=new ws.OrdenWebService_Service();
        ws.OrdenWebService port=service.getOrdenWebServicePort();;
        return port.mostrarOrdenPorId(idOrden);
    }

    public List<Cliente> mostrarCliente() {
        ws.OrdenWebService_Service service=new ws.OrdenWebService_Service();
        ws.OrdenWebService port=service.getOrdenWebServicePort();
        return port.mostrarCliente();
    }

    public List<Producto> mostrarProducto() {
        ws.OrdenWebService_Service service=new ws.OrdenWebService_Service();
        ws.OrdenWebService port=service.getOrdenWebServicePort();
        return port.mostrarProducto();
    }
}
