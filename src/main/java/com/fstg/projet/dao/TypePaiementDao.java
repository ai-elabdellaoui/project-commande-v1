package com.fstg.projet.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fstg.projet.bean.TypePaiement;

@Repository
public interface TypePaiementDao extends JpaRepository<TypePaiement, Long> {

	
	
}
