
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mehme
 */
public class MusteriDisplay extends javax.swing.JFrame {

    /**
     * Creates new form MusteriDisplay
     */
    public MusteriDisplay() {
        initComponents();
        show_musteritablo();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);

    }

    public ArrayList<Musteri> musteriList() {
        ArrayList<Musteri> musteriList = new ArrayList<>();

        PreparedStatement ps;
        ResultSet rs;
        String sqlmusteri = "select * from musteri";

        try {
            ps = DBConnection.getConnection().prepareStatement(sqlmusteri);
            rs = ps.executeQuery();
            Musteri musteri;
            while (rs.next()) {
                musteri = new Musteri(rs.getInt("musteri_id"), rs.getInt("adres_id"), rs.getString("ad"), rs.getString("soyad"), rs.getInt("telefon"), rs.getInt("yas"));
                musteriList.add(musteri);

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }
        return musteriList;

    }

    public void show_musteritablo() {
        ArrayList<Musteri> list = musteriList();
        DefaultTableModel model = (DefaultTableModel) showMusteriTable.getModel();
        Object[] row = new Object[6];
        for (int i = 0; i < list.size(); i++) {

            row[0] = list.get(i).getMusteri_id();
            row[1] = list.get(i).getAdres_id();
            row[2] = list.get(i).getAd();
            row[3] = list.get(i).getSoyad();
            row[4] = list.get(i).getTelefon();
            row[5] = list.get(i).getYas();

            model.addRow(row);

        }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        showMusteriTable = new javax.swing.JTable();
        anamenu = new javax.swing.JButton();
        musterisil = new javax.swing.JButton();
        musteriekle = new javax.swing.JButton();
        musteritemizle = new javax.swing.JButton();
        musteriguncelle = new javax.swing.JButton();
        musteri_id = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ad = new javax.swing.JTextField();
        soyad = new javax.swing.JTextField();
        yas = new javax.swing.JTextField();
        adres_id = new javax.swing.JTextField();
        telefon = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        showMusteriTable.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        showMusteriTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "musteri_id", "adres_id", "ad", "soyad", "telefon", "yas"
            }
        ));
        showMusteriTable.setRowHeight(25);
        showMusteriTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showMusteriTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(showMusteriTable);

        anamenu.setText("AnaMenü");
        anamenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anamenuActionPerformed(evt);
            }
        });

        musterisil.setText("Müşteri Sil");
        musterisil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                musterisilActionPerformed(evt);
            }
        });

        musteriekle.setText("Müşteri Ekle");
        musteriekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                musteriekleActionPerformed(evt);
            }
        });

        musteritemizle.setText("Temizle");
        musteritemizle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                musteritemizleActionPerformed(evt);
            }
        });

        musteriguncelle.setText("Müşteri Güncelle");
        musteriguncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                musteriguncelleActionPerformed(evt);
            }
        });

        musteri_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                musteri_idActionPerformed(evt);
            }
        });

        jLabel2.setText("Müşteri ID");

        jLabel3.setText("Ad");

        jLabel4.setText("Soyad");

        jLabel5.setText("Telefon");

        jLabel6.setText("Yaş");

        jLabel7.setText("Adres ID");

        ad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adActionPerformed(evt);
            }
        });

        soyad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soyadActionPerformed(evt);
            }
        });

        yas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yasActionPerformed(evt);
            }
        });

        adres_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adres_idActionPerformed(evt);
            }
        });

        telefon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(telefon, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(yas, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(soyad, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ad, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(adres_id, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(musteri_id, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 976, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(musteriekle, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(musteriguncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(musterisil, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(musteritemizle, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(anamenu, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(1334, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(musteri_id, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(adres_id, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ad, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(soyad, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(telefon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(musteriekle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(musteriguncelle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(anamenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(musterisil, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                            .addComponent(musteritemizle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(35, 35, 35)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(639, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1290, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void anamenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anamenuActionPerformed
        // TODO add your handling code here:
        MainMenu menu = new MainMenu();
        menu.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_anamenuActionPerformed

    private void musterisilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_musterisilActionPerformed
        // TODO add your handling code here:
        int opt = JOptionPane.showConfirmDialog(null, "Müşteri Silme İşlemi Onaylansın Mı?", "SİL", JOptionPane.YES_NO_OPTION);
        if (opt == 0) {
            try {
                int row = showMusteriTable.getSelectedRow();
                String valuemusteri_id = (showMusteriTable.getModel().getValueAt(row, 0).toString());
                String sqlmusterisil = "delete from musteri where musteri_id=" + valuemusteri_id;
                PreparedStatement ps = DBConnection.getConnection().prepareStatement(sqlmusterisil);
                ps.execute();
                JOptionPane.showMessageDialog(null, "Müşteri Silme İşlemi Başarılı.");
                MusteriDisplay musterid = new MusteriDisplay();
                musterid.setVisible(true);
                setVisible(false);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_musterisilActionPerformed

    private void musteriekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_musteriekleActionPerformed
        // TODO add your handling code here:
        String sqlmusteriekle = "insert into musteri(musteri_id,adres_id,ad,soyad,telefon,yas)values(?,?,?,?,?,?)";

        try {
            PreparedStatement ps = DBConnection.getConnection().prepareStatement(sqlmusteriekle);
            ps.setInt(1, Integer.parseInt(musteri_id.getText()));
            ps.setInt(2, Integer.parseInt(adres_id.getText()));
            ps.setString(3, ad.getText());
            ps.setString(4, soyad.getText());
            ps.setInt(5, Integer.parseInt(telefon.getText()));
            ps.setInt(6, Integer.parseInt(yas.getText()));

            ps.execute();
            JOptionPane.showMessageDialog(null, "Müşteri Bilgileri Başarıyla Eklendi.");
            MusteriDisplay musterid = new MusteriDisplay();
            musterid.setVisible(true);
            setVisible(false);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }

    }//GEN-LAST:event_musteriekleActionPerformed

    private void musteritemizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_musteritemizleActionPerformed
        // TODO add your handling code here:
        musteri_id.setText("");
        adres_id.setText("");
        ad.setText("");
        soyad.setText("");
        telefon.setText("");
        yas.setText("");
    }//GEN-LAST:event_musteritemizleActionPerformed

    private void musteriguncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_musteriguncelleActionPerformed
        // TODO add your handling code here:
        try {
            int row = showMusteriTable.getSelectedRow();
            String valuemusteri_id = (showMusteriTable.getModel().getValueAt(row, 0).toString());
            String valueadres_id = (showMusteriTable.getModel().getValueAt(row, 1).toString());

            String sqlmusteriguncelle = "update musteri set ad=?,soyad=?,telefon=?,yas=? where musteri_id=" + valuemusteri_id + "and adres_id=" + valueadres_id;
            PreparedStatement ps = DBConnection.getConnection().prepareStatement(sqlmusteriguncelle);

            ps.setString(1, ad.getText());
            ps.setString(2, soyad.getText());
            ps.setInt(3, Integer.parseInt(telefon.getText()));
            ps.setInt(4, Integer.parseInt(yas.getText()));

            ps.execute();
            JOptionPane.showMessageDialog(null, "Müşteri Bilgileri Başarıyla Güncellendi.");
            MusteriDisplay musterid = new MusteriDisplay();
            musterid.setVisible(true);
            setVisible(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_musteriguncelleActionPerformed

    private void musteri_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_musteri_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_musteri_idActionPerformed

    private void adActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adActionPerformed

    private void soyadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soyadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_soyadActionPerformed

    private void yasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yasActionPerformed

    private void adres_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adres_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adres_idActionPerformed

    private void telefonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefonActionPerformed

    private void showMusteriTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showMusteriTableMouseClicked
        // TODO add your handling code here:
        int i = showMusteriTable.getSelectedRow();
        TableModel model = showMusteriTable.getModel();
        musteri_id.setText(model.getValueAt(i, 0).toString());
        adres_id.setText(model.getValueAt(i, 1).toString());
        ad.setText(model.getValueAt(i, 2).toString());
        soyad.setText(model.getValueAt(i, 3).toString());
        telefon.setText(model.getValueAt(i, 4).toString());
        yas.setText(model.getValueAt(i, 5).toString());
    }//GEN-LAST:event_showMusteriTableMouseClicked

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
            java.util.logging.Logger.getLogger(MusteriDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MusteriDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MusteriDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MusteriDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MusteriDisplay().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ad;
    private javax.swing.JTextField adres_id;
    private javax.swing.JButton anamenu;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField musteri_id;
    private javax.swing.JButton musteriekle;
    private javax.swing.JButton musteriguncelle;
    private javax.swing.JButton musterisil;
    private javax.swing.JButton musteritemizle;
    private javax.swing.JTable showMusteriTable;
    private javax.swing.JTextField soyad;
    private javax.swing.JTextField telefon;
    private javax.swing.JTextField yas;
    // End of variables declaration//GEN-END:variables
}
