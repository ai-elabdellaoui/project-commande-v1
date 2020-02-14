package com.fstg.projet.dao;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.fstg.projet.bean.Magasin;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author HP
 */
@Repository
public interface MagasinDao extends JpaRepository<Magasin, Long>{
    public Magasin findByLibelle( String libelle);
}
