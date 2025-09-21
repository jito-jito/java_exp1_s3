package com.exp1_s3.tienda_mascotas.Client.service;

import java.util.List;
import com.exp1_s3.tienda_mascotas.Client.model.ClientModel;

public interface ClientService {
    List<ClientModel> getClients();
    ClientModel getClientById(int id);
    ClientModel createClient(ClientModel client);
    ClientModel updateClient(int id, ClientModel client);
    void deleteClient(int id);
}
