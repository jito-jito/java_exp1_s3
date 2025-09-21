package com.exp1_s3.tienda_mascotas.Client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.exp1_s3.tienda_mascotas.Client.model.ClientModel;
import com.exp1_s3.tienda_mascotas.Client.service.ClientService;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
public class ClientController {
    @Autowired
    private ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("/clientes")
    public List<ClientModel> getClients() {
        return clientService.getClients();
    }

    @GetMapping("/clientes/{id}")
    public ClientModel getClientById(@PathVariable int id) {
        return clientService.getClientById(id);
    }

    @PostMapping("/clientes")
    public ClientModel createClient(@RequestBody ClientModel client) {
        return clientService.createClient(client);
    }

    @PutMapping("/clientes/{id}")
    public ClientModel updateClient(@PathVariable int id, @RequestBody ClientModel client) {
        return clientService.updateClient(id, client);
    }

    @DeleteMapping("/clientes/{id}")
    public void deleteClient(@PathVariable int id) {
        clientService.deleteClient(id);
    }

}
