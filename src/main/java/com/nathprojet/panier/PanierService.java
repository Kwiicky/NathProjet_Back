package com.nathprojet.panier;

import com.nathprojet.panier.dao.PanierBean;
import com.nathprojet.panier.dao.PanierRepository;
import org.springframework.stereotype.Service;

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


}
