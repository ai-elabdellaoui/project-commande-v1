/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fstg.projet.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author HP
 */
@Entity
public class Devis implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String ref;
    private Date dateDevis;
    private Client client;
    private List<DevisDetail> devisDetails;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public Date getDateDevis() {
        return dateDevis;
    }

    public void setDateDevis(Date dateDevis) {
        this.dateDevis = dateDevis;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<DevisDetail> getDevisDetails() {
        return devisDetails;
    }

    public void setDevisDetails(List<DevisDetail> devisDetails) {
        this.devisDetails = devisDetails;
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
        if (!(object instanceof Devis)) {
            return false;
        }
        Devis other = (Devis) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    public Devis() {
        super();

    }

    public Devis(Long id, String ref, Date dateDevis, Client client, List<DevisDetail> devisDetails) {
        this.id = id;
        this.ref = ref;
        this.dateDevis = dateDevis;
        this.client = client;
        this.devisDetails = devisDetails;
    }

    @Override
    public String toString() {
        return "com.fstg.projet.bean.Devis[ id=" + id + " ]";
    }

}
