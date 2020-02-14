package com.fstg.projet.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fstg.projet.bean.Produit;

@Repository
public interface ProduitDao extends JpaRepository<Produit, Long> {

	public Produit findByLibelle(String Libelle);
	
}
