package com.nathprojet.client;

import com.nathprojet.client.dao.ClientBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.Optional;

/**
 * Created by FP13694 on 20/01/2019.
 */
@RestController    // This means that this class is a Controller
@RequestMapping(path="/api/client")
@CrossOrigin(origins = "*")
public class ClientController {
    private ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @Transactional
    @PutMapping
    public ClientBean update(@RequestBody ClientBean clientBean){
        return clientService.update(clientBean);
    }

    @GetMapping
    @ResponseBody
    public Iterable<ClientBean> getAll(){
        return clientService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<ClientBean> getById(@PathVariable("id") Integer id) {return clientService.getById(id);}



}
