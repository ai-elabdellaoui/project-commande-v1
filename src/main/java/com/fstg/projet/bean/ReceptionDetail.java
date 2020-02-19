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
public class ReceptionDetail implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private long qte;
    @ManyToOne
    private Reception reception;
    @ManyToOne
    private Produit produit;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getQte() {
        return qte;
    }

    public void setQte(long qte) {
        this.qte = qte;
    }

    public Reception getReception() {
        return reception;
    }

    public void setReception(Reception reception) {
        this.reception = reception;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    public ReceptionDetail() {
        super();
    }

    public ReceptionDetail(Long id, long qte, Reception reception, Produit produit) {
        this.id = id;
        this.qte = qte;
        this.reception = reception;
        this.produit = produit;
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
        if (!(object instanceof ReceptionDetail)) {
            return false;
        }
        ReceptionDetail other = (ReceptionDetail) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.fstg.projet.bean.ReceptionDetail[ id=" + id + " ]";
    }

}
