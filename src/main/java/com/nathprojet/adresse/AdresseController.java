package com.nathprojet.adresse;

import com.nathprojet.adresse.dao.AdresseBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.beans.Transient;

@Controller
@RequestMapping(path ="/api/adresse")
@CrossOrigin(origins = "http://localhost:4200")
public class AdresseController {

    private AdresseService adresseService;

    public AdresseController(AdresseService adresseService) {
        this.adresseService = adresseService;
    }

    @Transactional
    @PutMapping
    public AdresseBean update(@RequestBody AdresseBean adresseBean){
        return adresseService.update(adresseBean);
    }

    @GetMapping
    @ResponseBody
    public Iterable<AdresseBean> getAll(){
        return adresseService.getAll();
    }
}
