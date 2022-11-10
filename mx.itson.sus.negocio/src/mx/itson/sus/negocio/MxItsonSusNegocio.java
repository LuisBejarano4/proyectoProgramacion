/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mx.itson.sus.negocio;

import mx.itson.sus.negocio.ofertasDia;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tomgh
 */
public class MxItsonSusNegocio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<ofertasDia> lis_ofertas = new ArrayList<>();
        
        ofertasDia ofDia = new ofertasDia();
        ofDia.setFecha(06/10/22);
        ofDia.setProducto("Monitor Samsung");
        ofDia.setNombreVendedor("Antonio Mora");
        ofDia.setIdVendedor("00000289742");
        
        lis_ofertas.add(ofDia);
        
        System.out.println("el producto que usted adquirio fue " + lis_ofertas.get(0).setIdVendedor(i));
        
        
        
        
        
        
    }
    
}
