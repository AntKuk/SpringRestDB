package com.netcracker.model;

import javax.persistence.*;

@Entity
@Table(name="company")
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcom", nullable = false)
    private int idCom;

    @Column(name = "comname", nullable = false)
    private String companyName;

    @Column(name = "addr", nullable = false)
    private String address;

    @Column(name = "tin", nullable = false)
    private int tin;

    @Column(name = "iec", nullable = false)
    private int iec;

    @Column(name = "tel", nullable = false)
    private int telNumber;

    @Column(name = "email", nullable = false)
    private String email;

    public Company() {
    }

    public Company(String companyName, String address, int tin, int iec, int telNumber, String email) {
        this.companyName = companyName;
        this.address = address;
        this.tin = tin;
        this.iec = iec;
        this.telNumber = telNumber;
        this.email = email;
    }

    public int getIdCom() {
        return idCom;
    }

    public void setIdCom(int idCom) {
        this.idCom = idCom;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getTin() {
        return tin;
    }

    public void setTin(int tin) {
        this.tin = tin;
    }

    public int getIec() {
        return iec;
    }

    public void setIec(int iec) {
        this.iec = iec;
    }

    public int getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(int telNumber) {
        this.telNumber = telNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Company{" +
                "idCom=" + idCom +
                ", companyName='" + companyName + '\'' +
                ", address='" + address + '\'' +
                ", tin=" + tin +
                ", iec=" + iec +
                ", telNumber=" + telNumber +
                ", email='" + email + '\'' +
                '}';
    }
}
