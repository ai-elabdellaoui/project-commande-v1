package com.fstg.projet.ws.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fstg.projet.bean.Magasin;
import com.fstg.projet.service.impl.MagasinServiceImpl;

@RestController
@RequestMapping("stock-sir/Magasin")
public class MagasinRest {
	
	
	@Autowired
	 private MagasinServiceImpl magasinServiceImpl;

	
	@GetMapping("/libelle/{libelle}")
	public Magasin findByLibelle(@PathVariable String libelle) {
		return magasinServiceImpl.findByLibelle(libelle);
	}

	public int hashCode() {
		return magasinServiceImpl.hashCode();
	}

	public boolean equals(Object obj) {
		return magasinServiceImpl.equals(obj);
	}

	public String toString() {
		return magasinServiceImpl.toString();
	}
	
	

}
