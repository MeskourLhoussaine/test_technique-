package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import entites.Client;
import servicesImpl.ClientServicesImpl;


@RestController
@RequestMapping("/api/clients")
//@CrossOrigin(origins = "*")
public class ClientController {

    @Autowired
    private ClientServicesImpl clientServicesImpl;

    @PostMapping("/create")
    public Client createClient(@RequestBody Client client) {
        return clientServicesImpl.createClient(client);
    }

}
