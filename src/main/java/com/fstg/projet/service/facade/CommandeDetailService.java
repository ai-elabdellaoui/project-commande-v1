/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fstg.projet.service.facade;

import com.fstg.projet.bean.Commande;
import com.fstg.projet.bean.CommandeDetail;
import com.fstg.projet.bean.Produit;

/**
 *
 * @author HP
 */
public interface CommandeDetailService {
    
	public CommandeDetail findByCommande(Commande commande);
        public CommandeDetail findByProduit(Produit produit);
}
