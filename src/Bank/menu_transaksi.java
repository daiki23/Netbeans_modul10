/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bank;

/**
 *
 * @author Administrator
 */
public class menu_transaksi extends javax.swing.JFrame {

    int tmp ;
    public menu_transaksi(int e) {
        initComponents();
        this.tmp = e;
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
        pin = new javax.swing.JTextField();
        ee = new javax.swing.JButton();
        satu = new javax.swing.JButton();
        dua = new javax.swing.JButton();
        empat = new javax.swing.JButton();
        enam = new javax.swing.JButton();
        lima = new javax.swing.JButton();
        tujuh = new javax.swing.JButton();
        sembilan = new javax.swing.JButton();
        delapan = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        enol = new javax.swing.JButton();
        ok = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tiga1 = new javax.swing.JButton();
        qq = new javax.swing.JButton();
        ww = new javax.swing.JButton();
        yy = new javax.swing.JButton();
        tt = new javax.swing.JButton();
        rr = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(51, 0, 204));
        jPanel1.setLayout(null);

        pin.setEditable(false);
        pin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pinActionPerformed(evt);
            }
        });
        jPanel1.add(pin);
        pin.setBounds(70, 120, 200, 40);

        ee.setBackground(new java.awt.Color(153, 153, 153));
        ee.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eeActionPerformed(evt);
            }
        });
        jPanel1.add(ee);
        ee.setBounds(310, 280, 40, 30);

        satu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        satu.setText("1");
        satu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                satuActionPerformed(evt);
            }
        });
        jPanel1.add(satu);
        satu.setBounds(70, 190, 60, 60);

        dua.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dua.setText("2");
        dua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                duaActionPerformed(evt);
            }
        });
        jPanel1.add(dua);
        dua.setBounds(140, 190, 60, 60);

        empat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        empat.setText("4");
        empat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empatActionPerformed(evt);
            }
        });
        jPanel1.add(empat);
        empat.setBounds(70, 260, 60, 60);

        enam.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        enam.setText("6");
        enam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enamActionPerformed(evt);
            }
        });
        jPanel1.add(enam);
        enam.setBounds(210, 260, 60, 60);

        lima.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lima.setText("5");
        lima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limaActionPerformed(evt);
            }
        });
        jPanel1.add(lima);
        lima.setBounds(140, 260, 60, 60);

        tujuh.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tujuh.setText("7");
        tujuh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tujuhActionPerformed(evt);
            }
        });
        jPanel1.add(tujuh);
        tujuh.setBounds(70, 330, 60, 60);

        sembilan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sembilan.setText("9");
        sembilan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sembilanActionPerformed(evt);
            }
        });
        jPanel1.add(sembilan);
        sembilan.setBounds(210, 330, 60, 60);

        delapan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        delapan.setText("8");
        delapan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delapanActionPerformed(evt);
            }
        });
        jPanel1.add(delapan);
        delapan.setBounds(140, 330, 60, 60);

        delete.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        delete.setText("DEL");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel1.add(delete);
        delete.setBounds(70, 400, 60, 60);

        enol.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        enol.setText("0");
        enol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enolActionPerformed(evt);
            }
        });
        jPanel1.add(enol);
        enol.setBounds(140, 400, 60, 60);

        ok.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ok.setText("OK");
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });
        jPanel1.add(ok);
        ok.setBounds(210, 400, 60, 60);

        jPanel2.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setText("        Pilih Transaksi ");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(20, -10, 250, 70);

        jPanel2.add(jPanel3);
        jPanel3.setBounds(0, 0, 290, 50);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("<-Tambah Saldo");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(10, 170, 120, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("<- Penarikan");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(10, 90, 120, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("<- Transfer");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(10, 130, 120, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Keluar ->");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(200, 170, 70, 20);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Info Saldo ->");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(190, 90, 90, 20);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(360, 110, 290, 270);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText(" Bank BNI SYARIAH");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(60, 40, 230, 70);

        tiga1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tiga1.setText("3");
        tiga1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tiga1ActionPerformed(evt);
            }
        });
        jPanel1.add(tiga1);
        tiga1.setBounds(210, 190, 60, 60);

        qq.setBackground(new java.awt.Color(153, 153, 153));
        qq.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        qq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qqActionPerformed(evt);
            }
        });
        jPanel1.add(qq);
        qq.setBounds(310, 200, 40, 30);

        ww.setBackground(new java.awt.Color(153, 153, 153));
        ww.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ww.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wwActionPerformed(evt);
            }
        });
        jPanel1.add(ww);
        ww.setBounds(310, 240, 40, 30);

        yy.setBackground(new java.awt.Color(153, 153, 153));
        yy.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        yy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yyActionPerformed(evt);
            }
        });
        jPanel1.add(yy);
        yy.setBounds(660, 280, 40, 30);

        tt.setBackground(new java.awt.Color(153, 153, 153));
        tt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ttActionPerformed(evt);
            }
        });
        jPanel1.add(tt);
        tt.setBounds(660, 240, 40, 30);

        rr.setBackground(new java.awt.Color(153, 153, 153));
        rr.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rrActionPerformed(evt);
            }
        });
        jPanel1.add(rr);
        rr.setBounds(660, 200, 40, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 810, 540);

        setSize(new java.awt.Dimension(811, 570));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pinActionPerformed

    private void eeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eeActionPerformed
        // TODO add your handling code here:
         new tambah_saldo(tmp).setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_eeActionPerformed

    private void satuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_satuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_satuActionPerformed

    private void duaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_duaActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_duaActionPerformed

    private void empatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empatActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_empatActionPerformed

    private void enamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enamActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_enamActionPerformed

    private void limaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limaActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_limaActionPerformed

    private void tujuhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tujuhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tujuhActionPerformed

    private void sembilanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sembilanActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_sembilanActionPerformed

    private void delapanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delapanActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_delapanActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_deleteActionPerformed

    private void enolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enolActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_enolActionPerformed

    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_okActionPerformed

    private void tiga1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tiga1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tiga1ActionPerformed

    private void qqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qqActionPerformed
        // TODO add your handling code here:
  new penarikan(tmp).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_qqActionPerformed

    private void wwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wwActionPerformed
        // TODO add your handling code here:
         new transfer(tmp).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_wwActionPerformed

    private void yyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yyActionPerformed
        // TODO add your handling code here:
   new end().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_yyActionPerformed

    private void ttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ttActionPerformed
        // TODO add your handling code here:
  
    }//GEN-LAST:event_ttActionPerformed

    private void rrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rrActionPerformed
        // TODO add your handling code here:
        new cek_saldo(tmp).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_rrActionPerformed

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
            java.util.logging.Logger.getLogger(menu_transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu_transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu_transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu_transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton delapan;
    private javax.swing.JButton delete;
    private javax.swing.JButton dua;
    private javax.swing.JButton ee;
    private javax.swing.JButton empat;
    private javax.swing.JButton enam;
    private javax.swing.JButton enol;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton lima;
    private javax.swing.JButton ok;
    private javax.swing.JTextField pin;
    private javax.swing.JButton qq;
    private javax.swing.JButton rr;
    private javax.swing.JButton satu;
    private javax.swing.JButton sembilan;
    private javax.swing.JButton tiga1;
    private javax.swing.JButton tt;
    private javax.swing.JButton tujuh;
    private javax.swing.JButton ww;
    private javax.swing.JButton yy;
    // End of variables declaration//GEN-END:variables
}
