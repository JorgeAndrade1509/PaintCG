/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Ya enlazado con git 

//Con git s
package proyecto1_comp_grafica.MisPaneles;

import java.awt.Graphics;

/**
 *
 * @author jorgeandrade
 */
public class PanelCirculo extends javax.swing.JPanel {

    /**
     * Creates new form PanelCirculo
     */
    public PanelCirculo() {
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

        jLabel2 = new javax.swing.JLabel();
        xinicial = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        yinicial = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        DibujarCirculo = new javax.swing.JButton();
        PanelDibujoCirculo = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        radio = new javax.swing.JTextField();
        EscalarCirculo = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        esc = new javax.swing.JTextField();
        BorrarCirculo = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setText("Punto Inicial:");

        jLabel4.setText("X");

        jLabel6.setText("Y");

        jLabel8.setText("Elija una opción (Dibujar/Transformar):");

        DibujarCirculo.setBackground(new java.awt.Color(153, 204, 255));
        DibujarCirculo.setText("Dibujar");
        DibujarCirculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DibujarCirculoActionPerformed(evt);
            }
        });

        PanelDibujoCirculo.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout PanelDibujoCirculoLayout = new javax.swing.GroupLayout(PanelDibujoCirculo);
        PanelDibujoCirculo.setLayout(PanelDibujoCirculoLayout);
        PanelDibujoCirculoLayout.setHorizontalGroup(
            PanelDibujoCirculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        PanelDibujoCirculoLayout.setVerticalGroup(
            PanelDibujoCirculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 495, Short.MAX_VALUE)
        );

        jLabel5.setText("radio:");

        EscalarCirculo.setText("Escalar");
        EscalarCirculo.setEnabled(false);
        EscalarCirculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EscalarCirculoActionPerformed(evt);
            }
        });

        jLabel11.setText("Escalar:");

        esc.setEnabled(false);

        BorrarCirculo.setBackground(new java.awt.Color(255, 102, 102));
        BorrarCirculo.setText("Borrar");
        BorrarCirculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarCirculoActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dibujar", "Transformar" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4))
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(xinicial, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(yinicial, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(radio, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DibujarCirculo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BorrarCirculo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(134, 134, 134)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(esc, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(EscalarCirculo)
                .addContainerGap(238, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelDibujoCirculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DibujarCirculo, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BorrarCirculo, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(xinicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addComponent(yinicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(radio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(esc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EscalarCirculo))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PanelDibujoCirculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void DibujarCirculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DibujarCirculoActionPerformed
         Graphics t = PanelDibujoCirculo.getGraphics();
         
         
         int x,y,e,x2,xf,yf,r,xi,yi;
         
         
         xi=Integer.parseInt(xinicial.getText());
         yi=Integer.parseInt(yinicial.getText());
         
    
         
         r=Integer.parseInt(radio.getText());
         
         x=r;
         y=0;
         e=0;
         
         while( y <= x){
             t.drawLine(x+xi,y+yi,x+xi,y+yi);t.drawLine(y+yi,x+xi,y+yi,x+xi);
             t.drawLine(-x+xi,y+yi,-x+xi,y+yi);t.drawLine(-y+yi,x+xi,-y+yi,x+xi);
             t.drawLine(x+xi,-y+yi,x+xi,-y+yi);t.drawLine(y+yi,-x+xi,y+yi,-x+xi);
             t.drawLine(-x+xi,-y+yi,-x+xi,-y+yi);t.drawLine(-y+yi,-x+xi,-y+yi,-x+xi);
             
             
             e=e+(2*y)+1;
             y=y+1;
             
             if ((2*e) >((2*x) - 1)){
             x=x-1;
             e=e - (2*x) +1;
             
             }
             
             
             
             
         }
         
     
         
        
         
         
         
    }//GEN-LAST:event_DibujarCirculoActionPerformed

    private void EscalarCirculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EscalarCirculoActionPerformed
        Graphics t = PanelDibujoCirculo.getGraphics();

         int x,y,e,x2,xf,yf,r,xi,yi,escalar;

         xi=Integer.parseInt(xinicial.getText());
         yi=Integer.parseInt(yinicial.getText());
         escalar=Integer.parseInt(esc.getText());
  
         r=Integer.parseInt(radio.getText())*escalar;
         
         radio.setText(Integer.toString(r));
         
         x=r;
         y=0;
         e=0;
         
         while( y <= x){
             

             t.drawLine(x+xi,y+yi,x+xi,y+yi);t.drawLine(y+yi,x+xi,y+yi,x+xi);
             t.drawLine(-x+xi,y+yi,-x+xi,y+yi);t.drawLine(-y+yi,x+xi,-y+yi,x+xi);
             t.drawLine(x+xi,-y+yi,x+xi,-y+yi);t.drawLine(y+yi,-x+xi,y+yi,-x+xi);
             t.drawLine(-x+xi,-y+yi,-x+xi,-y+yi);t.drawLine(-y+yi,-x+xi,-y+yi,-x+xi);
             
             e=e+(2*y)+1;
             y=y+1;
             
             if ((2*e) >((2*x) - 1)){
             x=x-1;
             e=e - (2*x) +1;
             
             }
  
         }
         
         
    }//GEN-LAST:event_EscalarCirculoActionPerformed

    private void BorrarCirculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarCirculoActionPerformed
        xinicial.setText(null);
        radio.setText(null);
        yinicial.setText(null);
        PanelDibujoCirculo.removeAll();
        PanelDibujoCirculo.repaint();
    }//GEN-LAST:event_BorrarCirculoActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        String option;

        if (jComboBox1.getSelectedItem()== "Dibujar"){
            xinicial.setEnabled(true);
            yinicial.setEnabled(true);
            radio.setEnabled(true);
            esc.setEnabled(false);
            DibujarCirculo.setEnabled(true);
            EscalarCirculo.setEnabled(false);
            
        }
        else if (jComboBox1.getSelectedItem() == "Transformar")
        {
            xinicial.setEnabled(false);
            yinicial.setEnabled(false);
            radio.setEnabled(false);
            esc.setEnabled(true);
            DibujarCirculo.setEnabled(false);
            EscalarCirculo.setEnabled(true);
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BorrarCirculo;
    private javax.swing.JButton DibujarCirculo;
    private javax.swing.JButton EscalarCirculo;
    private javax.swing.JPanel PanelDibujoCirculo;
    private javax.swing.JTextField esc;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField radio;
    private javax.swing.JTextField xinicial;
    private javax.swing.JTextField yinicial;
    // End of variables declaration//GEN-END:variables
}
