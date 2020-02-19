package com.fstg.projet.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fstg.projet.bean.Commande;
import com.fstg.projet.dao.CommandeDao;
import com.fstg.projet.service.facade.CommandeService;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class CommandeServiceImpl implements CommandeService{
    @Autowired
    CommandeDao commandeDao;
	@Override
	public Commande findByRef(String ref) {
		
		return  commandeDao.findByRef(ref) ;
	}

	@Override
	public List<Commande> findAll() {
		
		return commandeDao.findAll();
	}

	@Override
	public int save(Commande commande) {
		         return 1;
	}
	

}
