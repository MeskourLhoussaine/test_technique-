package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import entites.Client;
import repository.ClientRepository;
import servicesImpl.ClientServicesImpl;


@RestController
@RequestMapping("/api/clients")
@CrossOrigin(origins = "*")
public class ClientController {

    @Autowired
    private ClientServicesImpl clientServicesImpl;


    @PostMapping("/create")
    public Client createClient(@RequestBody Client client) {
        return clientServicesImpl.createClient(client);
    }
    

    @GetMapping("/all")
    public List<Client> getAllClients() {
        return clientServicesImpl.getAllClients();
    }
 
    @GetMapping("/nom/{nom}")
    public ResponseEntity<?> getClientByNom(@PathVariable String nom) {
        Client client = clientServicesImpl.getClientByNom(nom);
        if (client != null) {
            return ResponseEntity.ok(client);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Client avec le nom '" + nom + "' introuvable.");
        }
    }
  
}
