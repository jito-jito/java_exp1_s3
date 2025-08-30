package com.exp1_s3.tienda_mascotas.Client;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {
    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("/clientes")
    public List<Client> getClients() {
        return clientService.getClients();
    }

    @GetMapping("/clientes/{id}")
    public Client getClientById(@PathVariable int id) {
        return clientService.getClientById(id);
    }
}
