/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fstg.projet.model.dao;

import com.fstg.projet.bean.Reception;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author HP
 */
@Repository
public interface ReceptionDao extends JpaRepository<Reception, Long>{
    public List<ReceptionDao> findByReference(String reference);
}
