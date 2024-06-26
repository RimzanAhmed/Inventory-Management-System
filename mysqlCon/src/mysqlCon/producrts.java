/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mysqlCon;
import java.sql.DriverManager;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.ResultSetMetaData;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;



public class producrts extends javax.swing.JFrame {
    
    
 
     
   private static final String username="root";
   private static final String password="";
   private static final String url="jdbc:mysql://localhost:3306/data";
   
   Connection sqlcon=null;
   PreparedStatement pst=null;
   ResultSet rs=null;
   
   int q, i, id, deleteitem;
    public producrts() {
        initComponents();
        addRowTable();
        
    }
   public class Product {
          @Override
    public String toString() {
        return "Name: "+productName + ",Catogary: "+catogary + ",Price: $"+price+ ",Quantity: "+quantity+ ",AvailableStock: "+availableStock ;
    }
    
    int productid;
    String productName;
    String catogary;
    int price;
    int quantity;
    int availableStock;
   
   
   public Product(int productid ,String productName, String catogary,int price,int quantity,int availableStock){
        this.productid=productid;
        this.productName=productName;
        this.catogary=catogary;
        this.price=price;
        this.quantity=quantity;
        this.availableStock=availableStock;
        
    }

    public int getProductid() {
        return productid;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCatogary() {
        return catogary;
    }

    public void setCatogary(String catogary) {
        this.catogary = catogary;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getAvailableStock() {
        return availableStock;
    }

    public void setAvailableStock(int availableStock) {
        this.availableStock = availableStock;
    }
        

}
     public ArrayList ListUser(){
   ArrayList<Product> list = new ArrayList<Product>();
      Product p1= new Product (1,"dcd","cdc",1,1,1);
       Product p2= new Product (2,"dc","de",1,1,1);
 Product p3= new Product (3,"er","ed",13,15,16);
 Product p4= new Product (4,"cdc","cdc",15,1,1);
 Product p5= new Product (5,"cdc","cdc",1,51,1);
 Product p6= new Product (6,"dc","dcdc",1,71,1);
       list.add(p1);
list.add(p2);
list.add(p3);
list.add(p4);
list.add(p5);
list.add(p6);
      return list;
}
public void addRowTable(){
     DefaultTableModel model = (DefaultTableModel )jTable1.getModel();
                ArrayList<Product> list = ListUser();
Object rowData[]= new Object[4];
for(int i=0; i < list.size(); i++){
rowData[0] = list.get(i).productid;
rowData[0] = list.get(i).productName;
rowData[0] = list.get(i).catogary;
rowData[0] = list.get(i).price;
rowData[0] = list.get(i).quantity;
rowData[0] = list.get(i).availableStock;
model.addRow(rowData);
}
}
        
        public void update(){
            try{
                Class.forName("com.mysql.jdbc.Driver");
                
                 sqlcon=(Connection) DriverManager.getConnection(url, username, password);
                pst=(PreparedStatement) sqlcon.prepareStatement("select * from product"); 
                
               rs=(ResultSet) pst.executeQuery();
                ResultSetMetaData stdata=(ResultSetMetaData) rs.getMetaData();
               
                 q= stdata.getColumnCount();
                 
               DefaultTableModel RecordTable= (DefaultTableModel )jTable1.getModel();
                 RecordTable.setRowCount(0);
                 
                 while(rs.next()){
                     Vector columnData=new Vector();
                     for(i=1;i<= q; i++){
                        columnData.add(rs.getString("id"));
                         columnData.add(rs.getString("productid"));
                         columnData.add(rs.getString("productName"));
                         columnData.add(rs.getString("catogary"));
                         columnData.add(rs.getString("price"));
                         columnData.add(rs.getString("quantity"));
                         columnData.add(rs.getString("availableStock"));
                         
                     }
                    RecordTable.addRow(columnData);
                 }
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
        }
                
        }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        stoke = new javax.swing.JLabel();
        jTextstoke = new javax.swing.JTextField();
        name = new javax.swing.JLabel();
        verity = new javax.swing.JLabel();
        rate = new javax.swing.JLabel();
        quantity = new javax.swing.JLabel();
        jTextid = new javax.swing.JTextField();
        jTextname = new javax.swing.JTextField();
        jTextcatogary = new javax.swing.JTextField();
        jTextrate = new javax.swing.JTextField();
        jTextquantity = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        iddd = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        delete = new javax.swing.JButton();
        add = new javax.swing.JButton();
        update = new javax.swing.JButton();
        print = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 153));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 7));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 7));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        stoke.setText("availableStoke");
        jPanel3.add(stoke, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 110, 20));
        jPanel3.add(jTextstoke, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 280, -1));

        name.setText("productName");
        jPanel3.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 110, 20));

        verity.setText("catagory");
        jPanel3.add(verity, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 110, 20));

        rate.setText("price");
        jPanel3.add(rate, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 110, 20));

        quantity.setText("quantity");
        jPanel3.add(quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 110, 20));

        jTextid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextidActionPerformed(evt);
            }
        });
        jPanel3.add(jTextid, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 280, -1));
        jPanel3.add(jTextname, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 280, -1));

        jTextcatogary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextcatogaryActionPerformed(evt);
            }
        });
        jPanel3.add(jTextcatogary, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 280, -1));
        jPanel3.add(jTextrate, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 280, -1));
        jPanel3.add(jTextquantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 280, -1));

        jTable1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "productid", "productName", "catogary", "price", "quantity", "availabeStoke"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, 140));

        iddd.setText("productid");
        jPanel3.add(iddd, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 500, 450));

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 7));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        delete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel4.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, -1, -1));

        add.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        add.setText("Add New Data");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel4.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, -1, -1));

        update.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        update.setText("Update Data");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel4.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, -1));

        print.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        print.setText("Print");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });
        jPanel4.add(print, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, -1, -1));

        reset.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        jPanel4.add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, -1, -1));

        exit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        exit.setText("Exits");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel4.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, -1, 70));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 160, 270, 450));

        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("MY SQL PRODUCTS");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(237, 237, 237)
                .addComponent(jLabel1)
                .addContainerGap(268, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 730, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 820, 620));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
          DefaultTableModel RecordTable= (DefaultTableModel )jTable1.getModel();
                 int SelectedRows = jTable1.getSelectedRow();
                 
                 try{
                     id = Integer.parseInt(RecordTable.getValueAt(SelectedRows, 0).toString());
                Class.forName("com.mysql.jdbc.Driver");
                 sqlcon=(Connection) DriverManager.getConnection(url, username, password);
                 pst=(PreparedStatement) sqlcon.prepareStatement
("update product set productid=?, productName=?, catogary=?, price=?, quantity=?, availableStock=? where id =? ");
               
                 
                 /*int i = jTable1.getSelectedRow();
                DefaultTableModel RecordTable= (DefaultTableModel )jTable1.getModel();
                if(i >=0){*/
                    
                
                pst.setString(1,jTextid.getText());
                pst.setString(2,jTextname.getText());
                pst.setString(3,jTextcatogary.getText());
                pst.setString(4,jTextrate.getText());
                pst.setString(5,jTextquantity.getText());
                pst.setString(6, jTextstoke.getText());
                  
                     pst.executeUpdate();
                     JOptionPane.showMessageDialog(this, "record updated");
                     update();
          }
           catch(ClassNotFoundException e){
              java.util.logging.Logger.getLogger(producrts.class.getName()).log(java.util.logging.Level.SEVERE,null,e);
              
          }
          
          catch(Exception e){
              java.util.logging.Logger.getLogger(producrts.class.getName()).log(java.util.logging.Level.SEVERE,null,e);
              
}
      
    }//GEN-LAST:event_updateActionPerformed

    private void jTextcatogaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextcatogaryActionPerformed
        
    }//GEN-LAST:event_jTextcatogaryActionPerformed
private JFrame frame; 
    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
      frame = new JFrame("Exit");
      if(JOptionPane.showConfirmDialog(frame,"confirm exit","mysqlconnn",JOptionPane.YES_NO_OPTION)
              ==JOptionPane.YES_OPTION){
          
      }
     System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
     jTextid.setText("");
     jTextname.setText("");
    jTextcatogary.setText("");
     jTextrate.setText("");
    
     jTextquantity.setText("");
     jTextstoke.setText("");
    }//GEN-LAST:event_resetActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
          try{
                Class.forName("com.mysql.jdbc.Driver");
                 sqlcon=(Connection) DriverManager.getConnection(url, username, password);
pst=(PreparedStatement) sqlcon.prepareStatement("insert into product(productid, productName, catogary, price, quantity, availableStock) values(?,?,?,?,?,?)");
                
                pst.setString(1,jTextid.getText());
                pst.setString(2,jTextname.getText());
                pst.setString(3,jTextcatogary.getText());
                pst.setString(4,jTextrate.getText());
                pst.setString(5,jTextquantity.getText());
                pst.setString(6, jTextstoke.getText());
                     
                     pst.executeUpdate();
                     JOptionPane.showMessageDialog(this, "record add");
                     update();
          }
           catch(ClassNotFoundException e){
              java.util.logging.Logger.getLogger(producrts.class.getName()).log(java.util.logging.Level.SEVERE,null,e);
              
          }
          
          catch(Exception e){
              java.util.logging.Logger.getLogger(producrts.class.getName()).log(java.util.logging.Level.SEVERE,null,e);
              
          }
    }//GEN-LAST:event_addActionPerformed

    private void jTextidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextidActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        DefaultTableModel RecordTable= (DefaultTableModel )jTable1.getModel();
                 int SelectedRows = jTable1.getSelectedRow();
           jTextid.setText(RecordTable.getValueAt(SelectedRows ,1).toString() )  ;   
           jTextname.setText(RecordTable.getValueAt(SelectedRows ,1).toString() )  ;
           jTextcatogary.setText(RecordTable.getValueAt(SelectedRows ,1).toString() )  ;
           jTextrate.setText(RecordTable.getValueAt(SelectedRows ,1).toString() )  ;
           jTextquantity.setText(RecordTable.getValueAt(SelectedRows ,1).toString() )  ;
           jTextstoke.setText(RecordTable.getValueAt(SelectedRows ,1).toString() )  ;
    }//GEN-LAST:event_jTable1MouseClicked

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
       MessageFormat header = new MessageFormat("printing in progress");
        MessageFormat footer = new MessageFormat("page {0, number, Integer}");
        
        try{
          jTable1.print(JTable.PrintMode.NORMAL, header, footer);
        }
        catch(java.awt.print.PrinterException e){
            System.err.format("no Printer found", e.getMessage());
        }
    }//GEN-LAST:event_printActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        DefaultTableModel RecordTable= (DefaultTableModel )jTable1.getModel();
                 int SelectedRows = jTable1.getSelectedRow();
                 
                 try{
                     id = Integer.parseInt(RecordTable.getValueAt(SelectedRows, 0).toString());
                     deleteitem = JOptionPane.showConfirmDialog(null, "if you want delete", "warning", JOptionPane.YES_NO_OPTION);
                     if(deleteitem ==JOptionPane.YES_OPTION){
                         
                     
                     Class.forName("com.mysql.jdbc.Driver");
                 sqlcon=(Connection) DriverManager.getConnection(url, username, password);
                 pst=(PreparedStatement) sqlcon.prepareStatement("delete from product where id =? ");
                 pst.setInt(1, id);
                  pst.executeUpdate();
                     JOptionPane.showMessageDialog(this, "record updated");
                     update();
                     
                       jTextid.setText("");
                       jTextid.requestFocus();
     jTextname.setText("");
    jTextcatogary.setText("");
     jTextrate.setText("");
    
     jTextquantity.setText("");
     jTextstoke.setText("");
                 }
    }//GEN-LAST:event_deleteActionPerformed
            catch(ClassNotFoundException ex){
              java.util.logging.Logger.getLogger(producrts.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
              
          }
          
          catch(Exception ex){
             System.err.println(ex);
              
          }
    }
  
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
            java.util.logging.Logger.getLogger(producrts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(producrts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(producrts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(producrts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new producrts().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton delete;
    private javax.swing.JButton exit;
    private javax.swing.JLabel iddd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextcatogary;
    private javax.swing.JTextField jTextid;
    private javax.swing.JTextField jTextname;
    private javax.swing.JTextField jTextquantity;
    private javax.swing.JTextField jTextrate;
    private javax.swing.JTextField jTextstoke;
    private javax.swing.JLabel name;
    private javax.swing.JButton print;
    private javax.swing.JLabel quantity;
    private javax.swing.JLabel rate;
    private javax.swing.JButton reset;
    private javax.swing.JLabel stoke;
    private javax.swing.JButton update;
    private javax.swing.JLabel verity;
    // End of variables declaration//GEN-END:variables
}
