/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ekstrakurikuler;

/**
 *
 * @author IndahErika
 */

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class JadwalEkskul extends javax.swing.JFrame {

public Connection kon;
public login login;
private Statement stmt;
private ResultSet rsset;
private PreparedStatement ps;
private DefaultTableModel dtm;

    public void tambah(){
        idEkskul.setText("");
        ekskul.setText("");
        pembina.setText("");
        jam.setText("");
        tempat.setText("");
        
    }

    public JadwalEkskul(){
        initComponents();
        
        setTitle("Input Ekstrakurikuler");
        setLocationRelativeTo(null);
        try{
            Class.forName("com.mysql.jdbc.Driver");
            kon = DriverManager.getConnection("jdbc:mysql://localhost:3306/ekstrakurikuler","root","");
            stmt = kon.createStatement();
            
            JOptionPane.showMessageDialog(null, "Tersambung");
        } catch (Exception E) {
            JOptionPane.showMessageDialog(null, "Salah Prosedur"+E);
        }
        tampilData();
    }
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ekskul = new javax.swing.JTextField();
        pembina = new javax.swing.JTextField();
        jam = new javax.swing.JTextField();
        tempat = new javax.swing.JTextField();
        ubah = new javax.swing.JButton();
        tambah = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        idEkskul = new javax.swing.JTextField();
        lihat = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        TbTampil = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("INPUT EKSTRAKURIKULER"));

        jLabel4.setText("Nama Ekstrakurikuler");

        jLabel5.setText("Nama Pembina");

        jLabel6.setText("Jam");

        jLabel7.setText("Tempat");

        ekskul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ekskulActionPerformed(evt);
            }
        });

        tempat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tempatActionPerformed(evt);
            }
        });

        ubah.setText("Ubah");
        ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubahActionPerformed(evt);
            }
        });

        tambah.setText("Tambah");
        tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahActionPerformed(evt);
            }
        });

        hapus.setText("Hapus");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });

        jLabel8.setText("Id Ekstrakurikuler");

        lihat.setText("Lihat Data");
        lihat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lihatActionPerformed(evt);
            }
        });

        TbTampil.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id Ekskul", "Nama Ekskul", "Nama Pembina", "Jam", "Tempat"
            }
        ));
        TbTampil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TbTampilMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TbTampil);

        jScrollPane3.setViewportView(jScrollPane1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jam, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                            .addComponent(pembina, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ekskul, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tempat)
                            .addComponent(idEkskul))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(hapus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ubah, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tambah, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lihat, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)))
                    .addComponent(jScrollPane3))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tambah)
                            .addComponent(jLabel8)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(idEkskul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(ubah)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(jam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tempat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(hapus)
                                .addGap(19, 19, 19)
                                .addComponent(lihat))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(ekskul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(pembina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 0));

        jLabel2.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        jLabel2.setText("JADWAL EKSTRAKURIKULER");

        jLabel3.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        jLabel3.setText("SMP KOSGORO BOGOR");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ekstrakurikuler/logo kgr1.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jLabel2))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jLabel3)))
                .addContainerGap(205, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenu1.setText("Menu");

        jMenuItem1.setText("Logout");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ekskulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ekskulActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ekskulActionPerformed

    private void tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahActionPerformed
        try{
        String sql = "insert into ekstrakurikuler (id_ekskul, nama_ekskul, nama_pembina, jam, tempat) values ('"+idEkskul.getText()+"','"+ekskul.getText()+"','"+pembina.getText()+"','"+jam.getText()+"','"+tempat.getText()+"')";
        stmt = kon.createStatement();
        int jumlah = stmt.executeUpdate(sql);
        if (jumlah > 0){
            JOptionPane.showMessageDialog(null, "Data Ekskul Tersimpan");
            idEkskul.setText("");
            ekskul.setText("");
            pembina.setText("");
            jam.setText("");
            tempat.setText("");
        }
    }catch (SQLException e){
    JOptionPane.showMessageDialog(null," Data Ekskul Gagal Tersimpan" +e);
    }
    }//GEN-LAST:event_tambahActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        try{
            login = new login();
            login.setVisible(true);
            this.dispose();
        }catch (Exception e){
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed
    
    private void tampilData(){
         try{
        Object [] rows = {"Id Ekskul", "Nama Ekskul","Nama Pembina","Jam","Tempat"};
        dtm = new DefaultTableModel(null, rows);
        TbTampil.setModel(dtm);
        TbTampil.setBorder(null);
        jScrollPane1.setViewportView(TbTampil);
        String idEkskul="",ekskul="",pembina="",jam="",tempat="";
        try{
        String sql = "select * from ekstrakurikuler";
        stmt = kon.createStatement();
        ResultSet rsset = stmt.executeQuery(sql);
        while(rsset.next()){
            idEkskul = rsset.getString("id_ekskul");
            ekskul = rsset.getString("nama_ekskul");
            pembina = rsset.getString("nama_pembina");
            jam = rsset.getString("jam");
            tempat = rsset.getString("tempat");
            
            String [] tampil ={idEkskul,ekskul,pembina,jam,tempat};
            dtm.addRow(tampil);
        }
    }catch (Exception e){
    e.printStackTrace();
    JOptionPane.showMessageDialog(null,"Query Salah");
    }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    
    private void lihatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lihatActionPerformed
    tampilData();   
        
    }//GEN-LAST:event_lihatActionPerformed

    private void TbTampilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TbTampilMouseClicked
        int i = TbTampil.getSelectedRow();
        if(i>=0){
            idEkskul.setText(dtm.getValueAt(i,0).toString());
            ekskul.setText(dtm.getValueAt(i,1).toString());
            pembina.setText(dtm.getValueAt(i,2).toString());
            jam.setText(dtm.getValueAt(i,3).toString());
            tempat.setText(dtm.getValueAt(i,4).toString());
        }
    }//GEN-LAST:event_TbTampilMouseClicked

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        int ok = JOptionPane.showConfirmDialog(null, "Anda yakin ingin menghapus data ini?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (ok==0){
            try{
                String sql = "delete from ekstrakurikuler where id_ekskul = '"+idEkskul.getText()+"'";
                Statement stmt = kon.createStatement();
                stmt.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
                
                idEkskul.setText("");
                ekskul.setText("");
                pembina.setText("");
                jam.setText("");
                tempat.setText("");
            }catch (Exception e){
                JOptionPane.showMessageDialog(null,"Data gagal dihapus");
                
                
            }
        }
    }//GEN-LAST:event_hapusActionPerformed

    private void ubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubahActionPerformed
        try{
            String value1 = idEkskul.getText();
            String value2 = ekskul.getText();
            String value3 = pembina.getText();
            String value4 = jam.getText();
            String value5 = tempat.getText();
            String sql = "Update ekstrakurikuler set id_ekskul ='"+value1+"',nama_ekskul ='"+value2+"',nama_pembina='"+value3+"',jam='"+value4+"'"
                    +",tempat='"+value5+"'where id_ekskul = '"+value1+"'";
            ps = kon.prepareStatement(sql);
            ps.execute();
            
            JOptionPane.showMessageDialog(null, "Edit Data Sukses");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Data Gagal Diedit"+e);
        }
    }//GEN-LAST:event_ubahActionPerformed

    private void tempatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tempatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tempatActionPerformed

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
            java.util.logging.Logger.getLogger(JadwalEkskul.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JadwalEkskul.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JadwalEkskul.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JadwalEkskul.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JadwalEkskul().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TbTampil;
    private javax.swing.JTextField ekskul;
    private javax.swing.JButton hapus;
    private javax.swing.JTextField idEkskul;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jam;
    private javax.swing.JButton lihat;
    private javax.swing.JTextField pembina;
    private javax.swing.JButton tambah;
    private javax.swing.JTextField tempat;
    private javax.swing.JButton ubah;
    // End of variables declaration//GEN-END:variables
}
