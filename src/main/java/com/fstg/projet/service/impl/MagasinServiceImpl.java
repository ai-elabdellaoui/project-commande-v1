package com.fstg.projet.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fstg.projet.bean.Magasin;
import com.fstg.projet.dao.MagasinDao;
import com.fstg.projet.service.facade.MagasinService;

@Service
public class MagasinServiceImpl implements MagasinService {
	
	@Autowired
private MagasinDao magasinDao;
	@Override
	public Magasin findByLibelle(String libelle) {
		// TODO Auto-generated method stub
		return magasinDao.findByLibelle(libelle);
		
	}

}
