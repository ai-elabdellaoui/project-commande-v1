package com.fstg.projet.service.facade;


import java.util.List;

import com.fstg.projet.bean.Commande;

public interface CommandeService {
	public Commande findByRef( String ref);
	public List<Commande> findAll();
	public void save(Commande commande);

}
