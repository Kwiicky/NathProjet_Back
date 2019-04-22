package com.nathprojet.panier;

import com.nathprojet.panier.dao.PanierBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;

/**
 * Created by FP13694 on 20/01/2019.
 */
@RestController    // This means that this class is a Controller
@RequestMapping(path="/api/panier")
@CrossOrigin(origins = "*")
public class PanierController {

    private PanierService panierService;

    public PanierController(PanierService panierService) {
        this.panierService = panierService;
    }

    @GetMapping
    @ResponseBody
    public Iterable<PanierBean> getAll(){
        return panierService.getAll();
    }

    @Transactional
    @DeleteMapping
    public void delete(@RequestBody PanierBean panierBean) {
        panierService.delete(panierBean);
    }

}
