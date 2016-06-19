/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment8;

import BookLibrary.BookLibrary;

/**
 *
 * @author Tori Lentz
 */
public class Assignment_8_ObjectCounterUI extends javax.swing.JFrame {

    /**
     * Creates new form Assignment_8_ObjectCounterUI
     */
    public Assignment_8_ObjectCounterUI() {
        initComponents();
        m_tfNow.setText(booklibrary.getLib().toString());
    }
BookLibrary booklibrary = new BookLibrary();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        m_tlTitile = new javax.swing.JLabel();
        m_tlNow = new javax.swing.JLabel();
        m_tlBoughtSold = new javax.swing.JLabel();
        m_btnBought = new javax.swing.JButton();
        m_btnSold = new javax.swing.JButton();
        m_tfNow = new javax.swing.JTextField();
        m_tfBoughtSold = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        m_tlTitile.setFont(new java.awt.Font("Papyrus", 0, 20)); // NOI18N
        m_tlTitile.setText("How many books do you have?");

        m_tlNow.setFont(new java.awt.Font("Papyrus", 0, 12)); // NOI18N
        m_tlNow.setText("Current Library Amount:");

        m_tlBoughtSold.setFont(new java.awt.Font("Papyrus", 0, 12)); // NOI18N
        m_tlBoughtSold.setText("Amount of books bought or sold:");

        m_btnBought.setBackground(new java.awt.Color(102, 102, 255));
        m_btnBought.setFont(new java.awt.Font("Papyrus", 0, 14)); // NOI18N
        m_btnBought.setForeground(new java.awt.Color(255, 255, 255));
        m_btnBought.setText("Bought");
        m_btnBought.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_btnBoughtActionPerformed(evt);
            }
        });

        m_btnSold.setBackground(new java.awt.Color(102, 102, 255));
        m_btnSold.setFont(new java.awt.Font("Papyrus", 0, 12)); // NOI18N
        m_btnSold.setForeground(new java.awt.Color(255, 255, 255));
        m_btnSold.setText("Sold");
        m_btnSold.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_btnSoldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(m_tlBoughtSold))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(m_tlNow))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(m_btnBought)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(m_btnSold))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(m_tfBoughtSold, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                                    .addComponent(m_tfNow)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(m_tlTitile)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(m_tlTitile)
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(m_tlNow)
                    .addComponent(m_tfNow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(m_tlBoughtSold)
                    .addComponent(m_tfBoughtSold, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(m_btnBought)
                    .addComponent(m_btnSold))
                .addGap(0, 40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void m_btnBoughtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_btnBoughtActionPerformed
        /*Float Now = getNow();*/
        Float TransAmt = getBoughtSold();
        booklibrary.Bought(TransAmt);
        UpdateNow();
        /*setNow(Now + TransAmt);*/
    }//GEN-LAST:event_m_btnBoughtActionPerformed

    private void m_btnSoldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_btnSoldActionPerformed
       /*Float Now = getNow();*/
       Float  TransAmt = getBoughtSold();
       booklibrary.Sold(TransAmt);
       UpdateNow();
       /*setNow(Now - TransAmt);*/
    }//GEN-LAST:event_m_btnSoldActionPerformed

    private void UpdateNow() {
    m_tfNow.setText(booklibrary.getLib().toString());
    }
   /*private void setNow(Float value){
        m_tfNow.setText(Float.toString(value));
    }
    private Float getNow(){
        return Float.parseFloat(m_tfNow.getText());
    }*/
    private void setBoughtSold(Float value){
        m_tfBoughtSold.setText(Float.toString(value));
    }
    private Float getBoughtSold(){
        return Float.parseFloat(m_tfBoughtSold.getText());
    }                 
                     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton m_btnBought;
    private javax.swing.JButton m_btnSold;
    private javax.swing.JTextField m_tfBoughtSold;
    private javax.swing.JTextField m_tfNow;
    private javax.swing.JLabel m_tlBoughtSold;
    private javax.swing.JLabel m_tlNow;
    private javax.swing.JLabel m_tlTitile;
    // End of variables declaration//GEN-END:variables
}
