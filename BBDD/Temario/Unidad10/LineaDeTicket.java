package minipos.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Entidad que almacena una línea de Ticket.
 * @author Profesorado
 */
@Entity
public class LineaDeTicket implements Serializable {

    private static final long serialVersionUID = 18887373L;

    /**
     * Constructor necesario para JPA.     
     */
    protected LineaDeTicket()
    {
        
    }
    
    /**
     * Constructor interno a paquete. No se podrá crear un ticket por una clase
     * externa a este paquete. Los tickets se crean en la clase Ticket
     * {see Ticket#lineaTicket}.
     * 
     */
    LineaDeTicket(Producto p, Ticket t, int cantidad)            
    {
        this.producto=p;
        this.precioVenta=p.getPrecio();
        this.ticket=t;
        this.cantidad=cantidad;
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @ManyToOne(optional = false)
    private Producto producto;
    
    @ManyToOne(optional = false)
    private Ticket ticket;
    
    @Column(nullable=false)
    private Integer cantidad;
    
    @Column(nullable=false)
    private double precioVenta;
    
    /**
     * Obtiene el ID único de esta línea de ticket
     * @return ID de la línea de ticket.
     */    
    public Long getId() {
        return id;
    }

    /**
    * Obtiene el producto asociado a esta línea de ticket.
    * @return producto.
    */
    public Producto getProducto() {
        return producto;
    }

    /**
     * Obtiene la cantidad de unidades del producto en esta línea de ticket.
     * @return Cantidad.
     */
    public Integer getCantidad() {
        return cantidad;
    }

    /**
     * Establece la cantidad de unidades del producto en esta línea.
     * @param cantidad Cantidad de unidades.
     */
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * Obtiene el ticket asociado a esta línea de ticket
     * @return Retorna el ticket.
     */
    public Ticket getTicket() {
        return ticket;
    }
    
    /**
     * Obtiene el precio de venta del producto en esta línea de ticket.
     * @return precio de venta de cada unidad del producto
     */
    public double getPrecioVenta()
    {
        return precioVenta;
    }
    
    /**
    * Obtiene el coste de la línea completa (unidades x precio unidad)
    * @return coste línea
    */
    public double getCosteLinea()
    {
        return precioVenta*cantidad;
    }
    
    @Override
    public String toString() {
        return String.format("LineaDeTicket %d {",id)
               .concat("\t").concat(String.format("producto = %s",this.producto.toString()))
               .concat("\t").concat(String.format("cantidad = %d",this.cantidad))
               .concat("\t").concat(String.format("pvp = %f",this.precioVenta))
               .concat("\t").concat(String.format("plin = %f",this.getCosteLinea()))
               .concat("}\n");
    }
    
}
