package com.fstg.projet.service.facade;

import com.fstg.projet.bean.Magasin;

public interface MagasinService {
    public Magasin findByLibelle( String libelle);
}
