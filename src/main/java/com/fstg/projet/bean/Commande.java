/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fstg.projet.bean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author HP
 */
@Entity
public class Commande implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String reference;
    private Double total;
    private Double totalPaye;
    private Double remise;
    
    @OneToMany
    private List<CommandeDetail> commandeDetails;
    @OneToMany
    private List<Produit> produit;
    @OneToMany
    private List<Reception> receptions;

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Double getTotalPaye() {
        return totalPaye;
    }

    public void setTotalPaye(Double totalPaye) {
        this.totalPaye = totalPaye;
    }

    public Double getRemise() {
        return remise;
    }

    public void setRemise(Double remise) {
        this.remise = remise;
    }

    public List<CommandeDetail> getCommandeDetails() {
        return commandeDetails;
    }

    public void setCommandeDetails(List<CommandeDetail> commandeDetails) {
        this.commandeDetails = commandeDetails;
    }

    public List<Produit> getProduit() {
        return produit;
    }

    public void setProduit(List<Produit> produit) {
        this.produit = produit;
    }

    public List<Reception> getReceptions() {
        return receptions;
    }

    public void setReceptions(List<Reception> receptions) {
        this.receptions = receptions;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        if (!(object instanceof Commande)) {
            return false;
        }
        Commande other = (Commande) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    public Commande() {
 super();
    }

    public Commande(Long id, String reference, Double total, Double totalPaye, Double remise, List<CommandeDetail> commandeDetails, List<Produit> produit, List<Reception> receptions) {
        this.id = id;
        this.reference = reference;
        this.total = total;
        this.totalPaye = totalPaye;
        this.remise = remise;
        this.commandeDetails = commandeDetails;
        this.produit = produit;
        this.receptions = receptions;
    }
 
   @Override
    public String toString() {
        return "com.fstg.projet.bean.Commande[ id=" + id + " ]";
    }

}
