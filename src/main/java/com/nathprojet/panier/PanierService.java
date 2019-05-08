package com.nathprojet.panier;

import com.nathprojet.panier.dao.PanierBean;
import com.nathprojet.panier.dao.PanierRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Created by FP13694 on 20/01/2019.
 */
@Service
public class PanierService {

    private PanierRepository panierRepository;

    public PanierService(PanierRepository panierRepository){this.panierRepository = panierRepository; }

    public Iterable<PanierBean> getAll(){
        return panierRepository.findAll();
    }

    public void delete(PanierBean panierBean) {
        panierRepository.delete(panierBean);
    }

    public PanierBean create(PanierBean article){
        return this.panierRepository.save(article);
    }

    public PanierBean update(PanierBean article) {return this.panierRepository.save(article); }

    public Optional<PanierBean> getById(String panierBean) {
        return panierRepository.findById(panierBean);
    }

}
