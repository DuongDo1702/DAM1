/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

/**
 *
 * @author Admin
 */
public class LoaiHang {
    private String MALH;
    private String TENLH;

    public LoaiHang(String MALH) {
	this.MALH = MALH;
    }

    public LoaiHang() {
    }

    public LoaiHang(String MALH, String TENLH) {
	this.MALH = MALH;
	this.TENLH = TENLH;
    }

    public String getMALH() {
	return MALH;
    }

    public void setMALH(String MALH) {
	this.MALH = MALH;
    }

    public String getTENLH() {
	return TENLH;
    }

    public void setTENLH(String TENLH) {
	this.TENLH = TENLH;
    }

    public Object getMaLoaiHang() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object getTenMatHang() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void getMaLoaiHang(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void getTenMatHang(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
