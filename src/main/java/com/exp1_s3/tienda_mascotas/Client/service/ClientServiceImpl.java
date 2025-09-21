package com.exp1_s3.tienda_mascotas.Client.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exp1_s3.tienda_mascotas.Client.model.ClientModel;
import com.exp1_s3.tienda_mascotas.Client.repository.ClientRepository;

@Service
public class ClientServiceImpl implements ClientService {
    @Autowired
    private ClientRepository clientRepository;

    @Override
    public List<ClientModel> getClients() {
        return clientRepository.findAll();
    }

    @Override
    public ClientModel getClientById(int id) {
        return clientRepository.findById(id).orElse(null);
    }

    @Override
    public ClientModel createClient(ClientModel client) {
        return clientRepository.save(client);
    }

    @Override
    public ClientModel updateClient(int id, ClientModel client) {
        client.setId(id);
        return clientRepository.save(client);
    }

    @Override
    public void deleteClient(int id) {
        clientRepository.deleteById(id);
    }
}