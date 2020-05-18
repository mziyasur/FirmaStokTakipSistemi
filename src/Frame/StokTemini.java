/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;

import StokTemini.DepoMuduruHandler;
import StokTemini.DepoPersoneliHandler;
import StokTemini.GenelMudurHandler;
import StokTemini.GenelMudurYardimcisiHandler;
import StokTemini.Handler;
import StokTemini.Personel;
import StokTemini.PersonelType;
import StokTemini.SatinAlmaMuduruHandler;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Arrays;

/**
 *
 * @author mehme
 */
public class StokTemini extends javax.swing.JFrame {

    /**
     * Creates new form StokTemini
     */
    public StokTemini() {
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
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
        jLabel7 = new javax.swing.JLabel();
        teminadet = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        teminurun = new javax.swing.JTextField();
        depopersonelbutton = new javax.swing.JButton();
        genelmuduryrdbutton = new javax.swing.JButton();
        satınalmamudurbutton = new javax.swing.JButton();
        depomudurubutton = new javax.swing.JButton();
        genelmudurbutton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(102, 102, 102));
        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel1.setText("                                Stok Temini İsteği");

        jLabel7.setText("Hangi Üründen Temin Edilecek ? ");

        jLabel8.setText("Kaç Adet İsteniyor ? ");

        teminurun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teminurunActionPerformed(evt);
            }
        });

        depopersonelbutton.setText("Depo Personeline Bildir");
        depopersonelbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depopersonelbuttonActionPerformed(evt);
            }
        });

        genelmuduryrdbutton.setText("Genel Müdür Yrd. Bildir");
        genelmuduryrdbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genelmuduryrdbuttonActionPerformed(evt);
            }
        });

        satınalmamudurbutton.setText("Satın Alma Müdürüne Bildir");
        satınalmamudurbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                satınalmamudurbuttonActionPerformed(evt);
            }
        });

        depomudurubutton.setText("Depo Müdürüne Bildir");
        depomudurubutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depomudurubuttonActionPerformed(evt);
            }
        });

        genelmudurbutton.setText("Genel Müdüre Bildir");
        genelmudurbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genelmudurbuttonActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(102, 102, 102)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(teminurun, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(teminadet, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(depopersonelbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(depomudurubutton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(genelmuduryrdbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addComponent(genelmudurbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(satınalmamudurbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teminurun, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teminadet, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(depopersonelbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(depomudurubutton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genelmuduryrdbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genelmudurbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(satınalmamudurbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void teminurunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teminurunActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_teminurunActionPerformed

    private void depopersonelbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depopersonelbuttonActionPerformed
        // TODO add your handling code here:
        /*jTextArea1.setText(teminurun.getText() + " Adlı Üründen " + teminadet.getText() + " adet Temini İçin İşlem Başlatıldı.\n\n"
                + "Depo Personeli > Yetki Yeterli Değil Stok Alımı İşi Üst Makama İletildi. > Depo Müdürü\n"
                + "Depo Müdürü > Yetki Yeterli Değil Stok Alımı İşi Üst Makama İletildi. > Genel Müdür Yardımcısı\n"
                + "Genel Müdür Yardımcısı > Yetki Yeterli Değil Stok Alımı İşi Üst Makama İletildi. > Genel Müdür\n"
                + "Genel Müdür > Yetki Yeterli Değil Stok Alımı İşi Üst Makama İletildi. > Satın Alma Müdürü\n"
                + "İşlem Stok Alımcıya ulaştı > SatinAlmaMuduru Stok Satın Alma Müdürü tarafından temin edilecek.");
         */
        Handler depoPersonel = new DepoPersoneliHandler("Depo Personeli");
        Handler depoMudur = new DepoMuduruHandler("Depo Müdürü");
        Handler genelMudurYardimcisi = new GenelMudurYardimcisiHandler("Genel Müdür Yardımcısı");
        Handler genelMudur = new GenelMudurHandler("Genel Müdür");
        Handler satinalmaMudur = new SatinAlmaMuduruHandler("Satın Alma Müdürü");

        depoPersonel.setHandler(depoMudur);
        depoMudur.setHandler(genelMudurYardimcisi);
        genelMudurYardimcisi.setHandler(genelMudur);
        genelMudur.setHandler(satinalmaMudur);

        Personel personel = new Personel("Depocu", PersonelType.DepoPersoneli, " > ");

        personel = new Personel("DepoMüdürü", PersonelType.DepoMuduru, ">>");

        personel = new Personel("GenelMüdürYard", PersonelType.GenelMudurYardimcisi, ">>>");

        personel = new Personel("GenelMüdür", PersonelType.GenelMudur, ">>>");

        personel = new Personel("SatınAlmaMüdür", PersonelType.SatinAlmaMuduru, ">>>");

        jTextArea1.setText(teminurun.getText() + " Adlı Üründen " + teminadet.getText() + " adet Temini İçin İşlem Başlatıldı.\n\n"
                + Arrays.toString(depoPersonel.process(personel)));

    }//GEN-LAST:event_depopersonelbuttonActionPerformed

    private void genelmuduryrdbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genelmuduryrdbuttonActionPerformed
        // TODO add your handling code here:
        /*jTextArea1.setText(teminurun.getText() + " Adlı Üründen " + teminadet.getText() + " adet Temini İçin İşlem Başlatıldı.\n\n"
                + "Genel Müdür Yardımcısı > Yetki Yeterli Değil Stok Alımı İşi Üst Makama İletildi. > Genel Müdür\n"
                + "Genel Müdür > Yetki Yeterli Değil Stok Alımı İşi Üst Makama İletildi. > Satın Alma Müdürü\n"
                + "İşlem Stok Alımcıya ulaştı > SatinAlmaMuduru Stok Satın Alma Müdürü tarafından temin edilecek.");
         */
        Handler depoPersonel = new DepoPersoneliHandler("Depo Personeli");
        Handler depoMudur = new DepoMuduruHandler("Depo Müdürü");
        Handler genelMudurYardimcisi = new GenelMudurYardimcisiHandler("Genel Müdür Yardımcısı");
        Handler genelMudur = new GenelMudurHandler("Genel Müdür");
        Handler satinalmaMudur = new SatinAlmaMuduruHandler("Satın Alma Müdürü");

        depoPersonel.setHandler(depoMudur);
        depoMudur.setHandler(genelMudurYardimcisi);
        genelMudurYardimcisi.setHandler(genelMudur);
        genelMudur.setHandler(satinalmaMudur);

        Personel personel = new Personel("Depocu", PersonelType.DepoPersoneli, " > ");

        personel = new Personel("DepoMüdürü", PersonelType.DepoMuduru, ">>");

        personel = new Personel("GenelMüdürYard", PersonelType.GenelMudurYardimcisi, ">>>");

        personel = new Personel("GenelMüdür", PersonelType.GenelMudur, ">>>");

        personel = new Personel("SatınAlmaMüdür", PersonelType.SatinAlmaMuduru, ">>>");

        jTextArea1.setText(teminurun.getText() + " Adlı Üründen " + teminadet.getText() + " adet Temini İçin İşlem Başlatıldı.\n\n"
                + Arrays.toString(genelMudurYardimcisi.process(personel)));

    }//GEN-LAST:event_genelmuduryrdbuttonActionPerformed

    private void satınalmamudurbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_satınalmamudurbuttonActionPerformed
        // TODO add your handling code here:
        /*jTextArea1.setText(teminurun.getText() + " Adlı Üründen " + teminadet.getText() + " adet Temini İçin İşlem Başlatıldı.\n\n"
                + "İşlem Stok Alımcıya ulaştı > SatinAlmaMuduru Stok Satın Alma Müdürü tarafından temin edilecek.");*/
        Handler depoPersonel = new DepoPersoneliHandler("Depo Personeli");
        Handler depoMudur = new DepoMuduruHandler("Depo Müdürü");
        Handler genelMudurYardimcisi = new GenelMudurYardimcisiHandler("Genel Müdür Yardımcısı");
        Handler genelMudur = new GenelMudurHandler("Genel Müdür");
        Handler satinalmaMudur = new SatinAlmaMuduruHandler("Satın Alma Müdürü");

        depoPersonel.setHandler(depoMudur);
        depoMudur.setHandler(genelMudurYardimcisi);
        genelMudurYardimcisi.setHandler(genelMudur);
        genelMudur.setHandler(satinalmaMudur);

        Personel personel = new Personel("Depocu", PersonelType.DepoPersoneli, " > ");

        personel = new Personel("DepoMüdürü", PersonelType.DepoMuduru, ">>");

        personel = new Personel("GenelMüdürYard", PersonelType.GenelMudurYardimcisi, ">>>");

        personel = new Personel("GenelMüdür", PersonelType.GenelMudur, ">>>");

        personel = new Personel("SatınAlmaMüdür", PersonelType.SatinAlmaMuduru, ">>>");

        jTextArea1.setText(teminurun.getText() + " Adlı Üründen " + teminadet.getText() + " adet Temini İçin İşlem Başlatıldı.\n\n"
                + Arrays.toString(satinalmaMudur.process(personel)));
    }//GEN-LAST:event_satınalmamudurbuttonActionPerformed

    private void depomudurubuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depomudurubuttonActionPerformed
        // TODO add your handling code here:
        /*jTextArea1.setText(teminurun.getText() + " Adlı Üründen " + teminadet.getText() + " adet Temini İçin İşlem Başlatıldı.\n\n"
                + "Depo Müdürü > Yetki Yeterli Değil Stok Alımı İşi Üst Makama İletildi. > Genel Müdür Yardımcısı\n"
                + "Genel Müdür Yardımcısı > Yetki Yeterli Değil Stok Alımı İşi Üst Makama İletildi. > Genel Müdür\n"
                + "Genel Müdür > Yetki Yeterli Değil Stok Alımı İşi Üst Makama İletildi. > Satın Alma Müdürü\n"
                + "İşlem Stok Alımcıya ulaştı > SatinAlmaMuduru Stok Satın Alma Müdürü tarafından temin edilecek.");
         */
        Handler depoPersonel = new DepoPersoneliHandler("Depo Personeli");
        Handler depoMudur = new DepoMuduruHandler("Depo Müdürü");
        Handler genelMudurYardimcisi = new GenelMudurYardimcisiHandler("Genel Müdür Yardımcısı");
        Handler genelMudur = new GenelMudurHandler("Genel Müdür");
        Handler satinalmaMudur = new SatinAlmaMuduruHandler("Satın Alma Müdürü");

        depoPersonel.setHandler(depoMudur);
        depoMudur.setHandler(genelMudurYardimcisi);
        genelMudurYardimcisi.setHandler(genelMudur);
        genelMudur.setHandler(satinalmaMudur);

        Personel personel = new Personel("Depocu", PersonelType.DepoPersoneli, " > ");

        personel = new Personel("DepoMüdürü", PersonelType.DepoMuduru, ">>");

        personel = new Personel("GenelMüdürYard", PersonelType.GenelMudurYardimcisi, ">>>");

        personel = new Personel("GenelMüdür", PersonelType.GenelMudur, ">>>");

        personel = new Personel("SatınAlmaMüdür", PersonelType.SatinAlmaMuduru, ">>>");

        jTextArea1.setText(teminurun.getText() + " Adlı Üründen " + teminadet.getText() + " adet Temini İçin İşlem Başlatıldı.\n\n"
                + Arrays.toString(depoMudur.process(personel)));

    }//GEN-LAST:event_depomudurubuttonActionPerformed

    private void genelmudurbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genelmudurbuttonActionPerformed
        // TODO add your handling code here:
        /*jTextArea1.setText(teminurun.getText() + " Adlı Üründen " + teminadet.getText() + " adet Temini İçin İşlem Başlatıldı.\n\n"
                + "Genel Müdür > Yetki Yeterli Değil Stok Alımı İşi Üst Makama İletildi. > Satın Alma Müdürü\n"
                + "İşlem Stok Alımcıya ulaştı > SatinAlmaMuduru Stok Satın Alma Müdürü tarafından temin edilecek.");
         */
        Handler depoPersonel = new DepoPersoneliHandler("Depo Personeli");
        Handler depoMudur = new DepoMuduruHandler("Depo Müdürü");
        Handler genelMudurYardimcisi = new GenelMudurYardimcisiHandler("Genel Müdür Yardımcısı");
        Handler genelMudur = new GenelMudurHandler("Genel Müdür");
        Handler satinalmaMudur = new SatinAlmaMuduruHandler("Satın Alma Müdürü");

        depoPersonel.setHandler(depoMudur);
        depoMudur.setHandler(genelMudurYardimcisi);
        genelMudurYardimcisi.setHandler(genelMudur);
        genelMudur.setHandler(satinalmaMudur);

        Personel personel = new Personel("Depocu", PersonelType.DepoPersoneli, " > ");

        personel = new Personel("DepoMüdürü", PersonelType.DepoMuduru, ">>");

        personel = new Personel("GenelMüdürYard", PersonelType.GenelMudurYardimcisi, ">>>");

        personel = new Personel("GenelMüdür", PersonelType.GenelMudur, ">>>");

        personel = new Personel("SatınAlmaMüdür", PersonelType.SatinAlmaMuduru, ">>>");

        jTextArea1.setText(teminurun.getText() + " Adlı Üründen " + teminadet.getText() + " adet Temini İçin İşlem Başlatıldı.\n\n"
                + Arrays.toString(genelMudur.process(personel)));;
    }//GEN-LAST:event_genelmudurbuttonActionPerformed

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
            java.util.logging.Logger.getLogger(StokTemini.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StokTemini.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StokTemini.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StokTemini.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StokTemini().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton depomudurubutton;
    private javax.swing.JButton depopersonelbutton;
    private javax.swing.JButton genelmudurbutton;
    private javax.swing.JButton genelmuduryrdbutton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton satınalmamudurbutton;
    private javax.swing.JTextField teminadet;
    private javax.swing.JTextField teminurun;
    // End of variables declaration//GEN-END:variables
}
