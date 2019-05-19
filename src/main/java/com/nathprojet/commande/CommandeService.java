package com.nathprojet.commande;

import com.nathprojet.commande.dao.CommandeBean;
import com.nathprojet.commande.dao.CommandeRepository;
import org.springframework.stereotype.Service;

/**
 * Created by FP13694 on 20/01/2019.
 */
@Service
public class CommandeService {

    private CommandeRepository commandeRepository;

    public CommandeService(CommandeRepository commandeRepository) {
        this.commandeRepository = commandeRepository;
    }

    public Iterable<CommandeBean> findAll(){ return this.commandeRepository.findAll();
  }
}
