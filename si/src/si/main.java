/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package si;

import javax.swing.JOptionPane;

/**
 *
 * @author Tomgh
 */
public class main extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    public main() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Convertidor = new javax.swing.JTable();
        btnGenerar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Convertidor.setAutoCreateRowSorter(true);
        Convertidor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Dolares", "Fecha", "PesoMxN"
            }
        ));
        jScrollPane1.setViewportView(Convertidor);

        btnGenerar.setText("Generar");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGenerar)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(btnGenerar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed


        
        
        
        double dolar = 0.050;
        double euro = 0.051;
        double chile = 48.83;
        double argentino = 7.62483;
        double yen = 7.48;
        double dolarCanadiense = 0.069;
        double yuanChino = 0.37;
        double realBrasileño = 0.27;
        double rubloRuso = 3.09;
        double dolarAustraliano = 0.079;
        double wonCoreano = 72.12;
        double rupiaIndia = 4.16;
        
        
       String datoPesosIngresados = pesos.getText();
       int datoPesoIngresadosInt = Integer.parseInt(datoPesosIngresados);
        
        
        String moneda= "";
        
        if ("Dolar".equals(monedas.getSelectedItem())){
              moneda = "1";
           }
        if ("Euro".equals(monedas.getSelectedItem())){
              moneda = "2";
           }
        if ("Chile".equals(monedas.getSelectedItem())){
               moneda = "3";
           }
        if ("Argentino".equals(monedas.getSelectedItem())){
              moneda = "4";
           }
        if ("Yen".equals(monedas.getSelectedItem())){
              moneda = "5";
           }
        if ("Dolar_Canadiense".equals(monedas.getSelectedItem())){
              moneda = "6";
           }
        if ("Yuan_Chino".equals(monedas.getSelectedItem())){
              moneda = "7";
           }
        if ("Real_Brasileño".equals(monedas.getSelectedItem())){
              moneda = "8";
           }
        if ("Rublo_Ruso".equals(monedas.getSelectedItem())){
              moneda = "9";
           }
        if ("Dolar_Australiano".equals(monedas.getSelectedItem())){
              moneda = "10";
           }
        if ("Won_Coreano".equals(monedas.getSelectedItem())){
              moneda = "11";
           }
        if ("Rupia_India".equals(monedas.getSelectedItem())){
              moneda = "12";
           }
        
        
      
        
        
        
        
       int monedaInt = Integer.parseInt(moneda);
        
      
       if(monedaInt == 1){
            double resultadoConversionDigito = datoPesoIngresadosInt * dolar;
            String resultadoConversion = Math.round(resultadoConversionDigito) + " dolares.";
       }
       if(monedaInt == 2){
         
            double resultadoConversionDigito = datoPesoIngresadosInt * euro;
            String resultadoConversion = Math.round(resultadoConversionDigito) + " euros.";
       }
       if(monedaInt == 3){
            double resultadoConversionDigito = datoPesoIngresadosInt * chile;
            String resultadoConversion = Math.round(resultadoConversionDigito) + " pesos Chilenos.";
       }
       if(monedaInt == 4){
            double resultadoConversionDigito = datoPesoIngresadosInt * argentino;
            String resultadoConversion = Math.round(resultadoConversionDigito) + " peso argentino.";
       }
       if(monedaInt == 5){
            double resultadoConversionDigito = datoPesoIngresadosInt * yen;
            String resultadoConversion = Math.round(resultadoConversionDigito) + " Yen.";
       }
       if(monedaInt == 6){
            double resultadoConversionDigito = datoPesoIngresadosInt * dolarCanadiense;
            String resultadoConversion = Math.round(resultadoConversionDigito) + " Dolar Canadiense.";
       }
       if(monedaInt == 7){
            double resultadoConversionDigito = datoPesoIngresadosInt * yuanChino;
            String resultadoConversion = Math.round(resultadoConversionDigito) + " Yuan.";
       }
       if(monedaInt == 8){
            double resultadoConversionDigito = datoPesoIngresadosInt * realBrasileño;
            String resultadoConversion = Math.round(resultadoConversionDigito) + " Real.";
       }
       if(monedaInt == 9){
            double resultadoConversionDigito = datoPesoIngresadosInt * rubloRuso;
            String resultadoConversion = Math.round(resultadoConversionDigito) + " rublo.";
       }
       if(monedaInt == 10){
            double resultadoConversionDigito = datoPesoIngresadosInt * dolarAustraliano;
            String resultadoConversion = Math.round(resultadoConversionDigito) + " Dolar Australiano.";
       }
       if(monedaInt == 11){
            double resultadoConversionDigito = datoPesoIngresadosInt * wonCoreano;
            String resultadoConversion = Math.round(resultadoConversionDigito) + " Won.";
       }
       if(monedaInt == 12){
            double resultadoConversionDigito = datoPesoIngresadosInt * rupiaIndia;
            String resultadoConversion = Math.round(resultadoConversionDigito) + " Rupia.";
       }
       agregar();
    }//GEN-LAST:event_btnGenerarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Convertidor;
    private javax.swing.JButton btnGenerar;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private static class monedas {

        private static Object getSelectedItem() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public monedas() {
        }
    }
}
