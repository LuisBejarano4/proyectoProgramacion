/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.catrina.entidades;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Tomgh
 */
public class Cuenta {
        private String producto;
    private String cuenta;
    private String clabe;
    private String moneda;
    private Cliente cliente;
    private List<Movimiento> movimientos;
    
    
  public Cuenta deserializar(String json){
        Cuenta cuenta = new Cuenta();
        try{
            cuenta = new Gson().fromJson(json, Cuenta.class);
        }catch(Exception ex){
            System.err.print("Ocurrió un error" + ex.getMessage());
        }
        return cuenta;

    }
  
   public List<Movimiento> getMovimientosFiltrados(int mes){
        List<Movimiento> movimientosFiltrados = new ArrayList<>();
        for(Movimiento movimiento : movimientos){
            if(movimiento.getFecha().getMonth() == mes){
                movimientosFiltrados.add(movimiento);
            }
        }
        movimientosFiltrados.sort((movimiento1, movimiento2) -> movimiento1.getFecha().compareTo( movimiento2.getFecha()));
    
        return movimientosFiltrados;
    
}
   
   
  
    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getClabe() {
        return clabe;
    }

    public void setClabe(String clabe) {
        this.clabe = clabe;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

   public List<Movimiento> getMovimientos() {
        return movimientos;
    }

    /**
     * @param movimientos the movimientos to set
     */
    public void setMovimientos(List<Movimiento> movimientos) {
        this.movimientos = movimientos;
    }
    
}
