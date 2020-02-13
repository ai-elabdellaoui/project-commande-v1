/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fstg.projet.model.dao;

import com.fstg.projet.bean.Magasin;
import java.io.Serializable;
import org.springframework.stereotype.Repository;

/**
 *
 * @author HP
 */
@Repository
public interface MagasinDao extends Serializable{
    public Magasin findByLibelle( String libelle);
}
