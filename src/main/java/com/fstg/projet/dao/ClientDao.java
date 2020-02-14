package com.fstg.projet.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ch.qos.logback.core.net.server.Client;

@Repository
public interface ClientDao extends JpaRepository<Client, Long>{

	
	public Client findByCin(String cin);
}
