package com.fstg.projet.service.facade;


import java.util.List;

import com.fstg.projet.bean.Commande;

public interface CommandeService {
	public Commande findByRef( String reference);
	public List<Commande> findAll();
	public int save(Commande commande);
        

}
