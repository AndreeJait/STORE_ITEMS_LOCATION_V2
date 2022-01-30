/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import config.Constants;
import db.Database;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Product;
import utils.AppUtils;

/**
 *
 * @author bagon
 */
public class PublicViewApp extends javax.swing.JFrame {

    /**
     * Creates new form PublicViewApp
     */
    public PublicViewApp() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tfKeyword = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnFind = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblProductName = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblQuantity = new javax.swing.JLabel();
        lblLocation = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        mapHolder = new javax.swing.JPanel();
        mark = new javax.swing.JLabel();
        mapImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Public View Product");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Search Product By keyword (ID/NAME)");

        tfKeyword.setBackground(new java.awt.Color(232, 232, 232));
        tfKeyword.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tfKeyword.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 5, 10));

        jButton1.setBackground(new java.awt.Color(68, 162, 194));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Login as admin");
        jButton1.setActionCommand("");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(68, 162, 194), 1, true));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        btnFind.setBackground(new java.awt.Color(87, 208, 138));
        btnFind.setForeground(new java.awt.Color(255, 255, 255));
        btnFind.setText("Find Items");
        btnFind.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFindMouseClicked(evt);
            }
        });

        btnSearch.setBackground(new java.awt.Color(68, 162, 194));
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setText("Search Items");
        btnSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSearchMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Product Name");

        lblProductName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblProductName.setText("-");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Price");

        lblPrice.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblPrice.setText("-");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("Quantity");

        lblQuantity.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblQuantity.setText("-");

        lblLocation.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblLocation.setText("-");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setText("Location Name");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                    .addComponent(tfKeyword)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnFind, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(lblProductName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblQuantity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblLocation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfKeyword, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFind, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblProductName)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblPrice)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblQuantity)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblLocation)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        mapHolder.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mark.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        mark.setText("Your Product Here");
        mark.setVisible(false);
        mark.setIcon(new javax.swing.ImageIcon(getClass().getResource(Constants.LOCATION_MARK_IMAGE)));
        mapHolder.add(mark, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, -1, 110));

        mapImage.setIcon(new javax.swing.ImageIcon(getClass().getResource(Constants.LOCATION_MAP_IMAGE)));
        mapHolder.add(mapImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mapHolder, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mapHolder, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseClicked
        // TODO add your handling code here:
        SearchItems searchItem = new SearchItems(this, false);
        searchItem.setLocationRelativeTo(null);
        searchItem.setVisible(true);
    }//GEN-LAST:event_btnSearchMouseClicked

    private void btnFindMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFindMouseClicked
        try {
            // TODO add your handling code here:
            AppUtils.setMark(mark, this.mapImage, mapHolder, 10, 10, this);
            String key = this.tfKeyword.getText();
            String condition = "WHERE id='" + key + "' or name='" + key + "'" ;
            ResultSet rs = Database.get(Constants.TABLE_PRODUCT, condition);
            if(rs.next()){
                Product p = new Product(rs);
                String[] location = p.getLocation().split("#");
                this.setValue(p.getName(), String.valueOf(p.getPrice()), 
                        String.valueOf(p.getQuantity()), location[2]);
                AppUtils.setMark(mark, this.mapImage, mapHolder, 
                        Integer.parseInt(location[0]), 
                        Integer.parseInt(location[1]), this);
            }else{
                this.setEmpty();
                AppUtils.showDialogError(this, false, "Product " 
                        + key +" not found", "Product Not Found");
            }
        } catch (SQLException ex) {
            Logger.getLogger(PublicViewApp.class.getName()).log(Level.SEVERE, null, ex);
            AppUtils.showDialogError(this, false, ex.getMessage(), "SQL Error");
        }
    }//GEN-LAST:event_btnFindMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        AppUtils.redirctApp(this, new LoginPage());
    }//GEN-LAST:event_jButton1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblLocation;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblProductName;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JPanel mapHolder;
    private javax.swing.JLabel mapImage;
    private javax.swing.JLabel mark;
    private javax.swing.JTextField tfKeyword;
    // End of variables declaration//GEN-END:variables

    private void setEmpty(){
        this.lblProductName.setText("-");
        this.lblPrice.setText("-");
        this.lblQuantity.setText("-");
        this.lblLocation.setText("-");
        
        this.mark.setVisible(false);
    }
    
    private void setValue(String name, String price, String quantity, String location){
        this.lblProductName.setText(name);
        this.lblPrice.setText(price);
        this.lblQuantity.setText(quantity);
        this.lblLocation.setText(location);
    }
}
