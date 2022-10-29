package org.example.ws;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.Date;
@XmlRootElement(name = "Compt")
@XmlAccessorType(XmlAccessType.FIELD)
public class Compt {
    private int code;
    private double solde;
    private Date dateCreation;

    public Compt(int code, double solde, Date dateCreation) {
        this.code = code;
        this.solde = solde;
        this.dateCreation = dateCreation;
    }

    public Compt() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    @Override
    public String toString() {
        return "Compt{" +
                "code=" + code +
                ", solde=" + solde +
                ", dateCreation=" + dateCreation +
                '}';
    }
}
