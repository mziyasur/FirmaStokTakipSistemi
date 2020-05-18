
import Frame.BataryaSecimi;
import Frame.KargoTeslim;
import Frame.StokTemini;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
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
public class SatilanUrunDisplay extends javax.swing.JFrame {

    /**
     * Creates new form SatılanUrunEkle
     */
    public SatilanUrunDisplay() {
        initComponents();
        show_satilanuruntablo();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);

    }

    public ArrayList<SatilanUrun> satilanurunList() {
        ArrayList<SatilanUrun> satilanurunList = new ArrayList<>();

        PreparedStatement ps;
        ResultSet rs;
        String sqlsatılanurun = "SELECT\n"
                + "musteri_urun.siparis_id,musteri.musteri_id,urun.urun_id,musteri.ad,musteri.soyad,urun.urunadı,urun.urunadet,musteri_urun.siparistarihi\n"
                + "FROM\n"
                + " musteri, urun, musteri_urun\n"
                + "WHERE\n"
                + " musteri.musteri_id = musteri_urun.musteri_id\n"
                + "AND\n"
                + " urun.urun_id = musteri_urun.urun_id;";

        try {
            ps = DBConnection.getConnection().prepareStatement(sqlsatılanurun);
            rs = ps.executeQuery();
            SatilanUrun satılanurun;
            while (rs.next()) {
                satılanurun = new SatilanUrun(rs.getInt("siparis_id"), rs.getInt("musteri_id"), rs.getInt("urun_id"), rs.getString("ad"), rs.getString("soyad"), rs.getString("urunadı"), rs.getInt("urunadet"), rs.getDate("siparistarihi"));
                satilanurunList.add(satılanurun);

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }
        return satilanurunList;

    }

    public void show_satilanuruntablo() {
        ArrayList<SatilanUrun> list = satilanurunList();
        DefaultTableModel model = (DefaultTableModel) showSatilanUrunTable.getModel();
        Object[] row = new Object[8];
        for (int i = 0; i < list.size(); i++) {

            row[0] = list.get(i).getSiparis_id();
            row[1] = list.get(i).getMusteri_id();
            row[2] = list.get(i).getUrun_id();
            row[3] = list.get(i).getSiparistarihi();
            row[4] = list.get(i).getAd();
            row[5] = list.get(i).getSoyad();
            row[6] = list.get(i).getUrunadı();
            row[7] = list.get(i).getUrunadet();

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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        siparis_id = new javax.swing.JTextField();
        musteri_id = new javax.swing.JTextField();
        saturun_id = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        siptarih = new javax.swing.JTextField();
        urunsat = new javax.swing.JButton();
        anamenu = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        showSatilanUrunTable = new javax.swing.JTable();
        urunguncelle = new javax.swing.JButton();
        urunsil = new javax.swing.JButton();
        uruntemizle = new javax.swing.JButton();
        kargoteslim = new javax.swing.JButton();
        bataryasecimi = new javax.swing.JButton();
        stoktemini = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(1300, 650));

        jLabel1.setText("Sipariş ID");

        jLabel2.setText("Müşteri ID");

        jLabel3.setText("Ürün ID");

        musteri_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                musteri_idActionPerformed(evt);
            }
        });

        saturun_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saturun_idActionPerformed(evt);
            }
        });

        jLabel8.setText("Sipariş Tarihi");

        urunsat.setText("Ürün Sat");
        urunsat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                urunsatActionPerformed(evt);
            }
        });

        anamenu.setText("Ana Menü");
        anamenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anamenuActionPerformed(evt);
            }
        });

        showSatilanUrunTable.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        showSatilanUrunTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "siparis_id", "musteri_id", "urun_id", "siparistarihi", "ad", "soyad", "urunadı", "urunadet"
            }
        ));
        showSatilanUrunTable.setRowHeight(25);
        showSatilanUrunTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showSatilanUrunTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(showSatilanUrunTable);

        urunguncelle.setText("Satılan Güncelle");
        urunguncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                urunguncelleActionPerformed(evt);
            }
        });

        urunsil.setText("ÜrünSatışİptal");
        urunsil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                urunsilActionPerformed(evt);
            }
        });

        uruntemizle.setText("Temizle");
        uruntemizle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uruntemizleActionPerformed(evt);
            }
        });

        kargoteslim.setText("Çalışılacak Kargo Şirketi");
        kargoteslim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kargoteslimActionPerformed(evt);
            }
        });

        bataryasecimi.setText("Ürün İçin Batarya(Musluk) Seçimi");
        bataryasecimi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bataryasecimiActionPerformed(evt);
            }
        });

        stoktemini.setText("Stok Temini İşlemi");
        stoktemini.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stokteminiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(urunsat, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(urunsil, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(urunguncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(uruntemizle, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(anamenu, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(siparis_id, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                            .addComponent(musteri_id)
                            .addComponent(saturun_id)
                            .addComponent(siptarih)))
                    .addComponent(kargoteslim, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bataryasecimi, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stoktemini, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jScrollPane1))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, 0)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(siparis_id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(musteri_id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(saturun_id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(siptarih, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addComponent(kargoteslim, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(bataryasecimi, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(stoktemini, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(urunsat, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                    .addComponent(urunsil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(anamenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(urunguncelle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(uruntemizle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void uruntemizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uruntemizleActionPerformed
        // TODO add your handling code here:
        siparis_id.setText("");
        musteri_id.setText("");
        saturun_id.setText("");
        siptarih.setText("");


    }//GEN-LAST:event_uruntemizleActionPerformed

    private void urunsatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_urunsatActionPerformed

        String sqlsatilanurun = "insert into musteri_urun(siparis_id,musteri_id,urun_id,siparistarihi)values(?,?,?,?)";
        try {
            PreparedStatement ps = DBConnection.getConnection().prepareStatement(sqlsatilanurun);
            ps.setInt(1, Integer.parseInt(siparis_id.getText()));
            ps.setInt(2, Integer.parseInt(musteri_id.getText()));
            ps.setInt(3, Integer.parseInt(saturun_id.getText()));
            ps.setDate(4, Date.valueOf(siptarih.getText()));

            ps.execute();
            JOptionPane.showMessageDialog(null, "Satılan Ürün Başarıyla Eklendi.");
            SatilanUrunDisplay satiland = new SatilanUrunDisplay();
            satiland.setVisible(true);
            setVisible(false);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }


    }//GEN-LAST:event_urunsatActionPerformed

    private void saturun_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saturun_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saturun_idActionPerformed

    private void musteri_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_musteri_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_musteri_idActionPerformed

    private void anamenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anamenuActionPerformed
        // TODO add your handling code here:
        MainMenu menu = new MainMenu();
        menu.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_anamenuActionPerformed

    private void showSatilanUrunTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showSatilanUrunTableMouseClicked
        // TODO add your handling code here:
        int i = showSatilanUrunTable.getSelectedRow();
        TableModel model = showSatilanUrunTable.getModel();
        siparis_id.setText(model.getValueAt(i, 0).toString());
        musteri_id.setText(model.getValueAt(i, 1).toString());
        saturun_id.setText(model.getValueAt(i, 2).toString());
        siptarih.setText(model.getValueAt(i, 3).toString());
        //ad.setText(model.getValueAt(i, 3).toString());
        //soyad.setText(model.getValueAt(i, 4).toString());
        //urunad.setText(model.getValueAt(i, 5).toString());
        //urunadedi.setText(model.getValueAt(i, 6).toString());


    }//GEN-LAST:event_showSatilanUrunTableMouseClicked

    private void urunguncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_urunguncelleActionPerformed
        // TODO add your handling code here:

        try {
            int row = showSatilanUrunTable.getSelectedRow();
            String valuesiparis_id = (showSatilanUrunTable.getModel().getValueAt(row, 0).toString());

            String sqlmusteriguncelle = "update musteri_urun set musteri_id=?,urun_id=?,siparistarihi=? where siparis_id=" + valuesiparis_id;
            PreparedStatement ps = DBConnection.getConnection().prepareStatement(sqlmusteriguncelle);

            ps.setInt(1, Integer.parseInt(musteri_id.getText()));
            ps.setInt(2, Integer.parseInt(saturun_id.getText()));
            ps.setDate(3, Date.valueOf(siptarih.getText()));

            ps.execute();
            JOptionPane.showMessageDialog(null, "Satılan Ürün Bilgileri Başarıyla Güncellendi.");
            SatilanUrunDisplay satiland = new SatilanUrunDisplay();
            satiland.setVisible(true);
            setVisible(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }


    }//GEN-LAST:event_urunguncelleActionPerformed

    private void urunsilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_urunsilActionPerformed
        // TODO add your handling code here:

        int opt = JOptionPane.showConfirmDialog(null, "Sipariş iptali Onaylansın Mı?", "İPTAL", JOptionPane.YES_NO_OPTION);
        if (opt == 0) {
            try {
                int row = showSatilanUrunTable.getSelectedRow();
                String valuesiparis_id = (showSatilanUrunTable.getModel().getValueAt(row, 0).toString());
                String sqlsiparisiptal = "delete from musteri_urun where siparis_id=" + valuesiparis_id;
                PreparedStatement ps = DBConnection.getConnection().prepareStatement(sqlsiparisiptal);
                ps.execute();
                JOptionPane.showMessageDialog(null, "Sipariş Başarıyla İptal Edildi.");
                SatilanUrunDisplay satiland = new SatilanUrunDisplay();
                satiland.setVisible(true);
                setVisible(false);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }

    }//GEN-LAST:event_urunsilActionPerformed

    private void kargoteslimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kargoteslimActionPerformed
        // TODO add your handling code here:
        KargoTeslim kargot = new KargoTeslim();
        kargot.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_kargoteslimActionPerformed

    private void bataryasecimiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bataryasecimiActionPerformed
        // TODO add your handling code here:
        BataryaSecimi bataryas = new BataryaSecimi();
        bataryas.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_bataryasecimiActionPerformed

    private void stokteminiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stokteminiActionPerformed
        // TODO add your handling code here:
        StokTemini stokt = new StokTemini();
        stokt.setVisible(true);
        setVisible(false);

    }//GEN-LAST:event_stokteminiActionPerformed

    private void urun_idActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SatilanUrunDisplay().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton anamenu;
    private javax.swing.JButton bataryasecimi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton kargoteslim;
    private javax.swing.JTextField musteri_id;
    private javax.swing.JTextField saturun_id;
    private javax.swing.JTable showSatilanUrunTable;
    private javax.swing.JTextField siparis_id;
    private javax.swing.JTextField siptarih;
    private javax.swing.JButton stoktemini;
    private javax.swing.JButton urunguncelle;
    private javax.swing.JButton urunsat;
    private javax.swing.JButton urunsil;
    private javax.swing.JButton uruntemizle;
    // End of variables declaration//GEN-END:variables
}