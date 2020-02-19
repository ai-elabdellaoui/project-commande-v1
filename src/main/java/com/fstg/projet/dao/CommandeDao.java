package com.fstg.projet.dao;

import org.springframework.stereotype.Repository;

import com.fstg.projet.bean.Commande;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface CommandeDao  extends JpaRepository<Commande, Long>{
	public Commande findByRef( String reference);

}
