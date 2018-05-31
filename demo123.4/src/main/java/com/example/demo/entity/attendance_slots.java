package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class attendance_slots {
    @Id
    private int id;
    private String malop;
    private int slotid;
    private String mamonhoc;
    private Date ngaydiemdanh;
    private int status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMalop() {
        return malop;
    }

    public void setMalop(String malop) {
        this.malop = malop;
    }

    public int getSlotid() {
        return slotid;
    }

    public void setSlotid(int slotid) {
        this.slotid = slotid;
    }

    public String getMamonhoc() {
        return mamonhoc;
    }

    public void setMamonhoc(String mamonhoc) {
        this.mamonhoc = mamonhoc;
    }

    public Date getNgaydiemdanh() {
        return ngaydiemdanh;
    }

    public void setNgaydiemdanh(Date ngaydiemdanh) {
        this.ngaydiemdanh = ngaydiemdanh;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
