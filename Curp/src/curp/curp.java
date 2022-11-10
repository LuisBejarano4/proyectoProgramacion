
package curp;

import javax.swing.JOptionPane;

public class curp {
    
    public curp (){
        
    }
    String nombre= "";
    String apellidoP="";
    String apellidoM="";
    String sexo = "";
    String estado = "";
    Integer dia = 0, año =0, mes =0;
    
    public void getFecha(String a, String b, String c){
        
        dia = Integer.parseInt(a);
        mes = Integer.parseInt(b);
        año = Integer.parseInt(c);
        
        JOptionPane.showMessageDialog(null, "La fehca es "+dia +"/" +mes+"/"+año);
        
        
        
    }

    public void getSexo(String radio){
        sexo=radio;
        
    }
    
        public void getEstado(String boxEstado){
            estado = boxEstado;
        }


    public void mostrardatos(){
                JOptionPane.showMessageDialog(null, "La fehca es "+dia +"/" +mes+"/"+año);
                JOptionPane.showMessageDialog(null,"El boton de radio seleccionado es : " + sexo);
                JOptionPane.showMessageDialog(null,"El item del combo box es  : " + estado);
                JOptionPane.showMessageDialog(null, "El nombre es : "+nombre+" "+apellidoP+" "+apellidoM);
                

                
    }
    
    public void getNombrecompleto(String a, String b, String c){
        nombre= a;
        apellidoP = b;
        apellidoM = c;
        
        
        
    }
}
