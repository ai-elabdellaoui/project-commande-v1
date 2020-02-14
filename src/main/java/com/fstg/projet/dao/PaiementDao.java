package com.fstg.projet.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fstg.projet.bean.Paiement;


@Repository
public interface PaiementDao extends JpaRepository<Paiement, Long> {

	public Paiement findByRef(String reference);
}
