/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fstg.projet.bean;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author HP
 */
@Entity
public class CommandeDetail implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double prix;
    private Double quantiteCmd;
    private Double quantiteReception;
    @ManyToOne 
    private Commande commande;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public Double getQuantiteCmd() {
        return quantiteCmd;
    }

    public void setQuantiteCmd(Double quantiteCmd) {
        this.quantiteCmd = quantiteCmd;
    }

    public Double getQuantiteReception() {
        return quantiteReception;
    }

    public void setQuantiteReception(Double quantiteReception) {
        this.quantiteReception = quantiteReception;
    }

    public Commande getCommande() {
        return commande;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
    }

    public CommandeDetail() {
        super();

    }

    public CommandeDetail(Long id, double prix, Double quantiteCmd, Double quantiteReception, Commande commande) {
        this.id = id;
        this.prix = prix;
        this.quantiteCmd = quantiteCmd;
        this.quantiteReception = quantiteReception;
        this.commande = commande;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CommandeDetail)) {
            return false;
        }
        CommandeDetail other = (CommandeDetail) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.fstg.projet.bean.CommandeDetail[ id=" + id + " ]";
    }

}
