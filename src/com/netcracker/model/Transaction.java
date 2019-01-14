package com.netcracker.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "transaction")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idtran", nullable = false)
    private int idTran;

    @Column(name = "trandate", nullable = false)
    private Date tranDate;

    //@Column(name = "idseller", nullable = false)
    @ManyToOne
    @JoinColumn(name = "idseller", referencedColumnName = "idcom")
    private Company idSeller;
    //private int idSeller;

    @Column(name = "idcustomer")
    private int idCustomer;

    @Column(name = "total")
    private int total;

    @Column(name = "coracc_sel")
    private int selAcc;

    @Column(name = "coracc_cust")
    private int custAcc;

    public Transaction() {
    }

    public Transaction(Date tranDate, Company idSeller, int idCustomer, int total, int selAcc, int custAcc) {
        this.tranDate = tranDate;
        this.idSeller = idSeller;
        this.idCustomer = idCustomer;
        this.total = total;
        this.selAcc = selAcc;
        this.custAcc = custAcc;
    }

    public int getIdTran() {
        return idTran;
    }

    public void setIdTran(int idTran) {
        this.idTran = idTran;
    }

    public Date getTranDate() {
        return tranDate;
    }

    public void setTranDate(Date tranDate) {
        this.tranDate = tranDate;
    }

    public Company getIdSeller() {
        return idSeller;
    }

    public void setIdSeller(Company idSeller) {
        this.idSeller = idSeller;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getSelAcc() {
        return selAcc;
    }

    public void setSelAcc(int selAcc) {
        this.selAcc = selAcc;
    }

    public int getCustAcc() {
        return custAcc;
    }

    public void setCustAcc(int custAcc) {
        this.custAcc = custAcc;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "idTran=" + idTran +
                ", tranDate=" + tranDate +
                ", idSeller=" + idSeller +
                ", idCustomer=" + idCustomer +
                ", total=" + total +
                ", selAcc=" + selAcc +
                ", custAcc=" + custAcc +
                '}';
    }
}
