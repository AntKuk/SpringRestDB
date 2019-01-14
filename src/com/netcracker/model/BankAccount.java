package com.netcracker.model;

import javax.persistence.*;

@Entity
@Table(name="bankacc")
public class BankAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "coracc", nullable = false)
    private int corAcc;

    @Column(name = "idbank", nullable = false)
    private int idBank;

    @Column(name = "idcom", nullable = false)
    private int idCom;

    public BankAccount() {
    }

    public BankAccount(int idBank, int tin) {
        this.idBank = idBank;
        this.idCom = tin;
    }

    public int getCorAcc() {
        return corAcc;
    }

    public void setCorAcc(int corAcc) {
        this.corAcc = corAcc;
    }

    public int getIdBank() {
        return idBank;
    }

    public void setIdBank(int idBank) {
        this.idBank = idBank;
    }

    public int getTin() {
        return idCom;
    }

    public void setTin(int tin) {
        this.idCom = tin;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "corAcc=" + corAcc +
                ", idBank=" + idBank +
                ", tin=" + idCom +
                '}';
    }
}
