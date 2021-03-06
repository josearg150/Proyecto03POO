/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_18131273_proyecto_03;

import java.awt.Component;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jose angel
 */
public class PA_18131273_Frame_03b extends javax.swing.JFrame {

    /**
     * Creates new form PA_18131273_Frame_01b
     */
    Pelicula []desfile;
    public PA_18131273_Frame_03b(PA_18131273_Frame_03a FramePrincipal) {
        initComponents();
        this.setLocationRelativeTo(null);// Abir en el centro de la pantalla
        desfile = FramePrincipal.getInfo();//Copiamos el arreglo para poderlo usar
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButComenzar = new javax.swing.JButton();
        JPanelDesfile = new java.awt.Panel();
        jLabdatos = new javax.swing.JLabel();
        textArea1 = new java.awt.TextArea();
        textArea2 = new java.awt.TextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Desfile");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButComenzar.setText("Comenzar");
        jButComenzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButComenzarActionPerformed(evt);
            }
        });
        getContentPane().add(jButComenzar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        JPanelDesfile.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout JPanelDesfileLayout = new javax.swing.GroupLayout(JPanelDesfile);
        JPanelDesfile.setLayout(JPanelDesfileLayout);
        JPanelDesfileLayout.setHorizontalGroup(
            JPanelDesfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelDesfileLayout.createSequentialGroup()
                .addContainerGap(183, Short.MAX_VALUE)
                .addComponent(jLabdatos, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(191, 191, 191))
        );
        JPanelDesfileLayout.setVerticalGroup(
            JPanelDesfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelDesfileLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabdatos, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(225, Short.MAX_VALUE))
        );

        getContentPane().add(JPanelDesfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, -1, -1));
        getContentPane().add(textArea2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 430, 130));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButComenzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButComenzarActionPerformed
        for (int i = 0; i < desfile.length -1; i++) //Ordenar por director
            for (int j = i+1; j < desfile.length; j++) 
                if (desfile[i].getDirector().compareTo(desfile[j].getDirector()) > 0) {
                    Pelicula aux = desfile[i];
                    desfile[i] = desfile[j];
                    desfile[j] = aux;
                }
        
        //mostrar el desfile al mismo tiempo que la informacion
        for (int j = 0; j < 4; j++) { 
             textArea2.setText(desfile[j].mostrar());
             desfile[j].mover(JPanelDesfile);                
        }
    }//GEN-LAST:event_jButComenzarActionPerformed

         
    
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
            java.util.logging.Logger.getLogger(PA_18131273_Frame_03b.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PA_18131273_Frame_03b.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PA_18131273_Frame_03b.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PA_18131273_Frame_03b.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PA_18131273_Frame_03b(new PA_18131273_Frame_03a()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Panel JPanelDesfile;
    private javax.swing.JButton jButComenzar;
    private javax.swing.JLabel jLabdatos;
    private java.awt.TextArea textArea1;
    private java.awt.TextArea textArea2;
    // End of variables declaration//GEN-END:variables
}
