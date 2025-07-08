package servicesImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entites.Client;
import repository.ClientRepository;
import services.ClientServices;

@Service
public class ClientServicesImpl implements ClientServices{

	 @Autowired
	    private ClientRepository clientRepository;

	 @Override
	 public Client createClient(Client client) {
	     System.out.println("Client reçu : " + client.getNom() + " - " + client.getPrenom());

	     // la verification si un client avec le meme nom existe deja 
	     Optional<Client> existing = clientRepository.findByNomIgnoreCase(client.getNom());
	     if (existing.isPresent()) {
	         System.out.println("Client déjà existant avec le nom : " + client.getNom());
	         return existing.get(); 
	     }

	     return clientRepository.save(client);
	 }


	@Override
	public List<Client> getAllClients() {
		// TODO Auto-generated method stub
		return clientRepository.findAll();
	}

	

	@Override
	public Client getClientByNom(String nom) {
	    return clientRepository.findByNom(nom);
	}


	

	
	
	
	
	

}
