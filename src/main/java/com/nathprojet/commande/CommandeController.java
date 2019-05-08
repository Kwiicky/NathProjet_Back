package com.nathprojet.commande;

import com.nathprojet.commande.dao.CommandeBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by FP13694 on 20/01/2019.
 */
@RestController    // This means that this class is a Controller
@RequestMapping(path="/api/commande")
@CrossOrigin(origins = "*")
public class CommandeController {

    private CommandeService commandeService;

    public CommandeController(CommandeService commandeService) {
        this.commandeService = commandeService;
    }

    @GetMapping()
    @ResponseBody
    public Iterable<CommandeBean> getAll() {
        return commandeService.findAll();
    }

}
