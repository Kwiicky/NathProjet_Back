package com.nathprojet.client;

import com.nathprojet.client.dao.ClientBean;
import com.nathprojet.client.dao.ClientRepository;
import org.springframework.stereotype.Service;

/**
 * Created by FP13694 on 20/01/2019.
 */
@Service
public class ClientService {
    private ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository){this.clientRepository = clientRepository; }

    public ClientBean update(ClientBean clientBean){
        return clientRepository.save(clientBean);
    }

    public Iterable<ClientBean> getAll(){
        return clientRepository.findAll();
    }
}