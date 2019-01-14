package com.netcracker.model;

import javax.persistence.*;

@Entity
@Table(name="bank")
public class Bank {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idbank", nullable = false)
    private int idBank;

    @Column(name = "bankname", nullable = false)
    private String bankName;

    @Column(name = "city", nullable = false)
    private String city;

    @Column(name = "bic", nullable = false)
    private int bic;

    @Column(name = "coracc", nullable = false)
    private int coracc;

    public Bank() {
    }

    public Bank(String bankName, String city, int bic, int coracc) {
        this.bankName = bankName;
        this.city = city;
        this.bic = bic;
        this.coracc = coracc;
    }

    public int getIdBank() {
        return idBank;
    }

    public void setIdBank(int idBank) {
        this.idBank = idBank;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getBic() {
        return bic;
    }

    public void setBic(int bic) {
        this.bic = bic;
    }

    public int getCoracc() {
        return coracc;
    }

    public void setCoracc(int coracc) {
        this.coracc = coracc;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "idBank=" + idBank +
                ", bankName='" + bankName + '\'' +
                ", city='" + city + '\'' +
                ", bic=" + bic +
                ", coracc=" + coracc +
                '}';
    }
}
