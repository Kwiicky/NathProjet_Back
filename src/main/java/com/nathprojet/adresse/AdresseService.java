package com.nathprojet.adresse;

import com.nathprojet.adresse.dao.AdresseBean;
import com.nathprojet.adresse.dao.AdresseRepository;
import org.springframework.stereotype.Service;

@Service
public class AdresseService {

    private AdresseRepository adresseRepository;

    public AdresseService(AdresseRepository adresseRepository){this.adresseRepository = adresseRepository; }

    public AdresseBean update(AdresseBean adresseBean){
        return adresseRepository.save(adresseBean);
    }

    public Iterable<AdresseBean> getAll(){
        return adresseRepository.findAll();
    }
}
