/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;

import DAO.NhanVienDAO;
import MODEL.NhanVien;
import Utils.Auth;
import Utils.utilityHelper;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class TaikhoanJInternalFrame extends javax.swing.JInternalFrame {

    NhanVienDAO dao = new NhanVienDAO();
    int index;

    /**
     * Creates new form TaikhoanJInternalFrame
     */
    public TaikhoanJInternalFrame() {
	initComponents();
    }
    
    public void load() {
	DefaultTableModel model = (DefaultTableModel) tblbang.getModel();
	model.setRowCount(0);//đưa số dòng về 0 (xóa bảng)
	try {
	    List<NhanVien> list = dao.selectAll();
	    for (NhanVien nv : list) {
		Object[] row = {
		    nv.getMANV(),
		    nv.getHOTEN(),
		    nv.getMATKHAU(),
		    nv.getDIENTHOAI(),
		    nv.isVAITRO() ? "Quản lý" : "Nhân viên"
		};
		model.addRow(row);
	    }
	} catch (Exception e) {
	    e.printStackTrace();
	    JOptionPane.showMessageDialog(this, "Lỗi truy vấn");
	}
    }
    
    void setmodel(NhanVien model) {
	txtmanv.setText(model.getMANV());
	txtHoten.setText(model.getHOTEN());
	txtsdt.setText(model.getDIENTHOAI());
	rdoquanly.setSelected(model.isVAITRO());
	rdonhanvien.setSelected(!model.isVAITRO());
    }
    
    NhanVien getmodel() {
	NhanVien nv = new NhanVien();
	nv.setMANV(txtmanv.getText());
	nv.setHOTEN(txtHoten.getText());
	nv.setDIENTHOAI(txtsdt.getText());
	nv.setVAITRO(rdoquanly.isSelected());
	return nv;
    }

    /*
    param: boolean
    insertable: (true)                                 THÊM NHÂN VIÊN MỚI
        enable: txtMaNV, btnInsert
        disable: btnUpdate, btnDelete, 4 nút điều hướng
    editable: (false) ngược lại                         XEM VÀ SỬA   
    btnClear lúc nào cũng enable
    4 nút điều hướng: disble 2 nút tương ứng khi ở đầu và cuối danh sách
     */
//    void setstatus(boolean inserr) {
//	txtmanv.setEditable(inserr);
//	btnThem.setEnabled(inserr);
//	btnxoa.setEnabled(!inserr);
//	btnsua.setEnabled(!inserr);
//	boolean first = this.index > 0;
//	boolean prve = this.index < this.tblbang.getRowCount() - 1;
//	btndau.setEnabled(!inserr && first);
//	btntruoc.setEnabled(!inserr && first);
//	btncuoi.setEnabled(!inserr && prve);
//	btnsau.setEnabled(!inserr && prve);
//    }
    
    void hoi() {
	int hoi = JOptionPane.showConfirmDialog(this, "Bạn thực sự muốn xóa nhân viên này");
	if (hoi != JOptionPane.YES_NO_OPTION) {
	    return;
	}
    }
    
//    void clear() {
//	this.setmodel(new NhanVien());//xóa trắng form
//	this.setstatus(true);
//    }
    
//    void inserrt() {
//	NhanVien nv = getmodel();
//	try {
//	    dao.insert(nv);
//	    this.load();//cập nhật lại bảng nv
//	    this.clear();
//	    JOptionPane.showMessageDialog(this, "thêm mới thành công");
//	} catch (Exception e) {
//	    e.printStackTrace();
//	    JOptionPane.showMessageDialog(this, "thêm mới thất bại");
//	}
//    }
    
    void update() {
	NhanVien nv = getmodel();
	try {
	    dao.update(nv);
	    this.load();
	    JOptionPane.showMessageDialog(this, "Cập nhật thành công");
	} catch (Exception e) {
	    JOptionPane.showMessageDialog(this, "Cập nhật thất bại");
	}
    }
    
//    void delete() {
//	if (!Auth.ismaneger()) {
//	    JOptionPane.showMessageDialog(this, "Bạn không có quyền xóa người này");
//	}
//	try {
//	    String mavc = txtmanv.getText();
//	    dao.delete(mavc);
//	    this.load();
//	    this.clear();
//	    JOptionPane.showMessageDialog(this, "Xóa thành công");
//	} catch (Exception e) {
//	    JOptionPane.showMessageDialog(this, "Xóa thất bại");
//	}
//    }
     
    void showdetail() {
	try {
	    String manv = (String) tblbang.getValueAt(index, 0);
	    NhanVien nv = dao.selectByID(manv);
	    txtmanv.setText(nv.getMANV());
	    txtHoten.setText(nv.getHOTEN());
	    txtsdt.setText(nv.getDIENTHOAI());
	    if (nv.isVAITRO()) {
		rdoquanly.setSelected(true);
	    } else {
		rdonhanvien.setSelected(true);
	    }
	    tblbang.setRowSelectionInterval(index, index);
	} catch (Exception e) {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtHoten = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btntruoc = new javax.swing.JButton();
        txtsdt = new javax.swing.JTextField();
        btnsau = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btndau = new javax.swing.JButton();
        rdoquanly = new javax.swing.JRadioButton();
        btncuoi = new javax.swing.JButton();
        rdonhanvien = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblbang = new javax.swing.JTable();
        txtmanv = new javax.swing.JTextField();
        txtsdt1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Quản Lý tài khoản");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("Quản Lý Tài Khoản");

        jLabel2.setText("Họ Tên");

        jLabel3.setText("Số Điện Thoại");

        btntruoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/tien.png"))); // NOI18N
        btntruoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntruocActionPerformed(evt);
            }
        });

        btnsau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/lui.png"))); // NOI18N
        btnsau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsauActionPerformed(evt);
            }
        });

        jLabel4.setText("Chức Vụ");

        btndau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/dau.png"))); // NOI18N
        btndau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndauActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdoquanly);
        rdoquanly.setText("Quản lý");

        btncuoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/cuoi.png"))); // NOI18N
        btncuoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncuoiActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdonhanvien);
        rdonhanvien.setText("Nhân viên");

        jLabel5.setText("Mã Nhân Viên");

        tblbang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MÃ nhân viên", "Họ Tên", "Số Điện Thoại", "Chức Vụ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblbang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblbangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblbang);

        jLabel6.setText("Số Điện Thoại");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(jLabel1)
                        .addGap(0, 261, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(29, 29, 29)
                        .addComponent(txtsdt1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(btndau))
                            .addGap(9, 9, 9)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(29, 29, 29)
                                    .addComponent(rdoquanly)
                                    .addGap(38, 38, 38)
                                    .addComponent(rdonhanvien))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnsau)
                                    .addGap(18, 18, 18)
                                    .addComponent(btntruoc)
                                    .addGap(18, 18, 18)
                                    .addComponent(btncuoi)))
                            .addGap(130, 130, 130))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addComponent(txtmanv, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtsdt, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtHoten, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtmanv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtHoten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtsdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtsdt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rdoquanly)
                        .addComponent(rdonhanvien)))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnsau, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btncuoi)
                    .addComponent(btntruoc, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btndau))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public boolean chinhminh(JTextField txt) {
	NhanVien nv = dao.selectByID(txt.getText());
	if (nv.getMANV().equals(Auth.user.getMANV())) {
	    JOptionPane.showMessageDialog(this, "Không được xóa chính mình");
	    return false;
	} else {
	    return true;
	}
	
    }
    private void btntruocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntruocActionPerformed
	// TODO add your handling code here:
	index++;
	showdetail();
    }//GEN-LAST:event_btntruocActionPerformed

    private void btnsauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsauActionPerformed
	// TODO add your handling code here:
	index--;
	showdetail();
    }//GEN-LAST:event_btnsauActionPerformed

    private void btndauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndauActionPerformed
	// TODO add your handling code here:
	index = 0;
	showdetail();
    }//GEN-LAST:event_btndauActionPerformed

    private void btncuoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncuoiActionPerformed
	// TODO add your handling code here:
	index = tblbang.getRowCount() - 1;
	showdetail();
    }//GEN-LAST:event_btncuoiActionPerformed

    private void tblbangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblbangMouseClicked
	// TODO add your handling code here:
	index = tblbang.getSelectedRow();
	showdetail();
    }//GEN-LAST:event_tblbangMouseClicked

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
	// TODO add your handling code here:
	
    }//GEN-LAST:event_formInternalFrameActivated

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
	// TODO add your handling code here:
	load();
	
    }//GEN-LAST:event_formInternalFrameOpened


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncuoi;
    private javax.swing.JButton btndau;
    private javax.swing.JButton btnsau;
    private javax.swing.JButton btntruoc;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdonhanvien;
    private javax.swing.JRadioButton rdoquanly;
    private javax.swing.JTable tblbang;
    private javax.swing.JTextField txtHoten;
    private javax.swing.JTextField txtmanv;
    private javax.swing.JTextField txtsdt;
    private javax.swing.JTextField txtsdt1;
    // End of variables declaration//GEN-END:variables
}
