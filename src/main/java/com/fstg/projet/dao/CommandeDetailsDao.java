package com.fstg.projet.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fstg.projet.bean.Commande;
import com.fstg.projet.bean.CommandeDetail;
import com.fstg.projet.bean.Produit;

@Repository
public interface CommandeDetailsDao extends JpaRepository<Commande, Long>{

	
	public CommandeDetail findByCmdetPrd(Commande commande,Produit produit);
}
