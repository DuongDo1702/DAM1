/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;

import DAO.NhanVienDAO;
import MODEL.NhanVien;
import java.util.List;
import javax.swing.JOptionPane;

import javax.swing.JTextField;

/**
 *
 * @author Admin
 */
public class dmksendcode extends javax.swing.JFrame {

    NhanVienDAO daonv = new NhanVienDAO();
    List<NhanVien> lisst = daonv.selectAll();
    String ma = null;

    /**
     * Creates new form DKM
     */
    public dmksendcode(java.awt.Frame parent, boolean modal,JTextField text) {
	
	initComponents();
	ma = text.getText();
	this.setLocationRelativeTo(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog2 = new javax.swing.JDialog();
        txtMKM1 = new javax.swing.JPasswordField();
        txtMK1 = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtmkm = new javax.swing.JPasswordField();
        txtmk = new javax.swing.JPasswordField();

        txtMKM1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMKM1ActionPerformed(evt);
            }
        });

        jButton2.setText("Xác Nhận");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Mật Khẩu Mới");

        jLabel4.setText("Xác Nhận mật Khẩu Mới");

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog2Layout.createSequentialGroup()
                .addGroup(jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialog2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jDialog2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(txtMK1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtMKM1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
            .addGroup(jDialog2Layout.createSequentialGroup()
                .addGroup(jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jDialog2Layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jButton2)))
                .addContainerGap(176, Short.MAX_VALUE))
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtMK1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMKM1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jButton2)
                .addGap(28, 28, 28))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Đổi mật khẩu");

        jLabel2.setText("Xác nhận mật khẩu");

        jButton1.setText("Xác nhận");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(txtmkm, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jButton1)))
                .addContainerGap(76, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(28, 28, 28)
                    .addComponent(txtmk, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(66, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(49, 49, 49)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(txtmkm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(71, 71, 71)
                    .addComponent(txtmk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(126, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMKM1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMKM1ActionPerformed
	// TODO add your handling code here:
    }//GEN-LAST:event_txtMKM1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
	// TODO add your handling code here:
	update();
	System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
	update();
	this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    void update() {
	NhanVien nv = getform();
	String mk2 = new String(txtmkm.getPassword());
	if (!mk2.equals(nv.getMATKHAU())) {
	    JOptionPane.showMessageDialog(this, "Xác nhận mật khẩu không đúng");
	} else {
	    try {
		daonv.updatemk(nv);
		JOptionPane.showMessageDialog(this, "Cập nhật mới thành công");
	    } catch (Exception e) {
		JOptionPane.showMessageDialog(this, "Cập nhật mới thất bại");
	    }
	}
    }

    NhanVien getform() {
	NhanVien nv = new NhanVien();
	nv.setMANV(ma);
	nv.setMATKHAU(new String(txtmk.getPassword()));
	return nv;
    }

    void setform(NhanVien n) {
	txtMK1.setText(n.getMATKHAU());
    }
    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//	/* Set the Nimbus look and feel */
//	//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//	/* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//	 */
//	try {
//	    for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//		if ("Nimbus".equals(info.getName())) {
//		    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//		    break;
//		}
//	    }
//	} catch (ClassNotFoundException ex) {
//	    java.util.logging.Logger.getLogger(DKM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//	} catch (InstantiationException ex) {
//	    java.util.logging.Logger.getLogger(DKM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//	} catch (IllegalAccessException ex) {
//	    java.util.logging.Logger.getLogger(DKM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//	} catch (javax.swing.UnsupportedLookAndFeelException ex) {
//	    java.util.logging.Logger.getLogger(DKM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//	}
//	//</editor-fold>
//
//	/* Create and display the form */
//	java.awt.EventQueue.invokeLater(new Runnable() {
//	    public void run() {
//		new DKM().setVisible(true);
//	    }
//	});
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField txtMK1;
    private javax.swing.JPasswordField txtMKM1;
    private javax.swing.JPasswordField txtmk;
    private javax.swing.JPasswordField txtmkm;
    // End of variables declaration//GEN-END:variables
}
