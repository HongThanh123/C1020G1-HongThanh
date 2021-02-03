package Model;

import java.util.Date;

public class UserCustomer {
    protected int id;
    protected String name;
    protected String ngay_sinh;
    protected String cmnd;
    protected String sdt;
    protected String email;
    protected String dia_chi;

    public UserCustomer() {
    }

    public UserCustomer(int id, String name, String ngay_sinh, String cmnd, String sdt, String email, String dia_chi) {
        this.id = id;
        this.name = name;
        this.ngay_sinh = ngay_sinh;
        this.cmnd = cmnd;
        this.sdt = sdt;
        this.email = email;
        this.dia_chi = dia_chi;
    }

    public UserCustomer(String name, String ngay_sinh, String cmnd, String sdt, String email, String dia_chi) {
        this.name = name;
        this.ngay_sinh = ngay_sinh;
        this.cmnd = cmnd;
        this.sdt = sdt;
        this.email = email;
        this.dia_chi = dia_chi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNgay_sinh() {
        return ngay_sinh;
    }

    public void setNgay_sinh(String ngay_sinh) {
        this.ngay_sinh = ngay_sinh;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDia_chi() {
        return dia_chi;
    }

    public void setDia_chi(String dia_chi) {
        this.dia_chi = dia_chi;
    }

}
