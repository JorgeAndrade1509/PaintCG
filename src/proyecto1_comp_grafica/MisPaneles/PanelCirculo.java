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
        jLabel7 = new javax.swing.JLabel();
        EscalarCirculo = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        esc = new javax.swing.JTextField();
        BorrarCirculo = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 204));

        jLabel2.setText("Punto Inicial:");

        jLabel4.setText("X");

        jLabel6.setText("Y");

        jLabel8.setText("Escriba los siguientes datos para dibujar el circulo:");

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
            .addGap(0, 491, Short.MAX_VALUE)
        );

        jLabel5.setText("radio");

        jLabel7.setText("X");

        EscalarCirculo.setText("Escalar");
        EscalarCirculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EscalarCirculoActionPerformed(evt);
            }
        });

        jLabel11.setText("Escalar:");

        BorrarCirculo.setText("Borrar");
        BorrarCirculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarCirculoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(PanelDibujoCirculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(60, 60, 60))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(radio, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(xinicial, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(yinicial, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(DibujarCirculo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BorrarCirculo)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 205, Short.MAX_VALUE)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(esc, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(EscalarCirculo)
                        .addGap(85, 85, 85))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(DibujarCirculo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(BorrarCirculo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(1, 1, 1)))
                                .addGap(43, 43, 43))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(xinicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addComponent(yinicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7)
                                    .addComponent(radio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(esc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EscalarCirculo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(PanelDibujoCirculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
         
         
        
        
         
         r=Integer.parseInt(radio.getText());
         
         x=r;
         y=0;
         e=0;
         
         while( y <= x){
             t.drawLine((escalar*x)+xi,(escalar*y)+yi,(escalar*x)+xi,(escalar*y)+yi);t.drawLine((escalar*y)+yi,(escalar*x)+xi,(escalar*y)+yi,(escalar*x)+xi);
             t.drawLine(-(escalar*x)+xi,(escalar*y)+yi,-(escalar*x)+xi,(escalar*y)+yi);t.drawLine(-(escalar*y)+yi,(escalar*x)+xi,-(escalar*y)+yi,(escalar*x)+xi);
             t.drawLine((escalar*x)+xi,-(escalar*y)+yi,(escalar*x)+xi,-(escalar*y)+yi);t.drawLine((escalar*y)+yi,-(escalar*x)+xi,(escalar*y)+yi,-(escalar*x)+xi);
             t.drawLine(-(escalar*x)+xi,-(escalar*y)+yi,-(escalar*x)+xi,-(escalar*y)+yi);t.drawLine(-(escalar*y)+yi,-(escalar*x)+xi,-(escalar*y)+yi,-(escalar*x)+xi);
             
             /*t.drawLine(-x+xi,y+yi,-x+xi,y+yi);t.drawLine(-y+yi,x+xi,-y+yi,x+xi);
             t.drawLine(-x+xi,y+yi,-x+xi,y+yi);t.drawLine(-y+yi,x+xi,-y+yi,x+xi);
             t.drawLine(x+xi,-y+yi,x+xi,-y+yi);t.drawLine(y+yi,-x+xi,y+yi,-x+xi);
             t.drawLine(-x+xi,-y+yi,-x+xi,-y+yi);t.drawLine(-y+yi,-x+xi,-y+yi,-x+xi);*/
             
             
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BorrarCirculo;
    private javax.swing.JButton DibujarCirculo;
    private javax.swing.JButton EscalarCirculo;
    private javax.swing.JPanel PanelDibujoCirculo;
    private javax.swing.JTextField esc;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField radio;
    private javax.swing.JTextField xinicial;
    private javax.swing.JTextField yinicial;
    // End of variables declaration//GEN-END:variables
}
