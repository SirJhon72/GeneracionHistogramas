
package visualizador;

import java.awt.Color;

public class MainPanel extends javax.swing.JFrame {

    public MainPanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        InnerPanel = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        loadImage = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout InnerPanelLayout = new javax.swing.GroupLayout(InnerPanel);
        InnerPanel.setLayout(InnerPanelLayout);
        InnerPanelLayout.setHorizontalGroup(
            InnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1161, Short.MAX_VALUE)
        );
        InnerPanelLayout.setVerticalGroup(
            InnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 585, Short.MAX_VALUE)
        );

        jMenu1.setText("Imagen");

        loadImage.setText("Histograma");
        loadImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadImageActionPerformed(evt);
            }
        });
        jMenu1.add(loadImage);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Acciones");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(InnerPanel)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(InnerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loadImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadImageActionPerformed
        Histograma CI = new Histograma();
        
        CI.setBounds(0, 0, InnerPanel.getWidth(), InnerPanel.getHeight());
        CI.setVisible(true);
        this.repaint();
        InnerPanel.add(CI);
    }//GEN-LAST:event_loadImageActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane InnerPanel;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem loadImage;
    // End of variables declaration//GEN-END:variables
}
