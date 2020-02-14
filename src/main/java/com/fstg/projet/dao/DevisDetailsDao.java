package com.fstg.projet.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fstg.projet.bean.Devis;
import com.fstg.projet.bean.DevisDetail;
import com.fstg.projet.bean.Produit;

@Repository
public interface DevisDetailsDao extends JpaRepository<DevisDetail, Long> {

	public DevisDao findbyDevieEtProduit(Produit produit, Devis devis);
}
