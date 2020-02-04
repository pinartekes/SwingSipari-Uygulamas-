
import java.awt.Color;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.swing.JOptionPane;

public class SiparisUygulamasi extends javax.swing.JFrame {

    Map<String, Integer> siparisler = new LinkedHashMap<String, Integer>();

    public SiparisUygulamasi() {
        initComponents();
        this.getContentPane().setBackground(Color.orange); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        kebap = new javax.swing.JCheckBox();
        beyti = new javax.swing.JCheckBox();
        beyti_sarma = new javax.swing.JCheckBox();
        lahmacun = new javax.swing.JCheckBox();
        ali_nazik = new javax.swing.JCheckBox();
        limonata = new javax.swing.JCheckBox();
        turk_kahvesi = new javax.swing.JCheckBox();
        ayran = new javax.swing.JCheckBox();
        salgam = new javax.swing.JCheckBox();
        su = new javax.swing.JCheckBox();
        makarna = new javax.swing.JCheckBox();
        findik_lahmacun = new javax.swing.JCheckBox();
        humus = new javax.swing.JCheckBox();
        mantar = new javax.swing.JCheckBox();
        salata = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        kabak_tatlisi = new javax.swing.JCheckBox();
        kadayif = new javax.swing.JCheckBox();
        baklava = new javax.swing.JCheckBox();
        kunefe = new javax.swing.JCheckBox();
        dondurmali_helva = new javax.swing.JCheckBox();
        siparis_tamamla = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sipariş Uygulaması");
        setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setText("MENÜ");

        kebap.setText("Adana Kebap - 20 TL");
        kebap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kebapActionPerformed(evt);
            }
        });

        beyti.setText("Beyti - 20 TL");

        beyti_sarma.setText("Beyti Sarma - 25 TL");

        lahmacun.setText("Lahmacun - 10 TL");

        ali_nazik.setText(" Ali Nazik - 30 TL");

        limonata.setText("Limonata - 4 TL");

        turk_kahvesi.setText("Türk Kahvesi - 5 TL");

        ayran.setText("Ayran - 3 TL");

        salgam.setText("Şalgam - 3 TL");

        su.setText("Su - 1 TL");

        makarna.setText("Makarna - 3 TL");

        findik_lahmacun.setText("Fındık Lahmacun - 1 TL");

        humus.setText("Humus - 7 TL");

        mantar.setText("Mantar - 5 TL");

        salata.setText("Salata - 3 TL");

        jLabel2.setText("YEMEK");

        jLabel3.setText("İÇECEK");

        jLabel4.setText("TATLI");

        jLabel5.setText("MEZE");

        kabak_tatlisi.setText("Kabak Tatlısı - 4 TL");

        kadayif.setText("Kadayıf - 3 TL");

        baklava.setText("Baklava ( 4 adet) - 8 TL");

        kunefe.setText("Künefe - 5 TL");

        dondurmali_helva.setText("Dondurmalı Helva - 5 TL");

        siparis_tamamla.setText("Sipariş Tamamla");
        siparis_tamamla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siparis_tamamlaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(siparis_tamamla))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ali_nazik)
                                    .addComponent(lahmacun)
                                    .addComponent(beyti_sarma)
                                    .addComponent(beyti)
                                    .addComponent(kebap)
                                    .addComponent(jLabel2))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(turk_kahvesi)
                                    .addComponent(limonata)
                                    .addComponent(su)
                                    .addComponent(salgam)
                                    .addComponent(ayran))))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(humus)
                            .addComponent(findik_lahmacun)
                            .addComponent(makarna)
                            .addComponent(salata)
                            .addComponent(mantar)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(baklava)
                            .addComponent(kadayif)
                            .addComponent(kabak_tatlisi)
                            .addComponent(dondurmali_helva)
                            .addComponent(kunefe))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(jLabel2))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ayran)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(salgam)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(turk_kahvesi, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(su)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(limonata)
                                        .addGap(23, 23, 23))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(kebap)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(beyti)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(beyti_sarma)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lahmacun)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ali_nazik))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(humus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mantar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(salata)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(makarna)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(findik_lahmacun))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(baklava)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(kunefe)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dondurmali_helva)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(kabak_tatlisi)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(kadayif)))))
                .addGap(18, 18, 18)
                .addComponent(siparis_tamamla)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kebapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kebapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kebapActionPerformed

    public void siparisleriGoster() {
        String message;

        if (siparisler.isEmpty()) {
            message = "Siparişiniz Bulunmamaktadır";
        } else {
            message = "\tSiparişler\n\n";
            int tutar = 0;
            for (Map.Entry<String, Integer> entry : siparisler.entrySet()) {
                message += entry.getKey() + "\n";
                tutar += entry.getValue();
            }
            message += "\nToplam Tutar: " + tutar;
        }

        JOptionPane.showMessageDialog(this, message);
    }
    private void siparis_tamamlaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siparis_tamamlaActionPerformed

        if (kebap.isSelected()) {
            siparisler.put("Adana Kebap", 20);
        } else {
            siparisler.remove("Adana Kebap");
        }
        if (beyti.isSelected()) {
            siparisler.put("Beyti", 20);
        } else {
            siparisler.remove("Beyti");
        }
        if (beyti_sarma.isSelected()) {
            siparisler.put("Beyti Sarma", 25);
        } else {
            siparisler.remove("Beyti Sarma");
        }
        if (lahmacun.isSelected()) {
            siparisler.put("Lahmacun", 10);
        } else {
            siparisler.remove("Lahmacun");
        }
        if (ali_nazik.isSelected()) {
            siparisler.put("Ali Nazik", 30);
        } else {
            siparisler.remove("Ali Nazik");
        }

        if (ayran.isSelected()) {
            siparisler.put("Ayran", 3);
        } else {
            siparisler.remove("Ayran");
        }
        if (salgam.isSelected()) {
            siparisler.put("Şalgam", 3);
        } else {
            siparisler.remove("Şalgam");
        }
        if (su.isSelected()) {
            siparisler.put("Su", 1);
        } else {
            siparisler.remove("Su");
        }
        if (limonata.isSelected()) {
            siparisler.put("Limonata", 4);
        } else {
            siparisler.remove("Limonata");
        }
        if (turk_kahvesi.isSelected()) {
            siparisler.put("Türk Kahvesi", 5);
        } else {
            siparisler.remove("Türk Kahvesi");

        }
        if (humus.isSelected()) {
            siparisler.put("Humus", 7);
        } else {
            siparisler.remove("Humus");
        }
        if (mantar.isSelected()) {
            siparisler.put("Mantar", 5);
        } else {
            siparisler.remove("Mantar");
        }
        if (salata.isSelected()) {
            siparisler.put("Salata", 3);
        } else {
            siparisler.remove("Salata");
        }
        if (makarna.isSelected()) {
            siparisler.put("Makarna", 3);
        } else {
            siparisler.remove("Makarna");
        }
        if (findik_lahmacun.isSelected()) {
            siparisler.put("Fındık Lahmacun", 1);
        } else {
            siparisler.remove("Fındık Lahmacun");

        }
        if (baklava.isSelected()) {
            siparisler.put("Baklava", 8);
        } else {
            siparisler.remove("Baklava");
        }
        if (kunefe.isSelected()) {
            siparisler.put("Künefe", 5);
        } else {
            siparisler.remove("Künefe");
        }
        if (dondurmali_helva.isSelected()) {
            siparisler.put("Dondurmalı Helva", 5);
        } else {
            siparisler.remove("Dondurmalı Helva");
        }
        if (kabak_tatlisi.isSelected()) {
            siparisler.put("Kabak Tatlısı", 4);
        } else {
            siparisler.remove("Kabak Tatlısı");
        }
        if (kadayif.isSelected()) {
            siparisler.put("Kadayıf", 3);
        } else {
            siparisler.remove("Kadayıf");
        }

        siparisleriGoster();
    }//GEN-LAST:event_siparis_tamamlaActionPerformed

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
            java.util.logging.Logger.getLogger(SiparisUygulamasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SiparisUygulamasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SiparisUygulamasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SiparisUygulamasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SiparisUygulamasi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox ali_nazik;
    private javax.swing.JCheckBox ayran;
    private javax.swing.JCheckBox baklava;
    private javax.swing.JCheckBox beyti;
    private javax.swing.JCheckBox beyti_sarma;
    private javax.swing.JCheckBox dondurmali_helva;
    private javax.swing.JCheckBox findik_lahmacun;
    private javax.swing.JCheckBox humus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JCheckBox kabak_tatlisi;
    private javax.swing.JCheckBox kadayif;
    private javax.swing.JCheckBox kebap;
    private javax.swing.JCheckBox kunefe;
    private javax.swing.JCheckBox lahmacun;
    private javax.swing.JCheckBox limonata;
    private javax.swing.JCheckBox makarna;
    private javax.swing.JCheckBox mantar;
    private javax.swing.JCheckBox salata;
    private javax.swing.JCheckBox salgam;
    private javax.swing.JButton siparis_tamamla;
    private javax.swing.JCheckBox su;
    private javax.swing.JCheckBox turk_kahvesi;
    // End of variables declaration//GEN-END:variables
}
