package com.nathprojet.panier;

import com.nathprojet.panier.dao.PanierBean;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.Optional;

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

    @Transactional
    @PostMapping()
    @ResponseBody
    public PanierBean create(@RequestBody PanierBean article){
        return panierService.create(article);
    }

    @Transactional
    @PutMapping
    public PanierBean update(@RequestBody PanierBean article) {return panierService.update(article); }

    @GetMapping("/{id}")
    public Optional<PanierBean> getById(@PathVariable("id") String id) {return  panierService.getById(id);}

}
