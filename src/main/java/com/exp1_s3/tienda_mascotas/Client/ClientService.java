package com.exp1_s3.tienda_mascotas.Client;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ClientService {
    private List<Client> clients = new ArrayList<>();

    public ClientService() {
        clients.add(new Client(1, "Juan Perez", "12345678-9"));
        clients.add(new Client(2, "Maria Gomez", "98765432-1"));
        clients.add(new Client(3, "Pedro Martinez", "11111111-1"));
        clients.add(new Client(4, "Ana Torres", "22222222-2"));
        clients.add(new Client(5, "Luis Rodriguez", "33333333-3"));
        clients.add(new Client(6, "Carlos Sanchez", "44444444-4"));
        clients.add(new Client(7, "Laura Martinez", "55555555-5"));
        clients.add(new Client(8, "Javier Lopez", "66666666-6"));
    }

    public List<Client> getClients() {
        return clients;
    }

    public Client getClientById(int id) {
        return clients.stream()
            .filter(client -> client.getId() == id)
            .findFirst()
            .orElse(null);
    }

}