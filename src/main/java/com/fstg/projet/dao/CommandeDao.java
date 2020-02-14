package com.fstg.projet.model.dao;

import java.io.Serializable;

import org.springframework.stereotype.Repository;

import com.fstg.projet.bean.Commande;

@Repository
public interface CommandeDao  extends Serializable{
	public Commande findByRef( String ref);

}
