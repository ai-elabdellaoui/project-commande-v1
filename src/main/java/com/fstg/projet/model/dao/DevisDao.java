package com.fstg.projet.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fstg.projet.bean.Devis;

@Repository
public interface DevisDao extends JpaRepository<Devis, Long> {

}
